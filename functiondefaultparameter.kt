fun hello(firstName: String, lastName: String = ""){
    println("Hello $firstName $lastName")
}

fun main () {
    hello("Eko")
    hello("Eko","Khannedy")
}