import java.util.Scanner //Import Scanner to receive user input for integer.

fun main() {

    //Read input of the first desired number.
    val x = Scanner(System.`in`)
    print("Input the first number: ")
    val firstNum: Int = x.nextInt()

    //Reading the operator.
    //We can read it as a "string", because we are using a "while" loop for function.
    //No need for Scanner here.
    print("Input your desired operator: ")
    val exp = readln()

    //Read input of the second desired number.
    val y = Scanner(System.`in`)
    print("Input the second number: ")
    val secondNum: Int = y.nextInt()

    //Defining function for a calculator.
    when (exp) {
        "+" -> { //Addition.
            print("Addition answer: ")
            print(firstNum + secondNum)
        }

        "-" -> { //Subtraction.
            print("Subtraction answer: ")
            print(firstNum - secondNum)
        }

        "*" -> { //Multiplication.
            print("Multiplication answer: ")
            print(firstNum * secondNum)
        }

        "/" -> { //Division.
            print("Division answer: ")
            print(firstNum / secondNum)
        }

        "%" -> { //Modulus (Returns the division remainder).
            print("Modulus answer: ")
            print(firstNum % secondNum)
        }

        else -> { //For anything else that is not a valid operator.
            println("ERROR!!!!")
        }
    }


}