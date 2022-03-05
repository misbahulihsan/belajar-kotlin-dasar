fun main() {
    val nama = "Ihsan"
    val buah = "Duren"
    println(nama.hello())
    println(buah.hello())
    buah.printHello()

}

fun String.hello(): String = "Hello $this"
fun String.printHello(): Unit = println("Holla Hello $this")