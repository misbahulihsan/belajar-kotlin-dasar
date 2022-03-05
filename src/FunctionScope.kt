fun main() {
    fun contohHelloWorld(){
//        hanya bisa diakses oleh functin main di file ini.
        println("HEllo World")
    }
    contohHelloWorld()
    dua()
}

fun satu(){
//    bisa diakses oleh file lain, atau class lain
//    berpotensi bentrok (eror) jika naman function sama
    println("satu")
    satu()
    dua()

}

fun dua(){
//    bisa diakses oleh file lain, atau class lain
//    berpotensi bentrok (eror) jika naman function sama
    println("dua")
    tiga()
}

fun tiga(){
//    bisa diakses oleh file lain, atau class lain
//    berpotensi bentrok (eror) jika naman function sama
    println("tiga")
}

