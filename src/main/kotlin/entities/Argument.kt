package entities

class Argument(val value: String) {
   var args: String? = ""

    constructor(value: String, args: String?) : this(value) {
        this.args = args
    }
}