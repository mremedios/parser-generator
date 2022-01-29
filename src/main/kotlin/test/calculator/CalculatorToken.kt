package test.calculator

enum class CalculatorToken {
    Num, MUL, PLUS, DIV, MINUS, LParen, RParen, END;
    
    var value: String = ""
}