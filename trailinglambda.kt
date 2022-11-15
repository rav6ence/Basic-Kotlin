fun main() {
    var result1 = hello("Eko") { value: String -> value.toUpperCase()
    }
    var result2 = hello("Eko") { value: String -> value.toUpperCase()
    }
    println(result1)
    println(result2)
}