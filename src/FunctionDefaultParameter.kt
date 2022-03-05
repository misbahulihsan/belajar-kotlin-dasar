fun main() {
    hello("Misbahul", "Ihsan")
    hello("Misbahul")
    hello("Misbahul", "Ganteng")
    helloworld()


}

fun hello(firstName: String, lastname: String? ="-"){
    println("Hello $firstName $lastname")
}