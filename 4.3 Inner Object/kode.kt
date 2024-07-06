class Application(val name: String) {
    object Utilities {
        fun toUpper(any: String) {
            println(any.toUpperCase())
        }
    }
}

fun main() {
    Application.Utilities.toUpper("budi")
}
