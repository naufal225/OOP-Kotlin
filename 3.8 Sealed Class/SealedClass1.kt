// Sealed Class
// adalah class yang didesain untuk inheritance
// sealed class secara otomatis adalah abstract class
// selaed class cocok untuk sebagai parent class

sealed class Operation(val name: String)
class Plus(): Operation("plus")
class Minus(): Operation("minus")

fun operation(value1: Int, value2: Int, operation: Operation): Int {
    return when (operation) {
        is Plus -> value1 + value2
        is Minus -> value1 - value2
    }
}

fun main() {
    println(operation(2,4,Plus()))
    println(operation(4,3,Minus()))
}
