fun main() {
    // in Java you need to use "New" keyword to create an object, here you don't need to use "New" keyword.
    // Objects
    val tv = SmartDevice(
        "Samsung Smart TV 55' QLED 4K",
        999.99
    )
    println(tv)
}

// Blueprint
class SmartDevice(
    var brand: String?,
    var price: Double?,
    var isSwitchedOn: Boolean = false
) {
    constructor() : this(null, null)
    constructor(
        brand: String
    ) : this(brand, 0.0)

    // Behavior. functions. fun.

    fun getDeviceState(): String {
        if (isSwitchedOn) {
            println("On")
            return "On"
        } else {
            println("Off")
            return "Off"
        }

    }

    fun turnOn() {
        isSwitchedOn = true
        println("$brand is turning on")
    }

    fun turnOff() {
        isSwitchedOn = false
        println("$brand is turning off")
    }

    override fun toString(): String {
        return "SmartDevice(brand=$brand, price=$price, isSwitchedOn=$isSwitchedOn)"
    }

}