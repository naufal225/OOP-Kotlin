// kelas any sudah mempunyai function bawaan
// equals(): Boolean
// toString(): String
// hashCode(): Int

class Laptop(val brand: String)

fun main(){
    var laptop1 = Laptop("Asus")
    var laptop2 = Laptop("Asus")
    var laptop3 = Laptop("Msi")
    
    // equals 
    // untuk membandingkan objek atau properti objek
    
    
    println(laptop1.equals(laptop2)) //false, meski properti nya sama tapi kedua objek tersebut berbeda
    println(laptop1.equals(laptop1)) //true, karena mereka objek yang sama
    
    // bisa juga digunakan untuk membandingkan properti
    
    println(laptop1.brand.equals(laptop2.brand)) //membandingkan properti brand dari kedua objek, return true
    
    println(laptop1.brand.equals(laptop3.brand)) // return false
    
    // toString()
    
    println(laptop1.toString())
    println(laptop2.toString())
    println(laptop3.toString())
    
    // hashCode
    
    println(laptop1.hashCode())
    println(laptop2.hashCode())
    println(laptop3.hashCode())
    
}
