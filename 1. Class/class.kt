class person { // deklarasi kelas
    lateinit var name: String // menambahkan properti name yang dideklarasikan nanti
}

fun main() {
    var eko = person() // membuat objek eko sebagai instance dari kelas person
    eko.name = "Eko" // mendeklarasikan properti name objek eko sebagai "Eko"
    print(eko.name) // mencetak name eko
}