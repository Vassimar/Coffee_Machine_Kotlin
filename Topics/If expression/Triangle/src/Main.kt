fun main() {
    val a = readln().toUInt()
    val b = readln().toUInt()
    val c = readln().toUInt()
    when(true){
        ((a+b>c)&&(b+c>a)&& (a+c>b)) -> println("YES")
        else -> println("NO")

    }
}