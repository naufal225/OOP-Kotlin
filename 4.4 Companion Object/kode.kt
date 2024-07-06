class Application(val name: String) {
    companion object {
        fun toUpper(name: String) {
            println(name.toUpperCase())
        }
    }
}

fun main() {
    // Application.Companion.toUpper("budi")
    Application.toUpper("Budi")
}
