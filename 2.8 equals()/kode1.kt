// Method equals digunakan untuk membandingkan 2 objek
// jika objek sama, maka true
// jika beda meskipun properti nya sama, false


class Company(val name: String)

fun main() {
    var company1 = Company("Indofood")
    var company2 = Company("Inoac")
    
    println(company1.equals(company2)) //false
    println(company1.equals(company1)) //true
    println(company2.equals(company2)) //true
}
