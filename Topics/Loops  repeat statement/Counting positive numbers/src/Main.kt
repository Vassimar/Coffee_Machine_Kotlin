fun main() {
    var result = 0
    val n = readln().toInt()
    repeat(n){
        if(readln().toInt()>0) result++
    }
    println(result)
}
