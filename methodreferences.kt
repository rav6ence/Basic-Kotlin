fun toUpper(value: String): String = value.toUpperCase()
fun main() {
    val lambdaName: (String) -> String = ::toUpper
    val name = lambdaName("eko")
    println(name)
}