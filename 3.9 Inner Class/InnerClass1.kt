// Inner Class
// di Kotlin, kita bisa membuat inner class di dalam outer class
// namun, inner class tidak bisa mengakses properti outer class
// agar bisa mengaksssnya, harus gunakan keyword inner

// namun saat kita menggunakan inner class, cara penginstansiasiannya nanti agak laen
// yaitu dengan membuat objek dari outer class nya dulu

class Boss(val name: String) {
    inner class Employee(val name: String) {
        fun hi() {
            println("Hello, I'm ${this.name}, and my boss name is ${this@Boss.name}") // cara mengakses properti name pada class Boss, yakni menambahkan @namaouterclass.properti setelah this
        }
    }
}

fun main() {
    var budi = Boss("Budi") // membuat instansiasi budi dari class Boss
    var eko = budi.Employee("Eko") // menggunakan objek budi untuk membuat objek dari inner class boss
    eko.hi()
}
