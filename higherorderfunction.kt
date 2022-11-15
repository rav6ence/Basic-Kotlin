fun hello(value: String, transformer: (String) -> String): String {
    return "Hello ${transformer(value)}";
}
fun main() {
    val upperTransformer = { value: String -> value.toUpperCase()}
    val lowerTransformer = { value: String -> value.toUpperCase()}
    println(hello("Eko", upperTransformer))
    println(hello("Eko", lowerTransformer))
}