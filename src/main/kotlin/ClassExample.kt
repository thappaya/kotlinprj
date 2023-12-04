//Main function here.
fun main() {
    //Do not forget to call the class.
    val artura = Artura() //Here.
    println("What info about Artura do you want to know?")
    print("Name/Age/4D Name/All: ")
    val userInput = readln()

    //Printing the element in the class
    when (userInput) {
        "Name" -> {
            print("Full Name: ${artura.fullName}")
        }
        "Age" -> {

            print("Age: ${artura.age}")
        }
        "4D Name" -> {
            print("Also known as: ${artura.theNameIn4D}")
        }
        "All" -> {
            artura.printAll()
        }
    }
}
//Class is here.
class Artura {
    var fullName: String = "Thappaya Wangsantiporn"
    var age: Int = 21
    var theNameIn4D: String = "4D ARTURA"

    //This is just for printing all data in the case that userInput = "All".
    fun printAll() {
        println("Name: $fullName")
        println("Age: $age")
        print("Also known as: $theNameIn4D")
    }
}