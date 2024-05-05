fun main() {

    // Range, Down to, Steps

    println("Range")
    for (i in 1..5) println(i)
    println("Down to")
    for (i in 5 downTo 1) println(i)
    println("Steps")
    for (i in 1..5 step 2) println(i)
    println("Steps and down to")
    for (i in 5 downTo 1 step 2) println(i)
}
