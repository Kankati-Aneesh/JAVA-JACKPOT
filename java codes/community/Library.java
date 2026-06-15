package community;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public Book[] getAllBooks() {
        return books.toArray(new Book[0]);
    }

    public Book getBookByID(String bookID) {
        for (Book book : books) {
            if (book.getBookID().equals(bookID)) {
                return book;
            }
        }
        return null; // Book not found
    }

    public List<Book> getBooksByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getBookAuthor().equals(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    public List<Book> getBooksBetweenPrice(double minPrice, double maxPrice) {
        List<Book> booksBetweenPrice = new ArrayList<>();
        for (Book book : books) {
            if (book.getBookPrice() >= minPrice && book.getBookPrice() <= maxPrice) {
                booksBetweenPrice.add(book);
            }
        }
        return booksBetweenPrice;
    }
}
