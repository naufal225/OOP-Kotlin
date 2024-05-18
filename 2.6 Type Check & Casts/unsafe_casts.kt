class Laptop(val brand: String)
class Handphone(val brand: String)

fun printObject(any: Any){
    var value = any as String //memaksa any sebagai String
    //jika memang string maka akan berhasil
    //jika tidak maka akan error
    println(value)
}

fun main() {
    var laptop1 = Laptop("Asus")
    
    printObject("Siapa") //Berhasil
    //printObject(1) //Error
}
