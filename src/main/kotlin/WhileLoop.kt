import java.util.Scanner //Import Scanner from Java to receive user input.

fun main() {
    //Define variables here.
    val x = Scanner(System.`in`) //Accepting user input.
    print("Enter a number so I will add it up: ") //Adding the user input to match the desired number.

    var numX: Int = x.nextInt() //Reading the user input for the "while" loop.

    val y = Scanner(System.`in`) //Accepting user input.
    print("Choose the desired number target: ") //The desired target number from user input.

    val numY: Int = y.nextInt() //Reading the desired target number from user.

    val startingX = numX //Taking the user input of X number before the "while" loop.
    //Done to later print the starting number in the output.

    //Adding up the user input number (X) until the number reach the desired user input (Y) number.
    while (numX < numY) {
        println(numX)
        numX++
    }
    //println() the final results here.
    println("Your desired number of Y is: $numY")
    println("Your starting X number is: $startingX")
    print("Final number of variable X: $numX")
    //Programming is hard, but we will get there, eventually...
}