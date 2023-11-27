import java.util.Scanner //Import Scanner from Java to receive user input.

fun main(){
    val userInput = Scanner(System.`in`) //Accepting user input.
    println("There is 10 valid numbers out of 15 possible numbers in this array.")//Defining a question.
    print("Choose a random number between 0-15: ")
    val chosenNum: Int = userInput.nextInt() //Read the user input.

    val randomNum = arrayOf(1,2,3,4,6,7,9,11,13,14) //Defining an array of random numbers.

    //Defining some logic.
    //If the user input matches the number in the array, output the following.
    if (chosenNum in randomNum){
        println("Let's see if your chosen number is in the array....")
        println("Number you've chosen: $chosenNum")
        print("It exists!!! Congratulations!!!")
    }
    //For anything else (in this case, the user input does not match any number in the array), output the following.
    else {
        println("Let's see if your chosen number is in the array....")
        println("Number you've chosen: $chosenNum")
        print("You lose!!!")
    }
}