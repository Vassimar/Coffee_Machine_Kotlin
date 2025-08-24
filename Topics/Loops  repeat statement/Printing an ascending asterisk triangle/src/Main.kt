// Import for reading user input
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Read the positive integer N
    val n = scanner.nextInt()

    // TODO: Print a triangle with N rows using asterisks ('*')
    // - Each row should have one more asterisk than the previous row
    // - Start with one asterisk in the first row
    repeat(n) {
       
        println("*".repeat(it + 1))
    }
}
