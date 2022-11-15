fun test(name: String, param: (String) -> Unit): Unit = param(name)
fun main() {
    test("eko") testLabel@{
        if (it == "eko") {
            return@testLabel
        }
    }
    println("Eko")
}