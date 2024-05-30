// Data Class
// digunakan sebagai representasi dari data
// otomatis sudah punya function hashCode, equals, toString, dan copy dari semua properties di primary constructor nya

data class Product(
    val name: String,
    val price: Int,
    val category: String
)

fun main() {
    var produk1 = Product("Indomie", 5_000, "Makanan")
    println(produk1) // sama saja dengan toString()
    println(produk1.hashCode())
    println(produk1.equals("Hello World"))
    
    // Kita juga bisa meng copy data class
    
    var produk2 = produk1.copy(name = "Supermie")
    // meng copy dan merubah value nya dengan named parameter  
    println(produk2)
    
}
