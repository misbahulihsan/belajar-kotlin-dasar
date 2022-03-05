import java.lang.instrument.ClassFileTransformer

fun main() {

    fun hello(name: String, transformer: (String) -> String) : String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val lamdaUpper = { value: String -> value.toUpperCase()}
    println(hello("Ihsan Ganteng", lamdaUpper))

    println(hello("Ihsan", {value: String -> value.toLowerCase() }))

    val result1 = hello("Ihsan", {value: String -> value.toLowerCase()})
    //Trailing Lamda
    val result2 = hello("Ihsan") {value: String ->
        value.toLowerCase()
    }

}