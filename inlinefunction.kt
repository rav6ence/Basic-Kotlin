inline fun hello(name: () -> String): String {
    return "Hello ${name()}"
}
fun main() {
    println(hello {"Eko"})
    println(hello {"Kurniawan"})
}