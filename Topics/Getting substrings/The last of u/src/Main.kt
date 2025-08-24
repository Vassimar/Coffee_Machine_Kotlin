fun main() {
    val string = readln()
    val string1 = string.substringBeforeLast('u')+'u'
    val string2 = string.substringAfterLast('u').uppercase()
    println(string1+string2)
}