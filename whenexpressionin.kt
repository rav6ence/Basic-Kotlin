fun main() {
    val finalExam = 'A'
    val passValues = arrayOf('A','B','C')
    when (finalExam) {
        in passValues -> println("Pass")
        !in passValues -> println("Try Again")
    }
}