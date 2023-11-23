fun main() {
    //Defining data types.
    //Note: Defining type (ex. val varName: varType () is optional.
    //Kotlin is smart enough to know var types.
    //Remember! If you define "val", the data cannot be modified/changed.
    //If you want to modify the data later, always use "var"!!!

    //For integers:
    val byte: Byte = 99 //Max = -100 to 100
    val short: Short = 5000 //Max = -32768 to 32767
    val integer: Int = 2147483647 //Max = -2,147,483,647 to 2,147,483,647 (int = Max possible 32-bit integer).
    val long: Long = 15000000000L //Max = -9,223,372,036,854,775,807 to 9,223,372,036,854,775,807
    //For Long varType, defining L at the end is optional.

    //For floating point (decimal numbers, scientific number(e for power of 10), factorial):
    val floating: Float = 3.14159F //For 6 to 7 decimal units, must end with F (Not displaying F in print).
    val double: Double = 3.14159265 //For up to 15 decimal units, no need for ending letter.

    //For Boolean (True or False):
    val boo: Boolean = true //true or false.

    //For characters and text:
    val character: Char = 'A' //For single letter.
    val longText: String = "Hello World!" //For string of text (Same as Java).
    //Note: Cannot use ASCII values to display certain characters (will cause an error).

    //For arrays (I, M, G, A, Y, etc.):
    val t1roster = arrayOf("Faker", "Keria", "Oner", "Gumayasi", "Zeus")
    val randomNum = arrayOf(0,1,2,3,4,5,6,7,8,9,10)
    //Note: Arrays only allow single varTypes in the array.

    //println all of them for fun.
    print("Byte = ")
    println(byte)
    print("Short = ")
    println(short)
    print("Integer = ")
    println(integer)
    print("Long = ")
    println(long)
    print("Float = ")
    println(floating)
    print("Double = ")
    println(double)
    print("Boolean = ")
    println(boo)
    print("Char = ")
    println(character)
    print("String = ")
    println(longText)
    print("Arrays: ")
    print(t1roster[0])
    print(", ")
    println(randomNum[2])
    print("The more you know...")
    //We are all here again aren't we?
}