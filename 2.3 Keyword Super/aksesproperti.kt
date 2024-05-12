// dengan menggunakan keyword super, kita bisa mengakses properti kelas parent melalui kelas child

open class Shape {
	open val corner: Int = -1 // open
}

class Rectangle() : Shape() {
	override val corner: Int = 4 // override
    val parrentCorner: Int = super.corner
}

class Triangle() : Shape() { // definiskan ulang di badan program atau block code
	override val corner: Int = 3
    val parrentCorner: Int = super.corner // mengakses properti corner pada kelas shape yang merupakan parent dari kelas rectangle menghiraukan override sebelunya, return -1
}

fun main() {
    var shape = Shape()
    var rectangle = Rectangle()
    var triangle = Triangle()
    
    println(shape.corner)
    println(rectangle.corner)
    println(triangle.corner)
    
    println()
    println(rectangle.parrentCorner)
}
