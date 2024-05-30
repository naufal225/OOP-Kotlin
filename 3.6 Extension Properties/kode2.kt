// Extension Properties
// contoh lain

val String.panjang: Int
    get() = this.length
   
fun main() {
    var nama: String = "Hello World"
    println(nama.panjang)
}
