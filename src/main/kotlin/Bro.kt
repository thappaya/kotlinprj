import java.util.Scanner

fun main() {
    println("Authorized Vault-Tec personnel only!!!")
    print("Enter name: ")
    val nm = readln()
    val id = Scanner(System.`in`)
    print("Enter ID: ")
    val enter = id.nextInt()

    val bro1 = Bros(nm, enter)
    val bro2 = Bros("Artura", 69)

    println(bro1)
    println(bro2)

    if (bro1 == bro2) {
        print("Access granted!")
    }
    else {
        print("Access denied!")
    }
}
//If you want to compare only the data above, use "data" class.
data class Bros(var name: String, var id: Int)
//No need for "{}".