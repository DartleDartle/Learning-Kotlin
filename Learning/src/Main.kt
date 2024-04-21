fun getGreeting() = "Hello, Kotlin/Native!"

fun sayHello(): Unit {
    println(getGreeting())
}

fun main() {
    println("Hello World")
    println(getGreeting())
    sayHello()
}