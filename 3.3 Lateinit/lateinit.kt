class Buku {
    lateinit var judul: String // membuat properti buku yang akan diinisialisasi belakangan
    
    fun initBuku(judul: String) {
        this.judul = judul
    }
}

fun main() {
    var buku1 = Buku()
    //println(buku1.judul) //error karena belum diinisialisasi
    buku1.initBuku("Laskar Pelangi")
    println(buku1.judul) // berhasil
    
    var buku2 = Buku()
    buku2.judul = "Habis Gelap Terbitlah Terang" //bisa juga, yang penting diinisialisasi
    println(buku2.judul)
}
