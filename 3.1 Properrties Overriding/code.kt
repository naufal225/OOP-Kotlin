// Properties Overriding, adalah cara untuk mendefinisikan ulang properti di child class
// properti di parrent class harus open
// dan saat override menggunakan keyword override dan definisikan ulang

open class Shape {
	open val corner: Int = -1 // open
}

class Rectangle() : Shape() {
	override val corner: Int = 4 // override
}

class Triangle() : Shape() { // definiskan ulang di badan program atau block code
	override val corner: Int = 3
}

fun main() {
    var shape = Shape()
    var rectangle = Rectangle()
    var triangle = Triangle()
    
    println(shape.corner)
    println(rectangle.corner)
    println(triangle.corner)
}
