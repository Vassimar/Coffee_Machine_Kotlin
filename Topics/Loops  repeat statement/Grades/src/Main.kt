fun main() {
   val n = readln().toInt()
   var ammountA = 0
    var ammountD = 0
    var ammountC = 0
    var ammountB = 0
   repeat(n){
       when(readln().toInt()){
           2 -> ammountD++
           3 -> ammountC++
           4 -> ammountB++
           5 -> ammountA++
           else -> println("error")
           
   }
       
}
   println("$ammountD $ammountC $ammountB $ammountA")
}
