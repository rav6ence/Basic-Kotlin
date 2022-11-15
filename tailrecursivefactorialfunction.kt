tailrec fun factorialTail(value: Int, total: Int = 1): Int {
    return when (value) {
        1 -> total
        else -> factorialTail(value - 1, total * value)
    }
}
fun main() {
    println(factorialTail(5))
}