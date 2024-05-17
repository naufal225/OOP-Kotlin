open class Product(
    val name: String,
    val type: String,
    val price: Long
) {
    constructor(name: String, type: String) : this(name, type, 0)
    constructor(name: String) : this(name, "Standard")
}

class StandardProduct: Product {
    constructor(name: String): super(name, "Standard")
    constructor(name: String, price: Long): super(name, "Standard", price)
}

class PremiumProduct : Product {
    constructor(name: String): super(name, "Premium")
    constructor(name: String, price: Long) : super(name, "Premium", price)
}

fun main() {
    val buku = StandardProduct("Buku", 4000)
    val buku_bagus = PremiumProduct("Buku Bagus", 9000)
    println(buku.name)
    println(buku.type)
    println(buku.price)
    println()
    println(buku_bagus.name)
    println(buku_bagus.type)
    println(buku_bagus.price)
}
