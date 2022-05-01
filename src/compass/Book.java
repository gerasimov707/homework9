
package compass;
import java.util.Objects;

public class Book {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishYear == book.publishYear && nameBook.equals(book.nameBook) && bookAuthor.equals(book.bookAuthor);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nameBook, bookAuthor, publishYear);
    }
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

