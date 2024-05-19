class User(
    val nama: String,
    val umur: Int
) {
    override fun toString(): String {
        println(super.toString())
        return ("nama=${nama}, umur=${umur}")
    }
}

fun main(){
    val user1 = User("Budi",12)
    println(user1)
}
