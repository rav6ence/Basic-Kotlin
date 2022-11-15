fun main() {
    var firstName : String = "Eko"
    var lastName: String = "Khannedy"
    var fullName: String = "$firstName $lastName"
    var desc: String = "total $fullName char = ${fullName.length}"

    println(firstName)
    println(lastName)
    println(fullName)
    println(desc)
}