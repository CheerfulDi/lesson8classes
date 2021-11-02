package pro.sky.java.course1.homework8;

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



}


