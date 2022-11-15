fun main() {
    val lambdaName: (String) -> String = {
        it.toUpperCase()
    }
    val name = lambdaName("eko")
    println(name)
}