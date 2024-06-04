fun main() {

    println(twoValues())
    println(threeValues())

    // you can even destructure the values

    val (v1, v2) = twoValues()
    println("$v1, $v2")

    val (t1, t2, t3) = threeValues()
    println("$t1, $t2, $t3")
}

fun twoValues(): Pair<String, Int> =
    "Mario" to 30


fun threeValues(): Triple<String, Int, Char> =
     Triple(
            "Mario",
            30,
            'M'
     )
