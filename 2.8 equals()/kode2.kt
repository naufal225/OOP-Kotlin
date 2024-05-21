// method equals juga bisa dioverride
// sehingga pengecekan hanya dilakukan pada suatu properti saja


class Company(val name: String) {
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
    
    println(company1.equals(company2)) //true
    println(company1.equals(company1)) //true
    println(company2.equals(company2)) //true
}
