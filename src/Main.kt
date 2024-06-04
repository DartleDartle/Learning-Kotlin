fun main() {
    // in Java you need to use "New" keyword to create an object, here you don't need to use "New" keyword.
    // Objects
    val tv = SmartDevice()

    tv.brand = "Samsung Smart TV 55' QLED 4K"
    tv.price = 999.99
    println("${tv.brand} costs ${tv.price}$")
    tv.turnOn()
    tv.getDeviceState()


    val phone = SmartDevice()

    phone.brand = "Apple Iphone 12 Pro Max"
    phone.price = 1199.99
    println("${phone.brand} costs ${phone.price}$")
    phone.turnOff()
    phone.getDeviceState()

}

// Blueprint
class SmartDevice {
    // Properties. variables. val or var.

    var brand: String = ""
    var price: Double = 0.0
    var isSwitchedOn: Boolean = false

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