fun main() {
    //Accepting string input.
    println("You really wanna see my array?")
    print("Your answer (Y/N): ")
    val answer: String = readln() //Read string input from the user.

    //Defining array in Kotlin.
    val arrayList = arrayOf(1,2,3,4,5,6,7,8,9,10)
    val nameList = arrayOf("Faker", "Oner", "Gumayasi", "Keria", "Zeus")

    //Here are logics using "when" expression.
    //Accounted for 4 possible accepting answers, and 4 possible declining answers.
    //To print out the array, we need to use "contentToString()" otherwise it would just be a garbled data.
    when (answer) {
        "Yes" -> {
            println("Alright, here you go then...")
            println(arrayList.contentToString())
            print(nameList.contentToString())

        }
        "yes" -> {
            println("Alright, here you go then...")
            println(arrayList.contentToString())
            print(nameList.contentToString())
        }
        "Y" -> {
            println("Alright, here you go then...")
            println(arrayList.contentToString())
            print(nameList.contentToString())
        }
        "y" -> {
            println("Alright, here you go then...")
            println(arrayList.contentToString())
            print(nameList.contentToString())
        }
        //For declining, do the following.
        "No" -> {
            print("OK! But why you ask lol.")
        }
        "N" -> {
            print("OK! But why you ask lol.")
        }
        "no" -> {
            print("OK! But why you ask lol.")
        }
        "n" -> {
            print("OK! But why you ask lol.")
        }
        //For invalid answers.
        else -> {
            print("Invalid response!")
        }
    }

}