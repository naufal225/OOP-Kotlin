// Anonymous Class
/*

Anonymous class adalah class yang bisa kita buat objek tanpa nama

biasanya kita membuat objek harus dwngan deklarasi yang lengkap

dengan ini, kita bisa membuat kelas tanpa nama

bahkan kita bisa membuat class dari interface atau abstractClass atau class yang belum lengkap

kemampuam ini disebut AnonymousClass

membuat class dengan cara biasa adalah
var namaObj = Class(properti) 

namun, dengan anonymous class, kita bisa membuat class tanpa nama dengan keyword object
contoh:

var namaObj = object : namaAbstractClass() {
    implemwntasi abstract class atau interface
}

*/

interface ExampleOne {
    fun ExampleOne()
}

abstract class ExampleTwo(var name: String) {
    abstract fun ExampleTwo()
}

fun main(){
    var example1 = object:ExampleOne{
        override fun ExampleOne() = println("Hello World")
    }
    
    var example2 = object:ExampleTwo("Cihuy") {
        override fun ExampleTwo() {
            println("Hello, I am ${this.name}")
        }
    }
    
    example1.ExampleOne()
    example2.ExampleTwo()
}
