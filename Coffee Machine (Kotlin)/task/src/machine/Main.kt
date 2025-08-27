package machine

enum class COFFEE(val water: Int, val milk: Int, val beans: Int, val cups: Int, val money: Int) {
    ESPRESSO(250, 0, 16, 1, 4),
    LATTE(350, 75, 20, 1, 7),
    CAPPUCCINO(200, 100, 12, 1, 6)
}

class CoffeeMachine(water: Int, milk: Int, beans: Int, cups: Int, money: Int) {
    private var waterAmount = water
    private var milkAmount = milk
    private var beansAmount = beans
    private var cupsAmount = cups
    private var moneyAmount = money
    fun status() {
        println(
            "The coffee machine has:" +
                    "\n$waterAmount ml of water" +
                    "\n$milkAmount ml of milk" +
                    "\n$beansAmount g of coffee beans" +
                    "\n$cupsAmount disposable cups" +
                    "\n$$moneyAmount of money"
        )


    }

    private fun makeACoffee(type: COFFEE) {
        val missing = mutableListOf<String>()

        if (waterAmount < type.water) missing.add("water")
        if (milkAmount < type.milk) missing.add("milk")
        if (beansAmount < type.beans) missing.add("coffee beans")
        if (cupsAmount < type.cups) missing.add("cups")

        if (missing.isEmpty()) {
            waterAmount -= type.water
            milkAmount -= type.milk
            beansAmount -= type.beans
            cupsAmount -= type.cups
            moneyAmount += type.money
            println("I have enough resources, making you a coffee!")
        } else {
            println("Sorry, not enough ${missing.joinToString(", ")}!")
        }
    }

    fun buy(choice: String) {
        when (choice) {
            "1" -> makeACoffee(COFFEE.ESPRESSO)
            "2" -> makeACoffee(COFFEE.LATTE)
            "3" -> makeACoffee(COFFEE.CAPPUCCINO)

        }

    }

    fun fillMachine() {
        println("Write how many ml of water you want to add: ")
        val waterFill = readln().toInt()
        waterAmount += waterFill
        println("Write how many ml of milk you want to add: ")
        val milkFill = readln().toInt()
        milkAmount += milkFill
        println("Write how many grams of coffee beans you want to add: ")
        val beansFill = readln().toInt()
        beansAmount += beansFill
        println("Write how many disposable cups you want to add: ")
        val cupsFill = readln().toInt()
        cupsAmount += cupsFill

    }

    fun takeMoney() {
        println("I gave you $$moneyAmount")
        moneyAmount = 0

    }
}

fun main() {
    val coffeeMachine = CoffeeMachine(400, 540, 120, 9, 550)
   while(true) {
       println("Write action (buy, fill, take,remaining, exit): ")
           val actionTaken = readln()

       when (actionTaken) {
           "buy" -> {
               println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")
               val choiceToBuy = readln()
               coffeeMachine.buy(choiceToBuy)
           }

           "fill" -> coffeeMachine.fillMachine()
           "take" -> coffeeMachine.takeMoney()
           "remaining" -> coffeeMachine.status()
           "exit" -> break
       }
   }

}
