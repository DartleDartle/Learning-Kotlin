


fun main() {
    greet("John" )
    greet("Carol", 15)
    greet("Alex", 27)
}
fun greet(name: String, age: Int = -1){

    if (age >= 18){
        println("$name You are an adult")
    } else {
        println("$name You are a minor")
    }

    if (age == -1){
        println("Please provide your age")
        return
    }

}