class Laptop(val brand: String)
class Handphone(val brand: String)

fun printObject(any: Any){
    // agar aman kita tambahkan "?" setelah as dan ": tipedata"
    var value : String? = any as? String //memaksa any sebagai String
    //jika memang string maka akan berhasil
    //jika tidak maka akan null
    println(value)
}

fun main() {
    var laptop1 = Laptop("Asus")
    
    printObject("Siapa") //Berhasil
    printObject(5) // Null
}
