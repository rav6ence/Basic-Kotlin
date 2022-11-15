fun printHello(name: String?): Unit {
    if (name == null) {
        println("Hello bro")
    }else{
        println("Hello $name")
    }
}

fun main() {
    printHello("Eko")
}