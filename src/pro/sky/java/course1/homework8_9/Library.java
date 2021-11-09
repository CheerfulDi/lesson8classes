package pro.sky.java.course1.homework8_9;

public class Library {

    private final Book[] bookShelf;

    public Library(int bookShelfSize) {
        bookShelf = new Book[bookShelfSize];
    }

    public boolean addNewBook(Book book) {
        for (int i = 0; i < bookShelf.length; i++) {
            if (bookShelf[i] == null) {
                bookShelf[i] = book;
               return true;
            }
        } return false;
    }

    public void printBookShelf() {
        for (Book book : bookShelf) {
            if (book != null) {
                printBook(book);
            }
        }
    }

    public void printBook(Book book) {
        System.out.println(book.getAuthor().getAuthorName() + book.getAuthor().getAuthorLastName() + ": " + book.getBookName() + ": " + book.getPublishingYear());

    }

    public void printBookInformationByName(String bookName) {
        for (Book book : bookShelf) {
            if (book != null && book.getBookName().equals(bookName)) {
                System.out.println(book.getBookName() + " by " + book.getAuthor().getAuthorName() + book.getAuthor().getAuthorLastName()
                        + " was published in " + book.getPublishingYear());
                break;
            }
        }
    }

    public void changePublishingYearByBookName(String bookName, int newPublishingYear) {
        for (Book book: bookShelf) {
            if (book != null && book.getBookName().equals(bookName)){
                book.setPublishingYear(newPublishingYear);
                break;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Book book : bookShelf) {
            if (book != null) {
                sb.append(book);
                sb.append("\n");
            }
        }
        return sb.toString();

    }
}