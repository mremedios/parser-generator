package generators

import entities.Grammar
import entities.Terminal
import java.nio.file.Files
import java.nio.file.Path

class TokensGenerator(val grammar: Grammar, val dir: String) {

    fun generate(pack: String) {
        val filePath = Path.of(dir, grammar.name + "Token.kt")

        Files.createDirectories(Path.of(dir))

        Files.newBufferedWriter(filePath).use { writer ->
            writer.write("package $pack")
            writer.newLine()

            writer.write("""
                
                enum class ${grammar.name}Token {
                    ${grammar.terminals.joinToString { it.name }}, END;
                    
                    var value: String = ""
                }
            """.trimIndent())
        }
    }
}

