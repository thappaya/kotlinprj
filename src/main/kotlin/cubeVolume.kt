import java.util.Scanner //Import Scanner to receive user input for integer.

fun main() {

    //Receive input of cuboid length.
    val l = Scanner(System.`in`)
    print("Enter the length: ")
    val length = l.nextInt()

    //Receive input of cuboid breadth.
    val b = Scanner(System.`in`)
    print("Enter the breadth: ")
    val breadth = b.nextInt()

    //Receive input of cuboid height.
    val h = Scanner(System.`in`)
    print("Enter the length: ")
    val height = h.nextInt()

    //Formula for calculating  cuboid volume.
    val volume = (length * breadth * height)

    //Final output.
    print("The volume of the cube is: " + volume + "cm3")

}