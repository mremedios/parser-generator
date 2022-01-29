import generated.UserGrammarLexer
import generated.UserGrammarParser
import generators.LexerGenerator
import generators.ParserGenerator
import generators.TokensGenerator
import generators.generateGrammar
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun main()  {
    generateGrammar("src/main/kotlin/test/regex", "regexGrammar.txt", "test.regex")
//    generateGrammar("src/main/kotlin/test/calculator", "calcGrammar.txt")
}
