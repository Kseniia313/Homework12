package HW13;

import java.util.Objects;

public class Book {
    private String bookName;
    public int bookPublication;
    private Author name;

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

    @Override
    public String toString() {
        return "Название книги" + bookName+", она опубликована в " + bookPublication + ", автор " + name; }

    @Override
    public boolean equals(Object other) {
        if ( this.getClass() != other.getClass()){
            return false;
        }
        Book book = (Book) other;
        return book.name.equals( book.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
