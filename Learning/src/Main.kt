val name: String = "Kotlin"
var greeting: String? = null

fun main() {
    

    val greetingToPrint = when (greeting) {
        null -> "Hi"
        else -> greeting
    }

    println(greetingToPrint)
    println(name)

}