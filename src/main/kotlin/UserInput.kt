fun main(){
    //If the input from the user is a String:
    //Define some questions.
    println("What is the capital city of Thailand?")
    print("Your answer: ")
    val userText = readln() //Read user input as String (no need to import java.util.Scanner for this).

    //Define some simple logic.
    //Both "when" and "if...else" can be used, however in this case, "when" is cleaner and more optimized.
    //Correct answers for the question should be "Bangkok", both with capital and non-capital letter.
    when (userText) {
        "Bangkok" -> {
            print("Correct!")
        }
        "bangkok" -> {
            print("Correct!")
        }
        else -> {
            print("Oops, try again later.")
        }
    }
}