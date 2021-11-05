package pro.sky.java.course1.homework8_9;

import java.util.Objects;

public class Author {

    private final String authorName;
    private final String authorLastName;
    private int id;


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

    public boolean equals (Object other) {
        if (this.getClass() != other.getClass()){
            return false;
        }
        Author author = (Author) other;
        return authorLastName == author.authorLastName;
    }

    public int hashCode() {
        return Objects.hash(id);
    }






}


