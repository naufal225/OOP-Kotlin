abstract class Animal() {
    // membuat properti abstract harus menambahkan keyword abstract
    abstract var name: String
    abstract fun run() 
    // properti abstract tidak perlu dideklarasikan
    // dideklarasikan di class childnya saja
}

class Cat(n: String): Animal() {
    override var name: String = n
    override fun run() {
        println("Cat Run!")
    }
}

fun main() {
    var cat = Cat("apalah")
    println(cat.name)
    cat.run()
}
