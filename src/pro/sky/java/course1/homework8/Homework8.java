package pro.sky.java.course1.homework8;

import java.util.Arrays;

public class Homework8 {

    public static void main(String[] args) {

        Author pullman = new Author("Филип Пулман");
        Book darkMaterials = new Book("Чудесный нож", pullman.getAuthorName(), 2021);

//        System.out.println("Информация о книге №1: ");
//        System.out.println("Автор: " + darkMaterials.getAuthor());
//        System.out.println("Название: " + darkMaterials.getBookName());
//        System.out.println("Год издания: " + darkMaterials.getPublishingYear());

        Author fry = new Author("Стивен Фрай");
        Book myths = new Book("Греческие мифы в пересказе", fry.getAuthorName(), 2018);

//        System.out.println("Информация о книге №1: ");
//        System.out.println("Автор: " + myths.getAuthor());
//        System.out.println("Название: " + myths.getBookName());
//        System.out.println("Год издания: " + myths.getPublishingYear());
        myths.setPublishingYear(2020);
//        System.out.println("Переиздание: " + myths.getPublishingYear());

        Book[] bookShelf = new Book [5];
        addNewBook(bookShelf, darkMaterials);
        addNewBook(bookShelf, myths);
        printBookShelf(bookShelf, darkMaterials);
        printBookShelf(bookShelf, myths);

        }

    public static Book [] addNewBook(Book [] bookShelf, Book book) {
        for (int i = 0; i < bookShelf.length; i++) {
            if (bookShelf[i] == null) {
                bookShelf[i] = book;
                break;
            }
        } return bookShelf;
    }

    public static void printBookShelf (Book [] bookShelf, Book book) {
        for (int i = 0; i < bookShelf.length; i++) {
            System.out.println(book.getAuthor() + ": " + book.getBookName() + ": " + book.getPublishingYear());
            break;
        }

    }
}
