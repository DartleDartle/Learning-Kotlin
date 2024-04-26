import kotlin.math.*



fun main() {

    val n1 = 10
    val n2 = 20

    val value = if (n1 >= n2 || n1 <= 30) {
        // println("n1 is greater than or equal to n2")
        "n1 is greater than or equal to n2"
    } else if(n1 == n2) {
       // println("n1 is equal to n2")
        "n1 is equal to n2"
    } else {
       // println("n1 is less than n2")
        "n1 is less than  n2"
    }

    println(value)

}