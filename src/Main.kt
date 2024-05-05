fun main() {

    // Now this is a mutable list.
    val names = mutableListOf(
        "Federico",
        "Francesca",
        "Alberto",
        "Alessandro"
    )
    println(names)
    println(names[0])
    println(names.size)
    //removing an element
    names.remove("Federico")
    println(names)
    //adding an element
    names.add("Federico")
    println(names)
}