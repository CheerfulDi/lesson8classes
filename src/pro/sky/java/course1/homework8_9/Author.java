package pro.sky.java.course1.homework8_9;

import java.util.Objects;

public class Author {

    private final String authorName;
    private final String authorLastName;



    public Author(String authorName, String authorLastName) {
        this.authorName = authorName + " ";
        this.authorLastName = authorLastName;

    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorLastName() {
        return this.authorLastName;
    }

    public String toString() {
        return authorName + authorLastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return authorName.equals(author.authorName) && authorLastName.equals(author.authorLastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorLastName);
    }
}


