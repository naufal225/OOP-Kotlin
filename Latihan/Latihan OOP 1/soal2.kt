abstract class Pegawai(val nama: String) {
    abstract fun getTugas(): String
}

class Dosen(nama: String) : Pegawai(nama) {
    override fun getTugas(): String {
        return "Mengajar Dan Meneliti"
    }
}

class Staf(nama: String) : Pegawai(nama) {
    override fun getTugas(): String {
        return "Administrasi"
    }
}

data class MataKuliah(
    val kode: String,
    val nama: String,
    val sks: String
)

fun main() {
    val dosen1 = Dosen("Ucok")
    val staf1 = Staf("Udin")

    println(dosen1.getTugas())  // Output: Mengajar Dan Meneliti
    println(staf1.getTugas())  // Output: Administrasi

    val matakuliah1 = MataKuliah("MK1", "Pemrograman", "3")

    println(matakuliah1.toString())  // Output: MataKuliah(kode=MK1, nama=Pemrograman, sks=3)
    println(matakuliah1.hashCode())  // Output: (hash code value)
    println(matakuliah1.equals(dosen1))  // Output: false
}
