


fun main() {
    greet("Kotlin", 16)
    greet("Johnny", 29)
    greet("Francesco", 34)
}
fun greet(name: String, age: Int){
    if (age >= 18){
        println("$name You are an adult")
    } else {
        println("$name You are a minor")
    }
}