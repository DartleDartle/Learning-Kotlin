fun main() {

    val n1 = 10
    val n2 = 20

    val r = if (n1 >= n2) ":)" else ":("

    println(r)

    val r2 =
        if (n1 >= n2) ":)"
        else if (n1 == 100) ":("
        else ":|"

    println(r2)


}