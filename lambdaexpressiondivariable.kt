fun main() {
    val lambdaName: (String) -> String = { value: String -> value.toUpperCase()
    }
    val name = lambdaName("eko")
    println(name)
}