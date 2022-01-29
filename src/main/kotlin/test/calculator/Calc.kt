package test.calculator

import generators.generateGrammar
import test.regex.RegexParser
import java.io.File
import java.nio.file.Path

fun main() {
    val dir = "src/main/kotlin/test/calculator/"
    generateGrammar(dir, "calcGrammar.txt", "test.calculator")
    val s = "a*(bc)*|d"
    val tree = RegexParser().parse(s)
    tree.toDot(File(Path.of(dir, "graph.dot").toString()).bufferedWriter())
}
// dot -Tsvg src/main/kotlin/test/calculator/graph.dot > src/main/kotlin/test/calculator/out.svg