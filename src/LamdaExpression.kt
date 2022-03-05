fun main() {


    val contohLamda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    val result = contohLamda("Misbahul","Ihsan")

    println(result)
//    it
//    menggunakan it, reprentasi aprameter pertama
    val sayHello: (String) -> String = {
        "Hello $it"
    }

    println(sayHello("Ganteng"))

    val toUpperCase : (String) -> String = ::toUpper
    println(toUpperCase("Misbahul Ihsan"))

}


//    Method Reference
fun toUpper(value: String): String = value.uppercase()
