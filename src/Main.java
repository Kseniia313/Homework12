import HW12.Author;
import HW12.Book;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Lev", " Tolstoi");
        Book book1 = new Book(" Anna Karenina", +1960, author1);
        System.out.println("author1.nameAuthor = " + author1.getNameAuthor());
        System.out.println("author1.surnameAuthor = " + author1.getSurnameAuthor());
        System.out.println("book1.bookName = " + book1.getBookName());
        System.out.println("book1.bookPublication = " + book1.getBookPublication());
        System.out.println("author1 = " + author1.getNameAuthor() + author1.getSurnameAuthor());
        System.out.println("");



        Author author2 = new Author(" Николай", " Гоголь");
        Book book2 = new Book(" Мертвые души ", +1978, author2);
        System.out.println("author2.nameAuthor = " + author2.getNameAuthor());
        System.out.println("author2.surnameAuthor = " + author2.getSurnameAuthor());
        System.out.println("book2.bookName = " + book2.getBookName());
        System.out.println("book2.bookPublication = " + book2.getBookPublication());
        System.out.println("author2 = " + author2.getNameAuthor() + author2.getSurnameAuthor());
        book2.setBookPublication(1999);
        System.out.println("book2.getBookPublication() = " + book2.getBookPublication());

    }
}













    
