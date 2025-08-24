fun main() {
    val s = readLine().orEmpty()
    if (s.isEmpty()) {
        println("")
        return
    }

    val out = StringBuilder()
    var current = s[0]
    var count = 1

    for (i in 1 until s.length) {
        val c = s[i]
        if (c == current) {
            count++
        } else {
            out.append(current).append(count)
            current = c
            count = 1
        }
    }
    // append the last group
    out.append(current).append(count)

    println(out.toString())
}