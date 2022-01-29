package test.regex
import java.io.BufferedWriter
import kotlin.properties.Delegates

open class RegexNode(
    val name: String,
    var value: String = "",
    val children: ArrayList<RegexNode> = ArrayList()
) {
    fun toDot(output: BufferedWriter) {
        output.write("strict graph {" + System.lineSeparator())
        nodeToDot(output)
        output.write("}")
        output.close()
    }

    private fun nodeToDot(output: BufferedWriter) {
        output.write("\t\"" + this + "\" [label=\"" + name + "\"] \n")
        children.forEach {
            output.write("\t\"" + this + "\" -- \"" + it + "\"\n")
        }
        children.forEach { it.nodeToDot(output) }
    }

}
    
class exprNode(): RegexNode("expr") {
}

class nonENode(): RegexNode("nonE") {
}

class contNode(): RegexNode("cont") {
}