fun main() {
    var firstName: String? = "Eko"
    firstName = null

// error    println(firstName.length)
    println(firstName?.length)
}