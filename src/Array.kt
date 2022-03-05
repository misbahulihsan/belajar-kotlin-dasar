fun main() {
//Araay hanya bisa menampung deangan tipe data yang sama
//Cara mengaksesnya menggunakan index. dimulai dari 0.
//    size : Panjang Array
//    get(index) : Mendapatkan data posisi index
//    [index] : Mendapatkan data posisi index
//    set(index,value) : Mengubah data di posisi index
//    [index] = value] : Mengubah data di posisi index

    val names: Array<String> = arrayOf("Misbahul", "Ihsan", "Ganteng")
    val score: Array<Int> = arrayOf(100, 90, 95)

    println("----------------")
    println(names.get(0))
    println(names[0])
    println(names.get(2))
    println(names[2])
    println(score[0])
    println(score[1])
    println(score[2])

//    Data bisa dirubah walaupun val, karwena yang diubah isi array bukan variab arraynya
    println("----------------")
    println(names[2])
    names[2] = "Pintar"
    println(names[2])
    names.set(2,"Menawan")
    println(names[2])
    println(score[0])
    score[1] = 98
    score.set(2,76)
    println(score[1])
    println(score[2])

//Array Nullable, menggunakan tanda tanya ?
//    Harus ditentukan nilai size dari array null ini
    val nama: Array<String?> = arrayOfNulls(3)
    nama[0] = "Tono"
    nama[1] = null
    nama[2] = "tina"
    //akan error jika index array melebihi size
//    nama[3] = "tinatoon"

    println("-------Array Nullable--------")
    println(nama[0])
    println(nama[1])
    println(nama[2])

}