fun main(args : Array<String>){
    val car = AutopilotAbleCar()
    car.drive()
    car.stop()
    car.autopilot()
    car.destroy()
    println("car ------------------------------------")

    val airplain = airplain()
    airplain.drive()
    airplain.stop()
    airplain.autopilot()
    println("airplane -------------------------------")
}
interface Vehicle{
    fun drive()
    fun stop()
    fun autopilot()
    fun destroy() {
        println("Vehicle is destroyed")
    }
}
//

//생성자가 없기때문에 : Vehicle 로 명시해준다.
class AutopilotAbleCar : Vehicle{
    override fun drive() {
         println("Car is moving")
    }

    override fun stop() {
        println("Car is stopped")

    }

    override fun autopilot() {
        println("autopilot on")
    }
    override fun destroy() {
        super.destroy()
        println("Vehicle is a car")
    }

}

class airplain : Vehicle {
    override fun drive() {
        println("Airplane is moving")

    }

    override fun stop() {
        println("Airplane is stopped")
    }

    override fun autopilot() {
        println("Airplane autopilot on")
    }

}