fun main() {
    val result1 = hello("Eko", fun(value: String): String {
        if (value.isBlank()) {
            return "Ups"
        }
        return value.toUpperCase()
    })
    println(result1)
}