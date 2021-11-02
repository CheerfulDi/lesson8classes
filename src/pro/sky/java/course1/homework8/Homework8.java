package pro.sky.java.course1.homework8;

import java.util.Arrays;

public class Homework8 {

    static Book[] bookShelf = new Book[5];

    public static void main(String[] args) {

        //Минимальный уровень

        System.out.println();
        System.out.println("Минимальный уровень, результат вывода на консоль:");
        System.out.println();

        Author pullman = new Author("Филип", "Пулман");
        Book darkMaterials = new Book("Чудесный нож", pullman, 2021);

        System.out.println("Информация о книге №1: ");
        System.out.println("Автор: " + darkMaterials.getAuthor().getAuthorName() + " " + darkMaterials.getAuthor().getAuthorLastName());
        System.out.println("Название: " + darkMaterials.getBookName());
        System.out.println("Год издания: " + darkMaterials.getPublishingYear());

        Author fry = new Author("Стивен", "Фрай");
        Book myths = new Book("Греческие мифы в пересказе", fry, 2018);

        System.out.println("Информация о книге №1: ");
        System.out.println("Автор: " + myths.getAuthor().getAuthorName() + " " + myths.getAuthor().getAuthorLastName());
        System.out.println("Название: " + myths.getBookName());
        System.out.println("Год издания: " + myths.getPublishingYear());
        myths.setPublishingYear(2020);
        System.out.println("Переиздание: " + myths.getPublishingYear());

        //Средний уровень

        System.out.println();
        System.out.println("Средний уровень, результат вывода на консоль:");
        System.out.println();


        addNewBook(darkMaterials);
        addNewBook(myths);
        printBookShelf(darkMaterials);
        printBookShelf(myths);



    }

    public static Book[] addNewBook(Book book) {
        for (int i = 0; i < bookShelf.length; i++) {
            if (bookShelf[i] == null) {
                bookShelf[i] = book;
                break;
            }
        }
        return bookShelf;
    }

    public static void printBookShelf(Book book) {
        for (Book book1 : bookShelf) {
            if (book1 != null) {
                System.out.println(book.getAuthor().getAuthorName() + " " + book.getAuthor().getAuthorLastName() + ": " + book.getBookName() + ": " + book.getPublishingYear());
                break;
            }

        }
    }
}
