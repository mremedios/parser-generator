import org.junit.Assert.assertEquals
import kotlin.test.assertFailsWith
import org.junit.Test
import test.regex.RegexLexer
import test.regex.RegexNode
import test.regex.RegexParser
import java.text.ParseException
import test.regex.RegexToken.*

class Test {

    // Print only leaves
    fun RegexNode.toRegex(): String {
        return if (children.isEmpty()) {
            if (this.name != "EPS") name else ""
        }
        else children.joinToString("") { it.toRegex() }
    }

    @Test
    fun `LexicalAnalyzer test`() {
        val tokens = listOf(
            "" to listOf(END),
            "a" to listOf(C, END),
            "s|(d)*e" to listOf(C, VERT, LParen, C, RParen, AST, C, END)
        )
        tokens.forEach {
            val lex = RegexLexer(it.first)
            lex.nextToken()
            for (i in it.first.indices) {
                assert(lex.curToken == it.second[i])
                lex.nextToken()
            }
        }

    }

    @Test
    fun `Simple tests`() {
        val strings = listOf("c")
        strings.forEach {
            val tree = RegexParser().parse(it)
            assertEquals(it, tree.toRegex())
        }

    }

    @Test
    fun `One operation tests`() {
        val strings = listOf("ab", "c|d", "e*", "(c)")
        strings.forEach {
            val tree = RegexParser().parse(it)
            assertEquals(it, tree.toRegex())
        }
    }

    @Test
    fun `Random tests`() {
        val strings = listOf(
            "((ddf*t|c)*ad(cc|we*)q)*",
            "df*(c|c)*",
            "d(g)|c",
            "ccccccccccccccccccccccccccccccccc",
            "(((c)))",
            "(g)(h)|(d)|(c)|(t)|(e)",
            "(c*c*c*c*)*c",
            "c(c)*cc(c(r(c(e)*c*(t))*c*i)o)p*"
        )
        strings.forEach {
            val tree = RegexParser().parse(it)
            assertEquals(it, tree.toRegex())
        }
    }

    @Test
    fun `Error LexicalAnalyzer tests`() {
        val strings = listOf(
            "2",
            "avsFdsv",
            "fdv&v",
            "vdfv#"
        )
        strings.forEach {
            assertFailsWith<ParseException> { RegexParser().parse(it) }
        }
    }

    @Test
    fun `Error RegexParser tests`() {
        val strings = listOf(
            "x||x",
            ")c(",
            "(j))",
            "wwef(reb",
            "defj)vf",
            "|dfv",
            "rvv|",
            "*dfv",

            )
        strings.forEach {
            assertFailsWith<ParseException> { RegexParser().parse(it) }
        }
    }
}