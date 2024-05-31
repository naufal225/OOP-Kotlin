// Latihan OOP Kotlin

class Book(val title: String, val author: String, val isbn: String) {
    var avail: Boolean = true
    fun borrowBook() {
        if(avail) {
            avail = false
            println("Sekarang Buku Dipinjam")
        } else {
            println("Buku Tidak Tersedia")
        }
    }
    fun returnBook() {
        if(avail==false) {
            avail = true
            println("Buku Sudah Dikembalikan")
        }
    }
    fun isAvail() {
        if(avail) {
            println("Buku Tersedia")
        } else {
            println("Buku Tidak Tersedia")
        }
    }
}

class Member(val name: String, val address: String) {
    constructor(name: String) : this(name, "")
    fun borrowBook(book: Book) {
        book.borrowBook()
    }
    fun returnBook(book: Book) {
        book.returnBook()
    }
}

class Library(val name: String) {
    private var Books = mutableListOf<Book>()
    private var Members = mutableListOf<Member>()
    
    fun addBook(book: Book) {
        Books.add(book)
        println("${book.title} Sudah Ditambahkan")
    }
    
    fun addMember(member: Member) {
        Members.add(member)
        println("${member.name} Sudah Ditambahkan")
    }
    
    fun findBookByTitle(title: String): Book?{
        return Books.find {it.title == title}
    }
}

abstract class Transaction(
    val transactionId: String,
    val member: Member,
    val book: Book
) {
    abstract fun execute()
}

class TransactionBorrow(transactionId: String, member: Member, book: Book) : Transaction(transactionId, member, book) {
    override fun execute() {
        member.borrowBook(book)
    }
}

class TransactionReturn(transactionId: String, member: Member, book: Book) : Transaction(transactionId, member, book) {
    override fun execute() {
        member.returnBook(book)
    }
}

fun main(){
    var library1 = Library("Perpus")
    var book1 = Book("Laskar Pelangi", "Andrea Hirata", "123456")
    var member1 = Member("Budi")
    
    library1.addBook(book1)
    
    println(library1.findBookByTitle("Laskar Pelangi"))
    
    var transaction1 = TransactionBorrow("TR001", member1, book1)
    transaction1.execute()
    book1.isAvail()
    
    var transaction2 = TransactionReturn("TR002", member1, book1)
    transaction2.execute()
    book1.isAvail()
}
