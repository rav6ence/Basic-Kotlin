fun sayhello(name: String = ""): String {
    return when (name) {
        "" -> "Hello bro"
        else -> "Hello $name"
    }
    sayHello("Eko")
}

