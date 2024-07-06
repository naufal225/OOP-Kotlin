enum class Gender(val description: String) {
    MALE("Laki-laki"), 
    FEMALE("Perempuan");
    
    fun showDescription() {
        println(this.description)
    }
}

fun main() {
    val man = Gender.MALE
    val woman = Gender.FEMALE
    val allGenders : Array<Gender> = Gender.values()
    
    println(man)
    println(woman)
    println(allGenders.toList())
    
    man.showDescription()
    woman.showDescription()
}
