class Person(nameParam: String, ageParam: Int) { // primary constructor
    var name: String = nameParam
    var age: Int = ageParam
    
    // secondary constructor jika hanya memasukan nama
    // maka nama sesuai dengan argumen, tapi umur default nya 12
    constructor(nameParam: String) : this(nameParam, 12) {
        println("Secondary Constructor") // akan diprint ketika secondary constructor dipanggil
    }
    
}

fun main() {
    var eko = Person("Eko", 14) // secondary constructor tidak dipanggil
    println(eko.name)
    println(eko.age)
    
    var budi = Person("Budi") // secondary constructor dipanggil
    println(budi.name)
    println(budi.age)
}
