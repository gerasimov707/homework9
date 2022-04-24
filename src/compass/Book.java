package compass;

public class Book {
    private String nameBook;
    private Author bookAuthor;
    private int publishYear;

    public Book(String nameBook, Author bookAuthor, int publishYear){
        this.nameBook = nameBook;
        this.bookAuthor = bookAuthor;
        this.publishYear = publishYear;
    }
    public String getNameBook(){
        return this.nameBook;
    }
    public Author getBookAuthor(){
        return this.bookAuthor;
    }
    public void publishYear(int publishYear){
        this.publishYear = publishYear;
    }
    public String toString(){
        return " " + this.nameBook + " " + this.bookAuthor + " " + this.publishYear + " ";
    }
}

