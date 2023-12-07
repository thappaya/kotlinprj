import java.util.Scanner

fun main() {
    val psone = PSOne()
    val ps2 = PlayStation2()
    val ps3 = PLAYSTATION3()
    val xbox = Xbox360()
    val nfc = FamilyComputer()

    val userIn = Scanner(System.`in`)
    println("Choose the console in my collection")
    println("1 for PSOne")
    println("2 for PlayStation 2")
    println("3 for Family Computer")
    println("4 for PLAYSTATION 3")
    println("5 for Xbox 360")
    print("Your answer: ")
    val chosen = userIn.nextInt()

    when (chosen) {
        1 -> {
            psone.printAll()
        }
        2 -> {
            ps2.printAll()
        }
        3 -> {
            nfc.printAll()
        }
        4 -> {
            ps3.printAll()
        }
        5 -> {
            xbox.printAll()
        }
        else -> {
            print("Invalid integer entered!!!!")
        }
    }
}

open class GeneralData {
    val brands = arrayOf("Sony", "Nintendo", "Microsoft")
    val bits = arrayOf("8-bit","16-bit", "32-bit", "64-bit")
    val status = arrayOf("Working", "Dead")
}


class PSOne: GeneralData() {

    private val name = "PSOne"
    private val type = "Slimline, external power supply"
    private val codename = "SCPH-100 (JP Model)"
    private val designation = "100V JP model, slim version, all white"

    fun printAll() {
        println("Brand: " + brands[0])
        println("Name: $name")
        println("Type: $type")
        println("Codename: $codename")
        println("Designation: $designation")
        println("CPU Type: " + bits[1])
        print("Status: " + status[0])
    }
}

class PlayStation2: GeneralData() {
    private val name = "PlayStation 2"
    private val type = "Slimline, external power supply"
    private val codename = "SCPH-77006"
    private val designation = "M-Chassis"

    fun printAll() {
        println("Brand: " + brands[0])
        println("Name: $name")
        println("Type: $type")
        println("Codename: $codename")
        println("Designation: $designation")
        println("CPU Type: " + bits[2])
        print("Status: " + status[0])
    }
}

class FamilyComputer: GeneralData() {
    private val name = "Family Computer"
    private val type = "Original"
    private val codename = "Gamecom"
    private val designation = "Near-launch model, no FF logo"

    fun printAll() {
        println("Brand: " + brands[1])
        println("Name: $name")
        println("Type: $type")
        println("Codename: $codename")
        println("Designation: $designation")
        println("CPU Type: " + bits[0])
        print("Status: " + status[0])
    }
}

class PLAYSTATION3: GeneralData() {
    private val name = "PLAYSTATION 3"
    private val type = "Original, PlayStation 2 backwards compatible 20GB launch model"
    private val codename = "CECH-B00 (JP Model)"
    private val designation = "All black trims, no Wi-Fi, no card reader, 4 USB ports"

    fun printAll() {
        println("Brand: " + brands[0])
        println("Name: $name")
        println("Type: $type")
        println("Codename: $codename")
        println("Designation: $designation")
        println("CPU Type: " + bits[3])
        print("Status: " + status[0])
    }

}

class Xbox360: GeneralData() {
    private val name = "Xbox 360"
    private val type = "Original"
    private val codename = "Xenon"
    private val designation = "Jasper (Late 2008 - 2009) revision, 150W PSU, no RROD"

    fun printAll() {
        println("Brand: " + brands[2])
        println("Name: $name")
        println("Type: $type")
        println("Codename: $codename")
        println("Designation: $designation")
        println("CPU Type: " + bits[3])
        print("Status: " + status[1])
    }

}