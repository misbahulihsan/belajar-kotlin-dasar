fun main() {

    val result = 10 / 3
    val result1 = 10.0 / 3.0
    val result2 = 10 + 10 /2

    println(result)
    println(result1)
    println(result2)
    println("----------------")
//    Augmenented Assigement
//    a = a + 10          ===>       a += 10
//    a = a - 10          ===>       a -= 10
//    a = a * 10          ===>       a *= 10
//    a = a / 10          ===>       a /= 10
//    a = a % 10          ===>       a %= 10

    var total: Int = 0
    var totalan: Int = 0

    val barang1 = 100
    total = total + barang1
    totalan += barang1

    val barang2 = 200
    total = total + barang2
    totalan += barang2

    val barang3 = 300
    total = total + barang3
    totalan += barang3

    println(total)
    println("----------------")
    println(totalan)
    println("----------------")

//    Unary Operator
//    ++        ===>      a = a+1
//    --        ===>      a = a+1
//    -         ===>      Posotive
//    +         ===>      Negative
//    !         ===>      Boolean Kebalikan

    println("----------------")
    total++ // total = total + 1
    total++ // total = total + 1
    total++ // total = total + 1
    println(total)
    total-- // total = total - 1
    println(total)
    println("----------------")

    val iyakah = true
    println(!iyakah)
    println(iyakah)



}