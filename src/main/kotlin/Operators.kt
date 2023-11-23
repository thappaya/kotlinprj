fun main() {
    //Operators are used for addition, subtraction, etc.
    //Note: Both "var" and "val can be used depending on if the value will be modified or not.

    //Addition.
    val add = 100 + 50
    val add2 = add + 50

    //Subtraction.
    val subtract = 100 - 50
    val sub2 = subtract - 50

    //Multiplication.
    val multiply = 12 * 5
    val multi2 = multiply * 3

    //Division
    val divide = 144 / 12
    val div2 = divide / 2

    //Modulus (return the remainder in the division).
    val modulus = 121 % 5

    //Increment (increase by 1).
    //Note: In this case, variable "increase" is being modified, so "val" cannot be used.
    var increase = 2
    ++increase

    //Decrement (decrease by 1).
    var decrease = 10
    --decrease

    //END OF DECLARATION

    //Let's print!
    println("Addition: " + add)
    println("Subtraction: " + subtract)
    println("Multiplication: " + multiply)
    println("Division: " + divide)
    println("Modulus: " + modulus)
    println("Increment: " + increase)
    println("Decrement: " + decrease)
}