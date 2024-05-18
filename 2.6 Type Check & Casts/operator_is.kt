// operator is digunakan untuk mengecek apakah suatu object memiliki tipe data tertentu

// operator !is digunakan untuk mengecek jika bukan

class Laptop(val brand: String)
class Handphone(val brand: String)

fun printObject(any: Any){ // karena semua kelas adalah turunan dari kelas Any, maka jika kita membuat function dengan parameter bertipe Any maka dapat menerima semua tipe data
    if(any is Laptop) {
        println("Ini laptop " + any.brand)
    } else if(any is Handphone) {
        println("Ini Hp " + any.brand)
    } else {
        println(any)
    }
}

fun main() {
    var laptop1 = Laptop("Asus")
    printObject("Siapa")
    printObject(1)
    printObject(laptop1)
    printObject(Laptop("Lenovo"))
    printObject(Handphone("Samsung"))
}
