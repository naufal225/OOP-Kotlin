// Extension Properties
// untuk membuat extension properties, kita bisa memanfaatkan getter dan sette

class Student(var name: String, var age: Int)

val Student.upperName: String 
    get() = this.name.toUpperCase()


fun main() {
    val student1 = Student("Eko", 15)
    println(student1.upperName)
}
