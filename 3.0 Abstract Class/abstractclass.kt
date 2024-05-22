// Abatract class adalah class yang tidak bisa dipakai, hanya bisa diwariskan atau diturunkan

abstract open class Lokasi(nama: String)

class Negara(val nama: String) : Lokasi(nama)
class Kota(val nama: String) : Lokasi(nama)

fun main() {
    val indonesia = Negara("Indonesia")
    val bekasi = Kota("Bekasi")
    
    println(indonesia.nama)
    println(bekasi.nama)
    
    //val lokasi = Lokasi("Bandung") //error
}
