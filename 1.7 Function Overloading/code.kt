class Person( // membuat properties di dalam primary constructor
	val firstName: String,
    val middleName: String? = null,
    val lastName: String
) {
    
    // membuat function overloading
    // membuat function atau method dengan nama yang sama namun isi parameternya harus berbeda jumlah atau tipe data parameter nya
    fun sayHello(firstName: String) { // paramter firstName dengan data type string
        println("Hello, My name is " + firstName)
    }
    
    fun sayHello(age: Int) { // parameter age dengan data type Int
        println("Hello, I am " + age.toString())
    }
    
    fun sayHello(firstName: String, age: Int) { // dua parameter
        println("Hello, My name is $firstName and i'm $age years old")
    }
    
}

fun main() {
    var agus = Person("Agus", "Harimurti", "Yudhoyono") // pendeklarasian dengan semua parameter terisi, tidak butuh named parameter
    println(agus.firstName)
    println(agus.middleName)
    println(agus.lastName)
    
    agus.sayHello("Agus")
    agus.sayHello(16)
    agus.sayHello("Agus", 16)
}
