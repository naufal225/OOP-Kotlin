enum class Gender {
    MALE, FEMALE
}

fun main() {
    val man = Gender.MALE
    val woman = Gender.FEMALE
    val allGenders : Array<Gender> = Gender.values()
    
    println(man)
    println(woman)
    println(allGenders.toList())
}
