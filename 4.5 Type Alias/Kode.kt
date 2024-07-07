// Type Alias

// membuat nama berbeda dari tipe data yang sudah ada
// untuk membedakam 2 kelas yang mungkin punya nama yang sama

class Application(val name: String) {
    fun toUpper(any: String) {
        println(any.toUpperCase())
    }
}

typealias App = Application

fun main() {
    val ap1 = App("nama")
    println(ap1.name)
    ap1.toUpper("hellooo")
}
