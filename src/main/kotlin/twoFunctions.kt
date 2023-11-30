//Main function (print results)
fun main() {
    val results = findVolume(30, 20, 10)
    println("The volume is $results")
}
//Function to find the cube volume.
//Define the function to call for 3 different integers value.
fun findVolume(length:Int, breadth: Int, height: Int): Int {

    //Multiplication and return the results.
    return (length * breadth * height)

}