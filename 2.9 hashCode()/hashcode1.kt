// hashcode adalah representasi angka dari suatu objek
// kita bisa mendapatkannya dengan method hashCode()
// selain hashcode dari objek, kita juga bisa mendapat hashcode dari properti

class Company(val name: String) {
    override fun hashCode(): Int {
        return super.hashCode();
    }
    
    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Company -> this.name == other.name
            else -> false
        }
    }
}

fun main() {
    var company1 = Company("Indofood")
    var company2 = Company("Indofood")
    
    println("company1.name = " + company1.name)
    println("company2.name = " + company2.name)
    
    println()
    
    println("Hashcode objek company1 = " + company1.hashCode().toString())
    println("Hashcode objek company2 = " + company2.hashCode().toString())
    
    // membandingkan hashcode company1 dan company2
    
    println("Apakah hashcode company1 sama dengan company2 ? " + (company1.hashCode()==company2.hashCode()).toString())
    
    
    // kita juga bisa mendapat hashcode dari properti suatu objek
    
    println("Apakah hashcode company1.name sama dengan company2.name ? " + (company1.name.hashCode()==company2.name.hashCode()).toString())
    println()
    
    
    // hashCode juga bisa digunakan pada variabel dan apapun, intinya yang termasuk objek bisa kita gunakan method hashCode padanya
    
    var nama: String= "Ucok"
    var angka: Int = 2323
    
    println(nama.hashCode())
    println(angka.hashCode()) // hanya menampilkan angka yang sama seperti value variabel
    
}
