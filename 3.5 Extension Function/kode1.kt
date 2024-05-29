// Extension Function
// saat kita membuat extension function, kita membuat function bantuan saja, kita tidak memodifikasi class
// jadi, tidak terjadi perubahan pada class
// dan function tambahan ini tidak bisa mengakses properti yang private atau protected dari class

open class Student(var name: String, var age: Int) {
    open fun introduce() {
        println("Hello, my name is ${this.name}, i am ${this.age} years old")
    }
}

fun Student.sayHi() { // extension function sayHi()
    println("Hi! I am ${this.name}")
}

class StudentLeader(name: String, age:  Int) : Student(name,age) {
    override fun introduce() {
        println("Hello, my name is ${this.name}, i am ${this.age} years old. I am the leader")
    }
}

fun main() {
    var student1 = Student("Budi", 16)
    var leader1 = StudentLeader("Eko", 17)
    student1.introduce() // bisa
    student1.sayHi() // bisa
    leader1.introduce() // bisa
    leader1.sayHi() // bisa
}
