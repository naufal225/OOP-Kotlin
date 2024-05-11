class Person(
	val firstName: String,
    val middleName: String? = null,
    val lastName: String
)

fun main() {
    var budi = Person(firstName = "Budi", lastName = "Hahaha") // tanpa middlename, pendeklarasian dengan named parameter
    println(budi.firstName)
    println(budi.lastName)
    
    var agus = Person("Agus", "Harimurti", "Yudhoyono") // pendeklarasian dengan semua parameter terisi, tidak butuh named parameter
    println(agus.firstName)
    println(agus.middlename)
    println(agus.lastname)
}
