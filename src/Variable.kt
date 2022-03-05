//Variable Constant , untuk kebutuhan global bisa diakses dari mana saja
const val APP = "Aplikasi Ku"
const val VERSION = 1.1

fun main() {
    //Imutable Val
    val firstName: String = "Misbahul"
    val score: Int = 100

    //Mutable Var
    var mfirstName: String = "Misbahul"
    var mscore: Int = 100

    //Nullable
    var nfirstName: String = "Misbahul"
    var nlastName: String? = "Ihsan"
    var nscore: Int? = 100

    nlastName = null
    nscore = null

    println("----------------IMutable------------------")
    println(firstName)
    println(score)
    println("----------------Mutable------------------")

    mfirstName = "Nama Berubah"
    mscore = 20
    println(mfirstName)
    println(mscore)
    println("----------------Nullabel------------------")
    println(nfirstName)
//    println(nlastName.length)
    println(nlastName?.length)
    var tampungScore1: String = "${nscore.toString()}"
    var tampungScore2: String = "${nscore.toString().length}"
    println(tampungScore1.length)
    println(tampungScore2?.length)
    println("--------------Variable Constant-----------------")
    println(APP)
    println("Versi : $VERSION")
}