fun main() {
    //Integer
    val age: Int = 200
    //Float, harus ada huruf F dibelakang
    val sample: Float = 10.10F
    //Binary, diawal harus ada 0b
    val binary: Int = 0b110101001
    // Long, untuk angka yang pangjang, diakhir diberi L
    val long: Long = 9000000000L
    //Underscore , memudah baca angka yang panajng, cukup gunakan _
    val price: Long = 9_000_000_000L

    println(age)
    println(sample)
    println(binary)
    println(long)
    println(price)

    // Conversion
    val number: Int = 187980
    //
    val conbyte: Byte = number.toByte()
    val conshort: Short = number.toShort()
    val conint: Int = number.toInt()
    val conlong: Long = number.toLong()
    val confloat: Float = number.toFloat()
    val condouble: Double = number.toDouble()

    println("------------")
    println(conbyte)
    println(conshort)
    println(conint)
    println(conlong)
    println(confloat)
    println(condouble)
    println("------------")
    println(price.toLong())





}