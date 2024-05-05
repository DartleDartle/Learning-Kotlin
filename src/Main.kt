fun main() {
    //for loop
    val names = listOf("john", "jane", "alex")
    val numbers = intArrayOf(1, 2, 3, 4, 5)

    //capitalizing first letters of names
    for(name in names) {
        val n = name.replaceFirstChar {
            it.uppercase()
        }
        println(n)
    }
    println()
    // one line for loop
    for (n in numbers) println(n)
}
