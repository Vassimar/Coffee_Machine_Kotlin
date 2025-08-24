fun main() {
   val (a,b,c,n) = readln().split(" ").map { it.toInt() }
    println(passwordGenerator(a,b,c,n))
}

fun passwordGenerator(a: Int, b: Int, c: Int, n: Int): String {
    val upperCase = ('A'..'Z').joinToString("")
    val lowerCase = ('a'..'z').joinToString("")
    val digits = ('0'..'9').joinToString("")
    val result = StringBuilder()


    fun nextChar(pool: String, last: Char?): Char {
        var ch: Char
        do {
            ch = pool.random()
        } while (ch == last) // avoid consecutive duplicate
        return ch
    }

    var last: Char? = null

    repeat(a) {
        val ch = nextChar(upperCase, last)
        result.append(ch)
        last = ch
    }
    repeat(b) {
        val ch = nextChar(lowerCase, last)
        result.append(ch)
        last = ch
    }
    repeat(c) {
        val ch = nextChar(digits, last)
        result.append(ch)
        last = ch
    }

    // Fill remaining with mixed pool
    val all = upperCase + lowerCase + digits
    while (result.length < n) {
        val ch = nextChar(all, last)
        result.append(ch)
        last = ch
    }

    return result.toString()

}