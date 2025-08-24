import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    // input temperature in Fahrenheit
    val temperature: Int = scan.nextLine().trim().toInt()
    when(temperature) {
        in 86..Int.MAX_VALUE -> println("High temperature")
        in 50..85 -> println("Normal temperature")
        in Int.MIN_VALUE..49 -> println("Low temperature")

    }


}