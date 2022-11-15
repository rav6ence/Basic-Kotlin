fun String.hello(): String {
    return "hello $this"
}

fun main(){
    val name: String = "Eko"
    val hello: String = name.hello()
    println(hello)
}