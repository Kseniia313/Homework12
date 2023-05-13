package HW13;

import java.util.Objects;

public class Author {
    private String nameAuthor;
    private String surnameAuthor;

    public Author(String nameAuthor, String surnameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }
    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public String getSurnameAuthor() {
        return this.surnameAuthor;
    }

    @Override
    public String toString() {
        return  nameAuthor + surnameAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if ( getClass() != o.getClass()) {
            return false;
        }
        Author author = (Author) o;
        return author.nameAuthor.equals( author.nameAuthor) && author.surnameAuthor.equals(author.surnameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, surnameAuthor);
    }
}


