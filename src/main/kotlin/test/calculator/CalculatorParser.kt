package test.calculator
import test.calculator.CalculatorToken.*
import java.text.ParseException

class CalculatorParser {
    var lex = CalculatorLexer("")
    
	private fun e(): eNode {
		val node = eNode()
		when (lex.curToken) {
			Num, LParen -> {
				val _0 = t()
				node.children.add(_0)
				val _1 = ec(_0.res)
				node.children.add(_1)
				node.res = _1.res
			}
			else -> throw ParseException("Unexpected token", 0)
		}
		return node
	}

	private fun ec(x: Int): ecNode {
		val node = ecNode()
		when (lex.curToken) {
			PLUS -> {
				consume(PLUS)
				val _0 = lex.curToken
				node.children.add(CalculatorNode(_0.value))
				lex.nextToken()
				val _1 = t()
				node.children.add(_1)
				val y = x + _1.res
				val _2 = ec(y)
				node.children.add(_2)
				node.res = _2.res
			}
			MINUS -> {
				consume(MINUS)
				val _0 = lex.curToken
				node.children.add(CalculatorNode(_0.value))
				lex.nextToken()
				val _1 = t()
				node.children.add(_1)
				val y = x - _1.res
				val _2 = ec(y)
				node.children.add(_2)
				node.res = _2.res
			}
			RParen, END -> {
				node.children.add(CalculatorNode("EPS"))
				node.res = x			}
			else -> throw ParseException("Unexpected token", 0)
		}
		return node
	}

	private fun t(): tNode {
		val node = tNode()
		when (lex.curToken) {
			Num, LParen -> {
				val _0 = f()
				node.children.add(_0)
				val _1 = tc(_0.res)
				node.children.add(_1)
				node.res = _1.res
			}
			else -> throw ParseException("Unexpected token", 0)
		}
		return node
	}

	private fun tc(x: Int): tcNode {
		val node = tcNode()
		when (lex.curToken) {
			MUL -> {
				consume(MUL)
				val _0 = lex.curToken
				node.children.add(CalculatorNode(_0.value))
				lex.nextToken()
				val _1 = f()
				node.children.add(_1)
				val y = x * _1.res
				val _2 = tc(y)
				node.children.add(_2)
				node.res = _2.res
			}
			DIV -> {
				consume(DIV)
				val _0 = lex.curToken
				node.children.add(CalculatorNode(_0.value))
				lex.nextToken()
				val _1 = f()
				node.children.add(_1)
				val y = x / _1.res
				val _2 = tc(y)
				node.children.add(_2)
				node.res = _2.res
			}
			PLUS, RParen, MINUS, END -> {
				node.children.add(CalculatorNode("EPS"))
				node.res = x			}
			else -> throw ParseException("Unexpected token", 0)
		}
		return node
	}

	private fun f(): fNode {
		val node = fNode()
		when (lex.curToken) {
			LParen -> {
				consume(LParen)
				val _0 = lex.curToken
				node.children.add(CalculatorNode(_0.value))
				lex.nextToken()
				val _1 = e()
				node.children.add(_1)
				consume(RParen)
				val _2 = lex.curToken
				node.children.add(CalculatorNode(_2.value))
				lex.nextToken()
				node.res = _1.res
			}
			Num -> {
				consume(Num)
				val _0 = lex.curToken
				node.children.add(CalculatorNode(_0.value))
				lex.nextToken()
				node.res = _0.value.toInt()
			}
			else -> throw ParseException("Unexpected token", 0)
		}
		return node
	}
    
    fun consume(expected: CalculatorToken) {
        if (lex.curToken != expected) {
            throw ParseException("Expected " + expected.name, 0)
        }
    }
    
    fun parse(input: String): CalculatorNode {
        lex = CalculatorLexer(input)
        lex.nextToken()
        val res = e()
        if (lex.curToken != END) {
            throw ParseException("Wrong ending", 0)
        }
        return res
    }
}