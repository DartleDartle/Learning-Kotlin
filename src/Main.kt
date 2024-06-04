fun main() {
    // in Java you need to use "New" keyword to create an object, here you don't need to use "New" keyword.
    // Objects
    val tv1 = SmartDevice(
        "Samsung Smart TV 55' QLED 4K",
        999.99
    )

    val tv2 = SmartDevice(
        "Samsung Smart TV 55' QLED 4K",
        999.99
    )
    println("== ${tv1 == tv2}")
    println("=== (memory location) ${tv1 === tv2}") // false
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

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SmartDevice

        if (brand != other.brand) return false
        if (price != other.price) return false
        if (isSwitchedOn != other.isSwitchedOn) return false

        return true
    }

    override fun hashCode(): Int {
        var result = brand?.hashCode() ?: 0
        result = 31 * result + (price?.hashCode() ?: 0)
        result = 31 * result + isSwitchedOn.hashCode()
        return result
    }


}