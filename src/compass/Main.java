package compass;

public class Main {

    public static void main(String[] args) {

        Author author = new Author("Tom", "Cruz");
        System.out.println(author.getFirstName() + " " + author.getSecondName());
        Author author1 = new Author("Jon", "Week");
        System.out.println(author1.getFirstName() + " " + author1.getSecondName());

        Book nameBook = new Book("Rassvet", author, 2022);
        System.out.println("nameBook = " + nameBook );
        Book nameBook1 = new Book("Wor" , author1, 2010);
        System.out.println("nameBook1 = " + nameBook1);
        System.out.println(author.equals(author1));
        System.out.println(nameBook.equals(nameBook1));
    }
}




