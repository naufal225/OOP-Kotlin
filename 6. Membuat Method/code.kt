class Person( // membuat properties di dalam primary constructor
	val firstName: String,
    val middleName: String? = null,
    val lastName: String
) {
    fun sayHello() {
        println("Hello, My name is " + this.firstName)
    }
}

fun main() {
    var agus = Person("Agus", "Harimurti", "Yudhoyono") // pendeklarasian dengan semua parameter terisi, tidak butuh named parameter
    println(agus.firstName)
    println(agus.middleName)
    println(agus.lastName)
    
    agus.sayHello()
}
