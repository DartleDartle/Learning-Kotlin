fun main() {

    // list can be expanded in every moment, compared to arrays which have fixed size, but this list isn't mutable.
    // the syntax of list can not include the type of the elements, because it is inferred by the compiler.
    val names: List<String> = listOf(
        "Federico",
        "Francesca",
        "Alberto",
        "Alessandro"
    )
    println(names)
    println(names[0])
    println(names.size)
    // list are built on arrays, so they have the same performance.
}