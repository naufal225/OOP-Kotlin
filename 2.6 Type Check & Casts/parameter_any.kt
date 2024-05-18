class Laptop(val brand: String)

fun printObject(any: Any){ // karena semua kelas adalah turunan dari kelas Any, maka jika kita membuat function dengan parameter bertipe Any maka dapat menerima semua tipe data
    println(any)
}

fun main() {
    var laptop1 = Laptop("Asus")
    printObject("Siapa")
    printObject(1)
    printObject(laptop1)
    printObject(Laptop("Lenovo"))
}
