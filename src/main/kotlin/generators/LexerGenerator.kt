package generators

import entities.Grammar
import java.io.BufferedWriter
import java.nio.file.Files
import java.nio.file.Path

class LexerGenerator(val grammar: Grammar, val dir: String) {

    fun generate(pack : String) {
        val filePath = Path.of(dir, grammar.name + "Lexer.kt")

        Files.createDirectories(Path.of(dir))

        Files.newBufferedWriter(filePath).use {
            it.write("package $pack")
            it.newLine()
            writeLexer(it)
        }
    }

    private fun writeLexer(writer: BufferedWriter) {
        writer.write("""
import java.text.ParseException
import java.util.regex.Matcher
import java.util.regex.Pattern
           
class ${grammar.name}Lexer(str: String) {
    private var input: StringBuilder = StringBuilder(str)
    private var matcher: Matcher = Pattern.compile("").matcher(input);
    private val ignore: Pattern = Pattern.compile("([ \t\n\r]+)")
    lateinit var curToken: ${grammar.name}Token
        private set
    val tokens = mapOf(${getTokens()}
    )
        
    private fun skipWhiteSpace() {
        matcher.usePattern(ignore);
        while (matcher.lookingAt()) {
            input = input.delete(0, matcher.end());
            matcher.reset(input);
        }
    }

    fun nextToken() {
        skipWhiteSpace()

        if (input.isEmpty()) {
            curToken = ${grammar.name}Token.END
            return
        }

        tokens.forEach { (token, pattern) ->
            matcher.usePattern(pattern)
            matcher.reset(input)
            if (matcher.lookingAt()) {
                val parsed = matcher.group()
                curToken = token
                curToken.value = parsed
                input.delete(0, matcher.end())
                matcher.reset(input)
                return
            }
        }

        throw ParseException("Illegal character" + input[0], 0)
    }    
}

        """.trimIndent())
    }

    private fun getTokens(): String =
        grammar.terminals.joinToString(",") {
            "\n\t\t${grammar.name}Token.${it.name} to Pattern.compile(${it.regex})"
        }
}