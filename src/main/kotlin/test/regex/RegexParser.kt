package test.regex
import test.regex.RegexToken.*
import java.text.ParseException

class RegexParser {
    var lex = RegexLexer("")
    
	private fun expr(): exprNode {
		val node = exprNode()
		when (lex.curToken) {
			C, LParen -> {
				val _0 = nonE()
				node.children.add(_0)
			}
			END -> {
				node.children.add(RegexNode("EPS"))
			}
			else -> throw ParseException("Unexpected token", 0)
		}
		return node
	}

	private fun nonE(): nonENode {
		val node = nonENode()
		when (lex.curToken) {
			C -> {
				consume(C)
				val _0 = lex.curToken
				node.children.add(RegexNode(_0.value))
				lex.nextToken()
				val _1 = cont()
				node.children.add(_1)
			}
			LParen -> {
				consume(LParen)
				val _0 = lex.curToken
				node.children.add(RegexNode(_0.value))
				lex.nextToken()
				val _1 = nonE()
				node.children.add(_1)
				consume(RParen)
				val _2 = lex.curToken
				node.children.add(RegexNode(_2.value))
				lex.nextToken()
				val _3 = cont()
				node.children.add(_3)
			}
			else -> throw ParseException("Unexpected token", 0)
		}
		return node
	}

	private fun cont(): contNode {
		val node = contNode()
		when (lex.curToken) {
			C, LParen -> {
				val _0 = nonE()
				node.children.add(_0)
				val _1 = cont()
				node.children.add(_1)
			}
			VERT -> {
				consume(VERT)
				val _0 = lex.curToken
				node.children.add(RegexNode(_0.value))
				lex.nextToken()
				val _1 = nonE()
				node.children.add(_1)
				val _2 = cont()
				node.children.add(_2)
			}
			AST -> {
				consume(AST)
				val _0 = lex.curToken
				node.children.add(RegexNode(_0.value))
				lex.nextToken()
				val _1 = cont()
				node.children.add(_1)
			}
			RParen, C, LParen, AST, END, VERT -> {
				node.children.add(RegexNode("EPS"))
			}
			else -> throw ParseException("Unexpected token", 0)
		}
		return node
	}
    
    fun consume(expected: RegexToken) {
        if (lex.curToken != expected) {
            throw ParseException("Expected " + expected.name, 0)
        }
    }
    
    fun parse(input: String): RegexNode {
        lex = RegexLexer(input)
        lex.nextToken()
        val res = expr()
        if (lex.curToken != END) {
            throw ParseException("Wrong ending", 0)
        }
        return res
    }
}