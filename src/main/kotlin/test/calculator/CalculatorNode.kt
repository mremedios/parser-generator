package test.calculator
import java.io.BufferedWriter
import kotlin.properties.Delegates

open class CalculatorNode(
    val name: String,
    var value: String = "",
    val children: ArrayList<CalculatorNode> = ArrayList()
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
    
class eNode(): CalculatorNode("e") {
    var res: Int by Delegates.notNull()
}

class ecNode(): CalculatorNode("ec") {
    var res: Int by Delegates.notNull()
}

class tNode(): CalculatorNode("t") {
    var res: Int by Delegates.notNull()
}

class tcNode(): CalculatorNode("tc") {
    var res: Int by Delegates.notNull()
}

class fNode(): CalculatorNode("f") {
    var res: Int by Delegates.notNull()
}