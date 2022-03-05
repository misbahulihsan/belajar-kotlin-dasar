fun main() {
    val arraynya = arrayOf("Misbahul", "Ihsan", "Ganteng")

    var total = 0

    for (name in arraynya){
        println(name)
        total++
    }
    println("Total Perulangan : " + total)

    for (i in 0..10000 step 4000){
        println(i)
    }

    val ukuranArray = arraynya.size -1

    for (i in 0..ukuranArray){
        println("Data Index ke $i = ${arraynya.get(i)}")
    }
}