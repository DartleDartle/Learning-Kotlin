fun main() {
    // in Java you need to use "New" keyword to create an object, here you don't need to use "New" keyword.
    // Objects
    val tv = SmartDevice()

    tv.brand = "Samsung Smart TV 55' QLED 4K"
    tv.price = 999.99
    println("${tv.brand} costs ${tv.price}$")

    val phone = SmartDevice()

    phone.brand = "Apple Iphone 12 Pro Max"
    phone.price = 1199.99
    println("${phone.brand} costs ${phone.price}$")


}

// Blueprint
class SmartDevice {
    // Properties. variables. val or var.

    var brand: String = ""
        // get() = "foo"
        set(value) {
            field = value.uppercase()
        }
    var price: Double = 0.0

    // Behavior. functions. fun.
}