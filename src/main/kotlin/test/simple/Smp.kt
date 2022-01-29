package test.simple

import SimpleLexer

fun main() {
    val x = SimpleLexer("25;35;")
    while (true) {
        x.nextToken()
        println(x.curToken.name + ":" + x.curToken.value)
        if (x.curToken == Token.END) break
    }
}