fun main() {

    // Destructuring
    val names = listOf(
        "Federico",
        "Francesca",
        "Alberto",
        "Alessandro"
    )
    val (a, b, c, d) = names

    /*
    val j = names[0]
    val k = names[1]
    val l = names[2]
    val m = names[3]
    */

println("$a $b $c $d")

    // Destructuring with Pair
    val pair = Pair("Federico", "Zanetello")
    val (name, surname) = pair

    /*
    val name = pair.first
    val surname = pair.second
    */
    println("$name $surname")

    // Destructuring with Triple
    val triple = Triple("Federico", "Zanetello", 30)
    val (name2, surname2, age) = triple

    /*
    val name2 = triple.first
    val surname2 = triple.second
    val age = triple.third
    */

    println("$name2 $surname2 $age")

    // Destructuring with custom class
    val person = Person("Federico", "Zanetti", 30)
    val (name3, surname3, age2) = person

    /*
    val name3 = person.name
    val surname3 = person.surname
    val age2 = person.age
    */
    println("$name3 $surname3 $age2")

}
