fun main() {
    // in Java you need to use "New" keyword to create an object, here you don't need to use "New" keyword.
    // Objects
    val tv = SmartDevice(
        "Samsung Smart TV 55' QLED 4K",
        999.99
    )
    println("${tv.brand} costs ${tv.price}$")
    tv.turnOn()
    tv.getDeviceState()


    val phone = SmartDevice(
        "Samsung Galaxy S21 Ultra",
        1199.99
    )
    println("${phone.brand} costs ${phone.price}$")
    phone.turnOff()
    phone.getDeviceState()

    val laptop = SmartDevice(
        "MacBook Pro 16",
        2399.99
    )
    println("${laptop.brand} costs ${laptop.price}$")
    laptop.turnOn()
    laptop.getDeviceState()
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

}