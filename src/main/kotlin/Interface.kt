fun main() {

    //Calling car and bicycle class to main.
    val myCar = Car()
    val myBike = Bicycle()

    //Car: Drive and stop function.
    myCar.drive()
    myCar.stop()

    //Bicycle: Drive and stop function.
    myBike.drive()
    myBike.stop()
}
//Interface lies here.
interface Vehicle {
    //Getter function for the interface.
    //Implemented for car and bike speed.
    val carSPD: String
        get() = "50"
    val bikeSPD: String
        get() = "15"

    //Function in interface (will get override by the Car and Bicycle class).
    fun drive()
    fun stop()
}

//Implement "Vehicle" interface.
class Car: Vehicle {

    //Override "drive()" function from the Vehicle interface.
    override fun drive() {
        println("Car is going down the road at $carSPD km/h.")
    }
    //Override "stop()" function from the Vehicle interface.
    override fun stop() {
        println("Car stopped...")
    }
}

//Implement "Vehicle" interface.
class Bicycle: Vehicle {

    //Override "drive()" function from the Vehicle interface.
    override fun drive() {
        println("Bike is going down the road at $bikeSPD km/h.")
    }
    //Override "stop()" function from the Vehicle interface.
    override fun stop(){
        print("Bike stopped...")
    }
}