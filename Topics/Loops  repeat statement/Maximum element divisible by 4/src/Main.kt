fun main() {
    var result = 0
    val n =readln().toInt()
    if (n>1000) println("wrong input") else {
        repeat(n){
            val y = readln().toInt()
            if (y % 4 == 0 && y>result ) result = y  
            
        }
        println(result)
    }
}
