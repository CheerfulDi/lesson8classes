package pro.sky.java.course1.homework8_9;

import java.util.Objects;

public class Book {

    private final String bookName;
    private Author author;
    private int publishingYear;
    private int bookId;

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
        return "Автор книги: " + author.toString() + ". Название: " + this.bookName + ". Год издания: " + this.publishingYear;
    }

    public boolean equals (Object other) {
        if (this.getClass() != other.getClass()){
            return false;
        }
        Book book = (Book) other;
        return publishingYear == book.publishingYear;
    }

    public int hashCode() {
        return Objects.hash(bookId);
    }

}
