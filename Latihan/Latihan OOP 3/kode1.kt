// Latihan OOP

class Book(
    var title: String,
    var author: String,
    var isbn: String
) {
    var avail = true
    
    fun borrowBook() {
        if(this.avail) {
            avail = false
            println("Transaksi Berhasil! Buku Sekarang Dipinjam")
        } else {
            println("Buku Tidak Tersedia Sekarang")
        }
    }
    
    fun returnBook() {
        if(this.avail == false) {
            this.avail = true
        }
    }
    
    fun editBook(title: String, isbn: String, author: String, avail: Boolean) {
        this.title = title
        this.author = author
        this.isbn = isbn
        this.author = author
    }
}

class Member(
    var name: String,
    var address: String
) {
    fun borrowBook(book: Book) {
        book.borrowBook()
    }
    
    fun returnBook(book: Book) {
        book.returnBook()
    }
    
    fun editMember(name: String, address: String) {
        this.name = name
        this.address = address
    } 
}

class Library(
    var name: String
) {
    private var Books = mutableListOf<Book>()
    private var Members = mutableListOf<Member>()
    
    fun addBook(book: Book) {
        Books.add(book)
    }
    
    fun addMember(member: Member) {
        Members.add(member)
    }
    
    fun deleteBook(book: Book) {
        Books.remove(book)
    }
    
    fun deleteMember(member: Member) {
        Members.remove(member)
    }
}

abstract class Transaction(
    val transactionId: String,
    val member: Member,
    val book: Book
) {
    abstract fun execute()
}

class TransactionBorrow(
    transactionId: String,
    member: Member,
    book: Book
) : Transaction(transactionId, member, book) {
    override fun execute() {
        member.borrowBook(book)
    }
}

class TransactionReturn(
    transactionId: String,
    member: Member,
    book: Book
) : Transaction(transactionId, member, book) {
    override fun execute() {
        member.returnBook(book)
    }
}

fun main() {
    
}
