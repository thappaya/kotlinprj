//Disclaimer: This is only a program I've created when I have nothing to do for my 2.5 hours lone time in the library.
//The sole reason that lead to the creation of this program came from my love of the video game called "Persona 4 Golden".
//This program is not created to attack, criticize, or insult anyone.
fun main() {

    //Calling classes for main function.
    val nameList = P4Companions()
    val valueCompare = Logics()

    //Question.
    println("Picture this, you're Yu Narukami.")
    println("The main protagonist in Persona 4 Golden.")
    println("You must choose your companion to be your best friend, or partner.")
    println("Who would that be?")
    println("Hint: Look up Persona 4 Golden characters before answering...")
    print("Your answer: ")

    //Read the user input.
    val chosenAns = readln()

    //Set the user input choice in Logics class.
    valueCompare.chosen = chosenAns

    //Print out the name of the chosen character, and print out the description of that character.
    when (chosenAns) {
        "Chie", "chie" -> {
            println("You chose " + nameList.girls[0])
            valueCompare.description()
        }
        "Yukiko", "yukiko" -> {
            println("You chose " + nameList.girls[1])
            valueCompare.description()
        }
        "Rise", "rise"-> {
            println("You chose " + nameList.girls[2])
            valueCompare.description()
        }
        "Naoto", "naoto" -> {
            println("You chose " + nameList.girls[3])
            valueCompare.description()
        }
        "Marie", "marie" -> {
            println("You chose " + nameList.girls[4])
            valueCompare.description()
        }
        "Yosuke", "yosuke" -> {
            println("You chose " + nameList.boys[0])
            valueCompare.description()
        }
        "Kanji", "kanji" -> {
            println("You chose " + nameList.boys[1])
            valueCompare.description()
        }
        "Teddie", "teddie" -> {
            println("You chose " + nameList.boys[2])
            valueCompare.description()
        }
        else -> {
            println("Your chosen companion isn't in Persona 4, you dork!")
        }
    }
}

//All companions in Persona 4 Golden.
open class P4Companions {
    val girls = arrayOf("Chie Satonaka", "Yukiko Amagi", "Rise Kujikawa", "Naoto Shirogane", "Marie Mariko")
    val boys = arrayOf("Yosuke Hanamura", "Kanji Tatsumi", "Teddie")
}

//What the user's input says about the user.
class Logics {
    var chosen = ""

    fun description() {
        when (chosen) {
            "Naoto", "naoto"-> {
                print("You love short-haired girls don't you?")
            }
            "Chie", "chie" -> {
                print("A girl that acts manly is your type.")
            }
            "Yukiko", "yukiko" -> {
                print("You want to take a shortcut, take over the family business.")
            }
            "Rise", "rise"-> {
                print("No doubt you are an Oshi No Ko fans.")
            }
            "Marie", "marie" -> {
                print("Spoiler alert: It's a given.")
            }
            "Yosuke", "yosuke" -> {
                print("Best friend forever, am I right?")
            }
            "Kanji", "kanji" -> {
                print("I'm sorry W H A T ?")
            }
            "Teddie", "teddie" -> {
                print("Fancy a Disney prince?")
            }
        }
    }
}