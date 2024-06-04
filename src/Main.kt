fun main() {
    // in Java you need to use "New" keyword to create an object, here you don't need to use "New" keyword.
    // Objects
    val tv = SmartDevice()

    tv.brand = "Samsung Smart TV 55' QLED 4K"
    tv.price = 1000.0

    val phone = SmartDevice()

    phone.brand = "Apple Iphone 12 Pro Max"
    phone.price = 1200.0
    

}

// Blueprint
class SmartDevice {
    // Properties. variables. val or var.
    var brand: String = ""
    var price: Double = 0.0
    // Behavior. functions. fun.
}