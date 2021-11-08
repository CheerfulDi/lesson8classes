package pro.sky.java.course1.homework8_9;

public class Library {

    private final Book[] bookShelf;

    Library(int bookShelf) {
        this.bookShelf = new Book[bookShelf];
    }

    public void addNewBook(Book book) {
        for (int i = 0; i < bookShelf.length; i++) {
            if (bookShelf[i] == null) {
                bookShelf[i] = book;
                break;
            }
        }
    }

    public void printBookShelf(Book book) {
        for (Book book1 : bookShelf) {
            if (book1 != null) {
                System.out.println(book.getAuthor().getAuthorName() + book.getAuthor().getAuthorLastName() + ": " + book.getBookName() + ": " + book.getPublishingYear());
                break;
            }
        }
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