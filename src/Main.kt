fun main() {

    val nums = intArrayOf(1, 2, 3, 4, 5, 6, 8)

    // break and continue
    for (n in nums) {
        if (n % 2 != 0) continue
        if (n > 5) break
        println(n)
    }
    // break and continue only in a loop
    nums.forEach {
        if (it % 2 != 0) return@forEach
        if (it > 5) return@forEach
        println(it)
    }
}
