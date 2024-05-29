interface Animal {
    fun eat()
    fun sleep()
    
    fun move() {
        println("I am moving!")
    }
}

class Cat(var name: String) : Animal {
    override fun eat() {
       println("The cat is eating!")
    }
    override fun sleep() {
        println("The cat is sleeping!")
    }
}

class Dog(var name: String) : Animal {
    override fun eat() {
       println("The dog is eating!")
    }
    override fun sleep() {
        println("The dog is sleeping!")
    }
}


fun main() {
    val cat1 = Cat("www")
    val dog1 = Dog("hhh")
    
    fun doSomething(any: Animal) {
        any.eat()
        any.move()
        any.sleep()
    }
    
    
    doSomething(cat1)
    doSomething(dog1)
}
