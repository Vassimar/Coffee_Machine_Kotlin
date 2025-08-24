fun main () {
    val input = readln()
    val count = input.count { it.equals('G', ignoreCase = true)|| it.equals('c', ignoreCase = true) }.toDouble()
    val result = count/input.length*100
    println(result)
}