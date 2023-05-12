package HW12;

public class Book {
     private String bookName;
    public int bookPublication;
    Author name;

    public Book(String bookName, int bookPublication, Author name) {
        this.bookName = bookName;
        this.bookPublication = bookPublication;
        this.name = name;
    }

    public String getBookName() {
        return bookName;
    }

    public int getBookPublication() {
        return bookPublication;
    }

    public void setBookPublication(int bookPublication) {
        this.bookPublication = bookPublication;
    }

    public Author getName() {
        return name;

    }
}
