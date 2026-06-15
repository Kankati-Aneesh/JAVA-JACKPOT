import community.*;

import java.io.BufferedReader;
import java.util.List;
public class Demo1 extends BookInfo {
    public static void main(String[] args) {
        // Read data from file and create Book objects
        List<Book> books = readDataFromFile("data.txt");

        // Create Library object
        Library library = new Library(books);

        // Demonstrate methods
        Book[] allBooks = library.getAllBooks();
        System.out.println("All Books:");
        for (Book book : allBooks) {
            printBookInfo(book);
        }

        String searchID = "000003";
        Book bookByID = library.getBookByID(searchID);
        if (bookByID != null) {
            System.out.println("Book with ID " + searchID + ":");
            printBookInfo(bookByID);
        } else {
            System.out.println("Book with ID " + searchID + " not found.");
        }

        String author = "author2";
        List<Book> booksByAuthor = library.getBooksByAuthor(author);
        System.out.println("Books by author " + author + ":");
        for (Book book : booksByAuthor) {
            printBookInfo(book);
        }

        double minPrice = 100.00;
        double maxPrice = 1000.00;
        List<Book> booksBetweenPrice = library.getBooksBetweenPrice(minPrice, maxPrice);
        System.out.println("Books between price " + minPrice + " and " + maxPrice + ":");
        for (Book book : booksBetweenPrice) {
            printBookInfo(book);
        }

      
        }
    }

