fun finalValue(name:String, vararg values: Int){
    var total = 0.0
    for (value in values) {
        total += value
    }
    total /= values.size
    println("Final Value $name = $total")
}
fun main() {
    finalValue("Joni",1,2,3,4,5)
}