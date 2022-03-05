fun main() {
    sayHello("Misbahul","Ihsan")
    sayHello("Misbahul",null)
    sayHello("Misbahul","")
    sayHello("Misbahul","Ganteng")
}

fun sayHello(firstName: String, lastName: String?){
    if (lastName == null){
        println("Hallo $firstName")
    }else{
        println("Hallo $firstName $lastName.")
    }

}
