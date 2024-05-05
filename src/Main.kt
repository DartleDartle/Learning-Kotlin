fun main() {
    //while loop
    var number = 1;
    while (number <= 5) {
        println("Number: $number")
        number++
    }

    //while loop through an array
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    var index = 0
    while (index < numbers.size) {
        println("Number: ${numbers[index]}")
        index++
    }
}
