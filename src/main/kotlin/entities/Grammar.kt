package entities

import java.text.ParseException

class Grammar(
    val name: String,
    val start: String,
    val terminals: ArrayList<Terminal>,
    val nonTerminals: ArrayList<NonTerminal>,
    val rules: ArrayList<Rule>
) {
    val EPS = Terminal("EPS", "\"_\"")
    val END = Terminal("END", "$")

    val stringToElement: Map<String, Element> = makeMap()

    private fun makeMap(): Map<String, Element> {
        val mp: HashMap<String, Element> = HashMap()
        nonTerminals.map { mp[it.name] = it }
        terminals.map { mp[it.name] = it }
        mp["_"] = EPS
        return mp
    }

    fun constructFirst() {
        var changed = true
        while (changed) {
            changed = false
            rules.forEach {
                val nt = stringToElement[it.left] as NonTerminal
                val sz = nt.first.size

                nt.first += constructRuleFirst(it.right, 0)

                if (nt.first.size != sz) changed = true
            }
        }
    }

    fun constructRuleFirst(right: ArrayList<Argument>, ind: Int): Set<Terminal> {
        if (ind >= right.size) return emptySet()
        val alp = stringToElement[right[ind].value]
        return when (alp) {
            is Terminal -> setOf(alp)
            is NonTerminal -> {
                val res = alp.first
                if (res.contains(EPS)) {
                    res += constructRuleFirst(right, ind + 1)
                }
                res
            }
            else -> emptySet() // code
        }
    }

    fun constructFollow() {
        if (!stringToElement.containsKey(start)) throw ParseException(
            "Incorrect start node",
            0
        )
        (stringToElement[start] as NonTerminal).follow += END
        var changed = true
        while (changed) {
            changed = false
            rules.forEach {
                val left = stringToElement[it.left] as NonTerminal
                for (i in it.right.indices) {
                    if (constructRuleFollow(left, it.right, i)) {
                        changed = true
                    }
                }
            }
        }
    }

    fun constructRuleFollow(
        left: NonTerminal,
        right: ArrayList<Argument>,
        ind: Int
    ): Boolean {
        val nt = stringToElement[right[ind].value]
        if (nt is NonTerminal) {
            val sz = nt.follow.size
            val fstG = constructRuleFirst(right, ind + 1)
            nt.follow += (fstG - EPS)
            if (fstG.contains(EPS) || fstG.isEmpty()) {
                nt.follow += left.follow
            }
            if (nt.follow.size != sz) return true
        }
        return false
    }

    fun construct() {
        constructFirst()
        constructFollow()
    }

}