infix fun String.to(type: String): String {
    if (type == "UP"){
        return this.toUpperCase()
    }else{
        return this.toLowerCase()
    }
}
fun main(){
    val result: String = "Eko" to "UP"
    println(result)
}