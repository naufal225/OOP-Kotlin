class person(nameParam: String, ageParam: Int) { // deklarasi kelas dengan konstruktor, parameternya nameParam dan ageParam
    var name: String = nameParam // inisialisasi
    var age: Int = ageParam // inisialisasi
}

fun main() {
    var eko = person("Eko", 16) // buat objek eko dengan name Eko dan age 16
    println(eko.name) // print data
    println(eko.age)
}