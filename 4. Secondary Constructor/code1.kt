class Person(firstNameParam: String, middleNameParam: String?, lastNameParam: String) {
    var firstname: String = firstNameParam
    var middlename: String? = middleNameParam
    var lastname: String = lastNameParam
    
    constructor(firstNameParam: String, lastNameParam: String) : this(firstNameParam, null, lastNameParam) { // opsi konstruktor jika tidak punya nama tengah
        println("$firstNameParam tidak punya middlename")
    }
    
}

fun main() {
    var budi = Person("Budi", "Haryanto", "Jumawa")
    println(budi.firstname)
    println(budi.middlename)
    println(budi.lastname)
    
    var cecep = Person("Cecep", "Surecep") 
    println(cecep.firstname)
    println(cecep.middlename)
    println(cecep.lastname)
}
