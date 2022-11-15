fun main() {
    val name = "Eko"
    when (name) {
        is String -> println("This is String")
        !is String -> println("This is not String")
    }
}