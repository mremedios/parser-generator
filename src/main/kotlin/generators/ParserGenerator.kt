package generators

import entities.Grammar
import entities.NonTerminal
import entities.Terminal
import java.io.BufferedWriter
import java.lang.StringBuilder
import java.nio.file.Files
import java.nio.file.Path

class ParserGenerator(val grammar: Grammar, val dir: String) {

    fun generate(pack: String) {
        generateNodes(pack)

        val filePath = Path.of(dir, grammar.name + "Parser.kt")

        Files.createDirectories(Path.of(dir))

        Files.newBufferedWriter(filePath).use {
            it.write("package $pack")
            it.newLine()
            it.write("import $pack.${grammar.name}Token.*\n")
            writeParser(it)
        }
    }

    fun generateNodes(pack: String) {
        val filePath = Path.of(dir, grammar.name + "Node.kt")

        Files.createDirectories(Path.of(dir))

        Files.newBufferedWriter(filePath).use {
            it.write("package $pack")
            it.newLine()
            it.write(
                """
import java.io.BufferedWriter
import kotlin.properties.Delegates

open class ${grammar.name}Node(
    val name: String,
    var value: String = "",
    val children: ArrayList<${grammar.name}Node> = ArrayList()
) {
    fun toDot(output: BufferedWriter) {
        output.write("strict graph {" + System.lineSeparator())
        nodeToDot(output)
        output.write("}")
        output.close()
    }

    private fun nodeToDot(output: BufferedWriter) {
        output.write("\t\"" + this + "\" [label=\"" + name + "\"] \n")
        children.forEach {
            output.write("\t\"" + this + "\" -- \"" + it + "\"\n")
        }
        children.forEach { it.nodeToDot(output) }
    }

}
    
${writeClasses()}
                """.trimIndent()
            )
        }
    }

    fun writeParser(writer: BufferedWriter) {
        writer.write(
            """
import java.text.ParseException

class ${grammar.name}Parser {
    var lex = ${grammar.name}Lexer("")
    
${grammar.nonTerminals.joinToString("\n\n") { writeFunction(it) }}
    
    fun consume(expected: ${grammar.name}Token) {
        if (lex.curToken != expected) {
            throw ParseException("Expected " + expected.name, 0)
        }
    }
    
    fun parse(input: String): ${grammar.name}Node {
        lex = ${grammar.name}Lexer(input)
        lex.nextToken()
        val res = ${grammar.start}()
        if (lex.curToken != END) {
            throw ParseException("Wrong ending", 0)
        }
        return res
    }
}
        """.trimIndent()
        )
    }

    private fun writeClasses(): String =
        grammar.nonTerminals.joinToString("\n\n") {
            val s = "class ${it.name}Node(): ${grammar.name}Node(\"${it.name}\") {\n"
            val filed = if (it.ret == null) "" else
                    "    var ${cut(it.ret)} by Delegates.notNull()\n"
            s + filed + "}"
        }

    private fun writeFunction(nt: NonTerminal): String {
        val name = nt.name
        val rules = grammar.rules.filter { it.left == name }
        val caseString = StringBuilder()
        var needEps = false
        var epsCode = ""
        rules.forEach {
            val ruleFirst = grammar.constructRuleFirst(it.right, 0)
            needEps = ruleFirst.contains(grammar.EPS)
            val first = ruleFirst - grammar.EPS
            val tokens = first.joinToString(", ") { term -> term.name }
            if (tokens.isNotEmpty()) {
                caseString.append("\t\t\t$tokens -> {\n")
                var counter = 0
                it.right.forEach { arg ->
                    val el = grammar.stringToElement[arg.value]
                    when (el) {
                        is Terminal -> {
                            caseString.append(
                                "\t\t\t\tconsume(${el.name})\n" +
                                        "\t\t\t\tval _$counter = lex.curToken\n" +
                                        "\t\t\t\tnode.children.add(${grammar.name}Node(_$counter.value))\n" +
                                        "\t\t\t\tlex.nextToken()\n"

                            )
                        }
                        is NonTerminal -> {
                            caseString.append(
                                "\t\t\t\tval _$counter = ${el.name}(${cut(arg.args)})\n" +
                                        "\t\t\t\tnode.children.add(_$counter)\n"
                            )

                        }
                        else -> { //code
                            caseString.append(
                                "\t\t\t\t" +
                                        cut(arg.value.replace("$", "node.")) +
                                        "\n"
                            )
                            counter--
                        }
                    }
                    counter++
                }
                caseString.append("\t\t\t}\n")
            } else {
                epsCode = it.right.subList(1, it.right.size).joinToString("\n") { arg->
                    "\t\t\t\t" + cut(arg.value.replace("$", "node."))
                }
            }

        }
        if (needEps) {
            val follow = nt.follow.joinToString(", ") { it.name }
            caseString.append(
                "\t\t\t$follow -> {\n" +
                        "\t\t\t\tnode.children.add(${grammar.name}Node(\"EPS\"))\n" +
                        epsCode +
                        "\t\t\t}\n"
            )
        }
        caseString.append("\t\t\telse -> throw ParseException(\"Unexpected token\", 0)")
        return "\tprivate fun $name(${cut(nt.params)}): ${name}Node {\n" +
                "\t\tval node = ${name}Node()\n" +
                "\t\twhen (lex.curToken) {\n" +
                "$caseString\n" +
                "\t\t}\n" +
                "\t\treturn node\n" +
                "\t}"
    }

    private fun cut(s: String?): String {
        if (s != null && s.length <= 1) return s
        return s?.substring(1, s.length - 1) ?: ""
    }
}