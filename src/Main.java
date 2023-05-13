import HW13.Author;
import HW13.Book;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", " Толстой ");
        Book book1 = new Book(" Анна Каренина ", +1960, author1);
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
        System.out.println();

        System.out.println(book1);
        System.out.println(book2);

        System.out.println();

        System.out.println("author1.hashCode() = " + author1.hashCode());
        System.out.println("author2.hashCode() = " + author2.hashCode());
        System.out.println("author1.equals() = " + author1.equals(author2));

        System.out.println();
        System.out.println("book1.hashCode() = " + book1.hashCode());
        System.out.println("book2.hashCode() = " + book2.hashCode());
        System.out.println("book1.equals() = " + book1.equals(book2));


    }

}













    
