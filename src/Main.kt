


fun main() {
    greet(age= 18, name = "John")
    greet(age= 17, name = "Jane")
    greet(age= 20, name = "Doe")
}
fun greet(name: String, age: Int){
    if (age >= 18){
        println("$name You are an adult")
    } else {
        println("$name You are a minor")
    }
}