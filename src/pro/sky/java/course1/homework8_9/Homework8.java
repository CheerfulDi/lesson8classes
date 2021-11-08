package pro.sky.java.course1.homework8_9;

public class Homework8 {

    public static void main(String[] args) {

        Author pullman = new Author("Philip", "Pullman");
        Book darkMaterials = new Book("The Subtle Knife", pullman, 2021);

        Author fry = new Author("Stephen", "Fry");
        Book myths = new Book("Mythos: A Retelling of the Myths of Ancient Greece", fry, 2018);

//        myths.setPublishingYear(2020);

        Library bookShelf = new Library(5);
        bookShelf.addNewBook(darkMaterials);
        bookShelf.addNewBook(myths);

        bookShelf.printBookShelf(darkMaterials);
        bookShelf.printBookShelf(myths);
        System.out.println();
        bookShelf.printBookInformationByName("Mythos: A Retelling of the Myths of Ancient Greece");
        System.out.println("Первоначальный год издания книги " + myths.getBookName());
        bookShelf.printBookInformationByName("Mythos: A Retelling of the Myths of Ancient Greece");

        bookShelf.changePublishingYearByBookName("Mythos: A Retelling of the Myths of Ancient Greece", 2020);
        System.out.println("Новый год издания книги " + myths.getBookName());
        bookShelf.printBookInformationByName("Mythos: A Retelling of the Myths of Ancient Greece");

        // HOMEWORK 9
        System.out.println();
        System.out.println("Homework 9");
        System.out.println();
//        System.out.println(myths.toString());
//        System.out.println();
//        System.out.println(darkMaterials.toString());
        System.out.println(bookShelf.toString());

    }
}
