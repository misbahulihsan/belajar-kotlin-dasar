fun main() {
    println(sum(10,20 ))
    val result = sum(50,100)
    println("-----------")
    println(result)
    println(bagi(110,0))
}
// Nilai return kembalikan sesuai dengan type data (: Int)
fun sum(a: Int,b: Int): Int{
    val total = a + b
    return total
}

 fun bagi(aa: Int,bb: Int): Int {
//     if (aa == 0 || bb == 0){
//       return 0
//     }else{
//         val hasilnya = aa / bb
//         return hasilnya
//     }

     if (aa.equals(0) || bb.equals(0)){
         return 0
     }else{
         val hasilnya = aa / bb
         return hasilnya
     }

 }