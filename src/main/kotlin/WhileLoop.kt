import java.util.Scanner //Import Scanner to receive user input.

fun main() {
    //Define variables here.
    val x = Scanner(System.`in`) //Accepting user input.
    print("Enter a number so I will add it up: ") //Adding the user input to 100.

    var numX: Int = x.nextInt() //Reading the user input for the "while" loop.

    val y = Scanner(System.`in`) //Accepting user input.
    print("Choose the desired number target: ") //The desired target number from user input.

    val numY: Int = y.nextInt() //Reading the desired target number from user.

    //Adding up the user input number until the number reach 100.
    while (numX < numY) {
        println(numX)
        numX++
    }
    //println() the final results here.
    println("Your desired number of Y is: $numY")
    print("Final number of variable X: $numX")
}