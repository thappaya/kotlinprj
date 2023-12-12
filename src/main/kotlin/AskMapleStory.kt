//A fun little program to determine your journey in MapleStory.
//Created in my lone time in class (12/12/2023).
import kotlin.random.Random //RNG, again.

fun main() {
    //Calling the class (items).
    val itemList = Items()

    //Questions.
    println("This program will randomize what you should prioritize on upgrading in MapleStory.")
    println("All abroad the grinding train!")
    println("Wanna activate the program?")
    print("Your answer (Y/N): ")
    val ans = readln() //Reading user input

    val diceRoll = Random.nextInt(1,7)

    //"when" loop with logics inside (I N C E P T I O N).
    when (ans) {
        "yes", "Yes", "y", "Y" -> {
            println("Let's see what will come up....")
            when (diceRoll) {
                1 -> println("You should prioritize ${itemList.items[0]}.")
                2 -> println("You should prioritize ${itemList.items[1]}.")
                3 -> println("You should prioritize ${itemList.items[2]}.")
                4 -> println("You should prioritize ${itemList.items[3]}.")
                5 -> println("You should buy ${itemList.items[4]} items.")
                6 -> println("You should prioritize ${itemList.items[5]}.")
                7 -> println("Keep farming bro!")
            }
            print("Good luck!")
        }
        //Declining the program (why though?).
        "no", "No", "n", "N" -> {
            print("Onwards the journey to Lv.260!")
        }
        //Anything else.
        else -> {
            print("ERR_001: Brain not found.")
        }
    }
}
//Item(s) class are here.
open class Items {
    val items = arrayOf("Clothing", "Armor", "Weapon", "Stats", "Cash", "Decoration")
}