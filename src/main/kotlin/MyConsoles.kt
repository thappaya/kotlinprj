import java.util.Scanner //Receiving user input.

fun main() {
    //Call for class.
    val con1 = Models()
    val con2 = Models()
    val con3 = Models()
    val con4 = Models()
    val con5 = Models()
    val naming = BigboiClass()
    val conTyp = BigboiClass()
    val theCPU = BigboiClass()

    //Objects lie here.
    con1.conBrand = naming.nm[0]
    con1.con = "PlayStation 2"
    con1.typeOfCon = conTyp.typ[0]
    con1.cpu = theCPU.cpuTyp[2]
    con1.year = 2006
    con1.rev = "SCPH-77006"

    con2.conBrand = naming.nm[1]
    con2.con = "DSi"
    con2.typeOfCon = conTyp.typ[1]
    con2.cpu = theCPU.cpuTyp[2]
    con2.year = 2008
    con2.rev = "TWL-001 (JPN)"

    con3.conBrand = naming.nm[1]
    con3.con = "Switch Lite"
    con3.typeOfCon = conTyp.typ[1]
    con3.cpu = theCPU.cpuTyp[3]
    con3.year = 2019
    con3.rev = "HDH-001"

    con4.conBrand = naming.nm[0]
    con4.con = "PSVITA"
    con4.typeOfCon = conTyp.typ[1]
    con4.cpu = theCPU.cpuTyp[2]
    con4.year = 2011
    con4.rev = "PCH-2000 (JPN)"

    con5.conBrand = naming.nm[1]
    con5.con = "Super Famicom"
    con5.typeOfCon = conTyp.typ[0]
    con5.cpu = theCPU.cpuTyp[1]
    con5.year = 1990
    con5.rev = "SHVC-001"

    //User input to choose the desired info.
    val userIn = Scanner(System.`in`)
    println("Choose the consoles in my collection below for more info: ")
    println("1 for PlayStation 2")
    println("2 for DSi")
    println("3 for Switch Lite")
    println("4 for PSVITA")
    println("5 for Super Famicom")
    print("Your answer: ")
    val chosen = userIn.nextInt()

    //Function to determine the information for user input.
    when (chosen) {
        //Sony PlayStation 2.
        1 -> {
            println(" ")
            println("Brand: " + con1.conBrand)
            println("Model: " + con1.con)
            println("Console type: " + con1.typeOfCon)
            println("CPU: " + con1.cpu)
            println("Released: " + con1.year)
            print("Model Number: " + con1.rev)
        }
        //Nintendo DSi.
        2 -> {
            println(" ")
            println("Brand: " + con2.conBrand)
            println("Model: " + con2.con)
            println("Console type: " + con2.typeOfCon)
            println("CPU: " + con2.cpu)
            println("Released: " + con2.year)
            print("Model Number: " + con2.rev)
        }
        //Nintendo Switch Lite.
        3 -> {
            println(" ")
            println("Brand: " + con3.conBrand)
            println("Model: " + con3.con)
            println("Console type: " + con3.typeOfCon)
            println("CPU: " + con3.cpu)
            println("Released: " + con3.year)
            print("Model Number: " + con3.rev)
        }
        //Sony PSVITA.
        4 -> {
            println(" ")
            println("Brand: " + con4.conBrand)
            println("Model: " + con4.con)
            println("Console type: " + con4.typeOfCon)
            println("CPU: " + con4.cpu)
            println("Released: " + con4.year)
            print("Model Number: " + con4.rev)
        }
        //Nintendo Super Famicom.
        5 -> {
            println(" ")
            println("Brand: " + con5.conBrand)
            println("Model: " + con5.con)
            println("Console type: " + con5.typeOfCon)
            println("CPU: " + con5.cpu)
            println("Released: " + con5.year)
            print("Model Number: " + con5.rev)
        }
        //For all the integers out of range.
        else -> {
            print("INVALID INTEGER!")
        }
    }

}

//Information commonly shared among objects (such as brands, types, and CPU types).
open class BigboiClass {
    val nm = arrayOf("Sony", "Nintendo")
    val typ = arrayOf("Home console", "Handheld")
    val cpuTyp = arrayOf("8-bit","16-bit", "32-bit", "64-bit")
}

//Class used to define the object(s) is here.
class Models {
    var conBrand: String = ""
    var con: String = ""
    var typeOfCon: String = ""
    var cpu: String = ""
    var year = 0
    var rev: String = ""
}
