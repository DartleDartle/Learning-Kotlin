fun main() {
    val n1 = 10
    val n2 = 20

    when {
       (n1 >= n2 || n1 <= 30) -> println(":)")
        (n1 == 100) -> println("foo")
        else -> println(":(")
    }

    val age = 20
    when (age) {
        in 13..19 -> println("Teenager")
        !in 0..9 -> println("Not a Teenager")
        in 20..29 -> println("Twenties")
        in 30..39 -> println("Thirties")
        else -> println("Over 40")
    }

}