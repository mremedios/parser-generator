package generators

import generated.UserGrammarLexer
import generated.UserGrammarParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.nio.file.Paths
import kotlin.io.path.Path

fun generateGrammar(pack: String, gram: String, packPostfix: String) {
    val filename = Path(pack, gram).toString()
    val lexer = UserGrammarLexer(CharStreams.fromFileName(filename))
    val tokens = CommonTokenStream(lexer)
    val parser = UserGrammarParser(tokens)

    val grammar = parser.buildGrammar().grammar
    TokensGenerator(grammar, pack).generate(packPostfix)
    LexerGenerator(grammar, pack).generate(packPostfix)

    grammar.construct()

    ParserGenerator(grammar, pack).generate(packPostfix)

//    println("FIRST")
//    grammar.nonTerminals.forEach{
//        print(it.name + " :  ")
//        it.first.forEach { term -> print(term.regex + " ") }
//        println()
//    }
//
//    println("FOLLOW")
//    grammar.nonTerminals.forEach{
//        print(it.name + " :  ")
//        it.follow.forEach { term -> print(term.regex + " ") }
//        println()
//    }
}