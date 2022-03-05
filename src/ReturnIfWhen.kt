fun main() {

    fun rtnIf(name: String = ""): String{
//        if(name == ""){
//            return "Hello Bro"
//        }else{
//            return "Hello $name"
//        }
        return if(name == ""){
             "Hello Bro"
        }else{
            "Hello $name"
        }

    }

    println(rtnIf())
    println(rtnIf("IHSAN"))

    println("----------------------")

    println(rtnWhen())
    println(rtnWhen("MISBAHUL"))

}

fun rtnWhen(nama: String = ""): String {
    return when(nama){
        "" -> "Hello Mas"
        else -> "Holla holla $nama"
    }
}
