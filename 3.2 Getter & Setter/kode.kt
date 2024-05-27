class Note(nama: String) {
    var nama: String = nama
    get() {
        println("ambil nilai")
        return field
    }
    set(nilai) {
        println("Anda akan menge-set nilai")
        field = nilai
    }
}

fun main() {
    var note1 = Note("cihuy")
    println(note1.nama)
    note1.nama = "uhy"
    println(note1.nama)
    println(324*5)
}
