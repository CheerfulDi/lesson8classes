package pro.sky.java.course1.homework8;

public class Book {

    private final String bookName;
    private String author;
    private int publishingYear;

    public Book(String bookName, Author author, int publishingYear) {
        this.bookName = bookName;
        this.author = author.getAuthorName() + author.getAuthorLastName();
        this.publishingYear = publishingYear;
    }


    public String getBookName() {
        return this.bookName;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

}
