import java.util.Scanner //Import Scanner from Java to receive user input as integer.

fun main(){
    //"If" and "Else" are conditionals to the statement and for the function.
    //Often used in many programming language.
    //For Kotlin:

    //Define function.
    val x = Scanner(System.`in`)
    print("Enter value of X: ")
    //Let user input the value of X.

    val valueX: Int = x.nextInt() //Read the user input.

    val y = Scanner(System.`in`)
    print("Enter value of Y: ")
    //Let user input the value of Y.

    val valueY: Int = y.nextInt() //Read the user input.

    //Logic here.
    //If Else function:
    //Declaring that if the variable X is greater, print the string and compare both.
    if (valueX > valueY){
        println("X is greater, the value of X is: " + valueX)
        println("Y value is: " + valueY)
    }
    //If the value of X and Y are the same, print the following text.
    if (valueX == valueY){
        println("Both X and Y has the same value, which is: " + valueX + " and " + valueY)
    }
    //For anything else, do the following (in this case, if x < y).
    else {
        println("Y is greater, the value of Y is: " + valueY)
        println("X value is: " + valueX)
    }

}