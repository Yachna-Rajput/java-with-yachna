package e_classesAndObjects;

public class Book {

    static int totalNoOfBooks;

    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
        totalNoOfBooks=0;
    }
    {
        totalNoOfBooks++;
    }
    Book(String isbn, String title,String author){
        this.isbn= isbn;
        this.title = title;
        this.author = author;
    }

    static int getTotalNoOfBooks(){
        return totalNoOfBooks;
    }
    Book(String isbn){
        this(isbn , "unknown" , "unknown" );

    }
    void  borrowBook() {
        if (isBorrowed) {
            System.out.println("Book is already borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy the book");
        }
    }
    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed");
        }else{
            System.out.println("This book is already in the library");
        }
    }

    public static void main(String[] args) {
        Book chemistry = new Book("1", "Science" , "author");
        Book physics =  new Book("2" );
        System.out.println(Book.getTotalNoOfBooks());
        chemistry.borrowBook();
        physics.borrowBook();
    }

}
