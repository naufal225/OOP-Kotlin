// operator is dan casts dan when expression
class Laptop(val brand: String)
class Handphone(val brand: String)

fun printObject(any: Any){
    when(any){
        is Laptop -> println("Ini adalah laptop ${any.brand}")
        is Handphone -> println("Ini adalah Hp ${any.brand}")
        else -> println(any)
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
