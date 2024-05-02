fun main() {

    val arrayOfNulls = arrayOfNulls<String>(5)
    arrayOfNulls[0] = "Hello"
    println(arrayOfNulls.contentToString())

    arrayOfNulls.fill( "*")
}