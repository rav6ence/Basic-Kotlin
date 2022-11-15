fun factorialLoop(value: Int): Int {
    var result = 1;
    for (i in value downTo 1) {
        result *= i
    }
    return result
}
fun main() {
    println(factorialLoop(10))
}