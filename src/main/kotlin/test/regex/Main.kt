package test.regex

import generators.generateGrammar
import java.io.File
import java.nio.file.Path

fun main() {
    val dir = "src/main/kotlin/test/regex"
    generateGrammar(dir, "regexGrammar.txt", "test.regex")
    val s = "a*(bc)*|d"
    val tree = RegexParser().parse(s)
    tree.toDot(File(Path.of(dir,"graph.dot").toString()).bufferedWriter())
}

// dot -Tsvg src/main/kotlin/test/regex/graph.dot > src/main/kotlin/test/regex/out.svg