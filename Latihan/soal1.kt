open class Mahasiswa(
    val nama: String, 
    val nim: String,
    val jurusan: String
) {
    
    constructor(jurusan: String) : this("Tidak Diketahui", "00000", jurusan)
    
    open fun getDetail() {
        println("------------------------------")
        println("Nama.       : ${this.nama}")
        println("NIM.        : ${this.nim}")
        println("Jurusan     : ${this.jurusan}")
        println("------------------------------")
    }
}

class Dosen(
    nama: String,
    nim: String,
    jurusan: String,
    val mata_kuliah: String
) : Mahasiswa(nama,nim,jurusan) {
    override fun getDetail() {
        println("------------------------------")
        println("Nama.       : ${this.nama}")
        println("NIM.        : ${this.nim}")
        println("Jurusan.    : ${this.jurusan}")
        println("Mata Kuliah : ${this.mata_kuliah}")
        println("------------------------------")
    }
}

fun cekDetail(any: Any) {
    when (any) {
        is Mahasiswa -> any.getDetail()
        is Dosen -> any.getDetail()
        else -> println("Bukan Dosen Atau Mahasiswa")
    }
}

fun main() {
    val mahasiswa1 = Mahasiswa("Budi","12345","Informatika")
    val mahasiswa2 = Mahasiswa("Fisika")
    val dosen1 = Dosen("Bu Siti", "54331", "Informatika", "Pemrograman")
    
    mahasiswa1.getDetail()
    mahasiswa2.getDetail()
    
    cekDetail(mahasiswa1)
    cekDetail(dosen1)
}
