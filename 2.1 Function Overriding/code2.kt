// Function overriding adalah cara untuk menimpa function pada kelas parrent
// syaratnya agar overriding tersebut bisa dilakukan adalah dengan menggunakan keyword open pada function pada kelas parrent

open class Job( 
	val jobName: String,
    val salary: Int
) {
    open fun myJob() { // deklarasi dengan 'open'
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
   
   override fun myJob() { // timpa dengan deklarasi ulang, dengan nama yang sama, dengan keyword override
       println("Hello, My name is ${this.firstName}, i'm a ${this.jobName}, my salary is ${this.salary}, my job is very fun!")
   } // function parent berhasil ditimpa/diubah
    // perubahan hanya terjadi pada kelas ini
   
}

class PersonGuru(
	val firstName: String,
    val lastName: String,
) : Job("Teacher", 300000) {
    fun sayHello() { 
        println("Hello, My name is " + this.firstName)
    }
    
    //tidak melakukan override function, maka tidak ada perubahan, function sesuai parrent
}

fun main() {
    var budi = PersonSupir("Budi", "Koplling")
    budi.sayHello()
    budi.myJob() // memanggil method yang sudah overrided
    
    var asep = PersonGuru("Asep", "Kurniawan")
    asep.myJob()
    
}
