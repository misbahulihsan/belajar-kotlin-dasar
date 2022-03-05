fun main() {
//    Data Range
//    Membuat data berurutan, untuk lebih memudahkan
//    Cukup menggunakan tanda titik titik, titik dua kali (..) , 1..100 ini range 1 sampai 100
//    count() : mendapatkan totoal range
//    contains(value) : mengecek apakan terdapat value tersebut
//    first : mendaptkan nilai pertama
//    last : mendapatkan nilai terakhir
//    step : mendaptkan nilai tiap kenaikann
//    Kebutuhan untuk perulangan

    val range = 1..100
//    range
    println("----------------")
    println(range.count())
    println(range.contains(35))
    println(range.contains(213))
    println(range.first)
    println(range.last)
    println(range.step)
    println("----------------")
//    range Terbalik, downTo
    val urutan = 100 downTo 1
    println("----------------")
    println(urutan.count())
    println(urutan.contains(35))
    println(urutan.contains(213))
    println(urutan.first)
    println(urutan.last)
    println(urutan.step)
    println("----------------")

//    range dengan step
    val urutanstep = 100 downTo 1 step 2
    println("----------------")
    println(urutanstep.count())
    println(urutanstep.contains(1))
    println(urutanstep.contains(3))
    println(urutanstep.contains(5))
    println(urutanstep.contains(6))
    println(urutanstep.contains(213))
    println(urutanstep.first)
    println(urutanstep.last)
    println(urutanstep.step)
    println("----------------")

}