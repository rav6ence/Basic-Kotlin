fun sayHello(name:String = ""): String {
    return if (name == "") {
        "Hello Bro"
    }else{
        "hello $name"
    }
    sayHello("Eko")
}
