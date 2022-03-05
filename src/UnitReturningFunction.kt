fun main() {
    printHello("Ihsan")
    printHello(null)
    printHello()
}
//  Unit , menandakan tidak ada return. tapi unit sebetulnya
//  adalah mengambalikan data yang tidak ada
//  kembalian data return, Unit tidak wajib

 fun printHello(name: String? =""): Unit{
    if (name == null){
        println("Hallo data NULL")
    }else if(name ==""){
        println("Hallo inputan kosong")
    }else{
        println("Hallo $name")
    }

}