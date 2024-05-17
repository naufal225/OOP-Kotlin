open class Shape(
    val name: String,
    val shape: Int,
    val color: String
) {
    constructor(name: String, shape: Int) : this(name,shape,"")
    constructor(name: String) : this(name, -1, "")
}

class Rectangle: Shape {
    constructor(): super("Rectangle", 4)
    constructor(color: String): super("Rectangle", 4, color)
}

fun main() {
    var rectangle1 = Rectangle()
    var rectangle2 = Rectangle("Red")
    println(rectangle1.name)
    println(rectangle1.shape)
    println(rectangle1.color)
    
    println("")
    
    println(rectangle2.name)
    println(rectangle2.shape)
    println(rectangle2.color)
}
