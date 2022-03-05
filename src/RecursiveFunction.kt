fun main() {
//  Looping
    fun factorialLoop(value: Int): Int{
        var result = 1
        for (i in value downTo  1){
            result *= i
        }
            return  result
    }
    println(factorialLoop(10))


//  Recursive
    fun factorialRecursive(values: Int): Int{
        return when (values) {
            1 -> 1
            else -> values * factorialRecursive(values -1)
        }
    }

    println(factorialRecursive(10))


}