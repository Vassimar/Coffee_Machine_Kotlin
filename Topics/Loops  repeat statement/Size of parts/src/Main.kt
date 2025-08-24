fun main() {
       val n = readln().toInt()
       var resultPositive= 0
        var resultNegative = 0
    var resultZero = 0
       repeat(n){
            val x = readln().toInt()
            when(x){
                0 -> resultZero++
                 1 -> resultPositive++
                -1 -> resultNegative++
                    else -> println("error")
            }
           
       }
      println("$resultZero $resultPositive $resultNegative") 
}
