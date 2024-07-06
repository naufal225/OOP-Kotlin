object Mobil {
    val nama: String = "Mobil 1"
    fun jalan(any: String) {
        println(any)
    }
}


fun main() {
    println(Mobil.nama) 
    Mobil.jalan("Mobil jalan")
}
