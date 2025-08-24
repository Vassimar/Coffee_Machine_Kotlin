enum class Rainbow(val color: String) {
    RED("Red"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue"),
    INDIGO("Indigo"),
    VIOLET("Violet")
}
fun main() {
    val color = readln()
    for (colors in Rainbow.entries){
        if (color.uppercase() == colors.name){
            println(colors.ordinal+1)
        }
    }
}