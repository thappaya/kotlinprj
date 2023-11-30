import java.util.Scanner //Import Scanner to receive user input for integer.
import kotlin.random.Random //Import random number generator from Kotlin library.

fun main() {

    //Defining some variables.
    //RNG from 1 to 5.
    val rand = Random.nextInt(1,5)
    //Receiving user input here.
    val userInput = Scanner(System.`in`)

    //Outputting question here.
    println("Let's play a little game....")
    println("What number between 1 to 5 am I thinking?")
    print("Your answer: ")
    //Reading user input.
    val chosenNum = userInput.nextInt()

    //Using "if...else" function to determine if the user chose the correct number.
    if (rand == chosenNum) {
        println("You're correct!")
        println("The number I chose: $rand")
        print("The number you chose: $chosenNum")
    }
    //If the user's chosen number is not in the valid range.
    else if (chosenNum == 0) {
        print("I said 1 to 5! Try again.")
    }
    else if (chosenNum > 5){
        print("I said 1 to 5! Try again.")
    }
    //If the user's chosen number is incorrect.
    else {
        println("You're wrong!")
        println("The number I chose: $rand")
        print("The number you chose: $chosenNum")
    }

}