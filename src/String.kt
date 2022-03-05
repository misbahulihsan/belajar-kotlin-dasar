fun main() {
    val firstName: String = "Misbahul"
    val lastName: String = "Ihsan"
    val addressShot: String = "JL. Masjid Raya No. 99"
    val addressConmplete: String = """
        JL> Masjid Raya No.99, RT 002 RW 008, Kec Gebog, Kabupaten Kudus, KodePos 556677
    """
    val addressTerpisah: String = """
        |JL> Masjid Raya 
        |No.99, 
        |RT 002 RW 008, 
        |Kec Gebog, 
        |Kabupaten Kudus, 
        |KodePos 556677
    """.trimMargin()


    println("----------------")
    println("Nama Lengkap : "+firstName+" "+lastName)
    println("Alamat : "+addressShot)
    println("Alamat Lengkap : "+addressConmplete)
    println("----------------")
    println("Alamat Split : "+addressTerpisah)
    //String Template
    //Tanda $ untuk mengakses variable
    val fullname: String = "$firstName $lastName"
    val desc: String = "$fullname length = ${fullname.length}"

    println("----------------")
    println("Menampilkan dengan string Template")
    println("----------------")
    println(fullname)
    println(desc)
    println("----------------")


}