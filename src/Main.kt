fun main() {
   val name = arrayOf("John", "Doe", "Jane", "Doe")
    println(name[0])
    println(name[1])
    println(name[2])
    println(name[3])
    println(name.size)

    if ("John" in name) {
        println("the name is in the array")
    } else {
        println("the name is not in the array")
    }

}