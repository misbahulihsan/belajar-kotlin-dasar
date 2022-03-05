fun main() {

    tailrec fun display(value: Int){
        println("Nilai Recursive = $value")

        if (value > 0) {
            display(value -1 )
        }

    }

    display(10)

    tailrec fun factorialRecursive(values: Int): Int{
        return when (values) {
            
            1 -> 1
            else -> values * factorialRecursive(values -1)
        }
    }

    println(factorialRecursive(30))


}