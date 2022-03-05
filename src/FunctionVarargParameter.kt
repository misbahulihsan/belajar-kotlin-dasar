fun main() {
    println(hitungtotal("Ihsan", 10,10,10,10,10,10,10,10))
}

//    VarArg atau Variable argunment, nilai paling
//    belakang bisa berapapun dimasukkan, yang sama sperti array
//    harus dimasukkan paling belakang

fun hitungtotal(nama : String, vararg values: Int): Int{
    var total = 0

    for (value in values) {
        total += value
    }

    return total
}


// Jika menggunakan array, susah
//fun hitungtotal(values: Array<Int>): Int{
//    var total = 0
//
//    for (value in values) {
//        total += value
//    }
//
//    return total
//}
//
//fun main() {
//
//    val values = arrayOf(10,11,12,13,14)
//    val result = hitungtotal(values)
//
//    println(result)
//
//}



