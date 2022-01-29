package entities

class NonTerminal(
    val name: String,
    val params: String?,
    val ret: String?
) : Element {
    val first: MutableSet<Terminal> = HashSet()
    val follow: MutableSet<Terminal> = HashSet()
}