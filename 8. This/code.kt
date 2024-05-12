class Person( // membuat properties di dalam primary constructor
	val firstName: String,
    val lastName: String
) {
   
   // keyword this digunakan untuk merujuk pada properti pada kelas
   // hanya bisa digunakan dalam kode kelas
   // tidak bisa digunakan di function main()
   fun sayHello() { 
        println("Hello, My name is " + this.firstName) // merujuk pada properti firstName pada kelas Person
    }
    
}

fun main() {
    var budi = Person("Budi", "Koplling")
    budi.sayHello() // output: Hello, My name is Budi
}
