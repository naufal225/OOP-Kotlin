// Interface
// interface adalah type yang mirip dengan abstract class
// sebagai cetakan atau blueprint di kotlin
// tidak bisa digunakan untuk membuat objek
// hanya untuk diwariskan ke class

interface Interaction {
    // interface tidak butuh konstruktor
    val name: String
    fun sayHello(name: String)
    // properti pada interface jangan diinisialisasi disini, tapi harus di child class nya
    // kecuali function, kita bisa membuat defaultnya
    fun sayHi() {
        println("Hi, I am ${this.name}")
    }
}

interface Go {
    fun go() {
        println("Go!")
    }
}

interface Konsumsi {
    var makan: String
    var minum: String 
}

// kita bisa inheritace interface ke interface, taoi tidak bisa interface dengan class

interface Makan: Konsumsi {
    fun makan() {
        println("makan")
    }
}

// bisa terjadi konflik jika ada interface dengan function yang namanya sama
//maka cara mengatasi nya adalah dengan keyword supe<namainterface>.namaFunc saat memanggil function

interface MoveA {
    fun move(any: String) {
        println("Move A")
    }
}

interface MoveB {
    fun move(any: String) {
        println("Move B")
    }
}

open class contoh(val kata: String = "Cihuy")
//kita juga bisa mewariskan class ke class yang sudah diwariskan interfacenya, tapi class nya tetap cuma boleh 1

class Human(override val name: String) : contoh(), Interaction, Go, MoveA, MoveB {
    // kita bisa menambahkan lebih dari 1 interface untuk sebuah class
    override fun sayHello(name: String) {
        println("Hello, name. My name is ${this.name}")
    }
    override fun move(any: String) {
        if(any=="a" || any=="A") {
            super<MoveA>.move("a")
        } else if(any=="b" || any=="B") {
            super<MoveB>.move("b")
        } 
    }
}

fun main() {
    var human1 = Human("Eko")
    human1.sayHello("Jamal")
    human1.sayHi()
    human1.go()
    println(human1.kata)
    human1.move("b")
}
