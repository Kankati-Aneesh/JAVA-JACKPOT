package community;

public class BookInfo {
    public static void printBookInfo(Book book) {
        System.out.println("Book ID: " + book.getBookID());
        System.out.println("Book Name: " + book.getBookName());
        System.out.println("Book Author: " + book.getBookAuthor());
        System.out.println("Book Price: " + book.getBookPrice());
        System.out.println();
    }
}
