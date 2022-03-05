fun main() {
//    Mirip If, namun untuk kasus sederhana dan lebih simple
    val nilai = 'C'
    val termasukNilaiLulus = arrayOf("A", "B", "C")
    println("-----------------")
    when (nilai) {
        'A' -> println("Amazing")
        'B' -> println("Best")
        'C' -> println("Congratulation")
        'D' -> println("Dont Forget to Learn")
        'E' -> println("Eh, you must hard learning")
        'F' -> println("Follow you teacher, learn and learn again")
        else -> print("Hmmm, all wrong")
    }
    println("-----------------")
//        Multiple Expression
    when (nilai) {
        'A' , 'B', 'C' -> println("Lulusn Peringkat atas")
        'D' , 'E', 'F' -> println("Nilai buruk, belajar lagi")
        else -> print("Hmmm, all wrong")
    }
//    When Expression In
    println("-----------------")
    when (nilai) {
//        in termasukNilaiLulus -> println("Selamat anda lulus")
//        !in termasukNilaiLulus -> println("Maaf, anda tidak Lulus")
    }
    println("-----------------")
//    When Pengganti IF ELSE
//    Cara Lain
    val nilaiku = 91
    when {
        nilaiku >= 90 -> println("Amazing")
        nilaiku > 80 -> println("Best")
        nilaiku > 70 -> println("Congratulation")
        nilaiku > 60 -> println("Dont Forget to Learn")
        nilaiku > 50 -> println("Eh, you must hard learning")
        nilaiku > 40 -> println("Follow you teacher, learn and learn again")
        else -> print("Hmmm, all wrong")
    }
    println("-----------------")
}