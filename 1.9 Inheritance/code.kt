// pewarisan, kelas parent harus diberikan keyword open pada pendeklarasian kelas

open class Job( // pendeklarasian kelas parent
	val jobName: String,
    val salary: Int
) {
    fun myJob() {
		println("I am a ${this.jobName}, my salary is ${this.salary}")
	}
}

class PersonSupir( // membuat properties di dalam primary constructor
	val firstName: String,
    val lastName: String,
) : Job("Driver", 1000000) { // extends dengan ":" (titik dua), inputkan JobName dan Salary
   
   fun sayHello() { 
        println("Hello, My name is " + this.firstName)
    }
    
   
}

fun main() {
    var budi = PersonSupir("Budi", "Koplling")
    budi.sayHello() // output: Hello, My name is Budi
    budi.myJob()
}
