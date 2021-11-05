package pro.sky.java.course1.homework8_9;

public class Book {

    private final String bookName;
    private Author author;
    private int publishingYear;

    public Book(String bookName, Author author, int publishingYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishingYear = publishingYear;
    }


    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
        }

    public String toString() {
        return "Автор книги: " + this.author + ". Название: " + this.bookName + ". Год издания: " + this.publishingYear;
    }

}
