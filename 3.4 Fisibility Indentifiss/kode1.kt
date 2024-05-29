// Visibility Modifiers
// ada 4
// public, private, protected dan internal

// public, bisa diakses dimana saja
// private, hanya bisa diakses di block code dimana dia dideklrasikan 
// protected, hanya bisa diakses di block code dan di instance object nya saja
// hanya bisa diakses di module atau project atau folder yang sama

open class Teacher() {
    private fun teach() { // fungsi hanya bisa dipanggil di dalam claaa
        println("teaching")
    }
    protected open fun test() { // bisa diakses di instance dan didalam class turunannya
        println("testing") 
    }
}

class SuperTeacher() : Teacher() {
    override public fun test() {
        super.test()
    }
}

fun main() {
    var teacher1 = Teacher()
    //teacher1.teach() //error
    //teacher1.eat() // error
    var teacher2 = SuperTeacher()
    teacher2.test()
}
