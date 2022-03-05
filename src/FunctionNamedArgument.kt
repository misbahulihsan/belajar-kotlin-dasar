fun main() {
    fullName("Misbahul", "Ihsan", "Ganteng")
    fullName(firstName = "Misbahul", lastName = "Ganteng", middleName = "Ihsan" )
    fullName(firstName = "Misbahul", lastName = "Ganteng" )
}

fun fullName(firstName: String, middleName: String ="", lastName: String =""){
    println("Hello $firstName $middleName $lastName")
}