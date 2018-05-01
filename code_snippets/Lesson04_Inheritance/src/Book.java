
/**
 * Created by Leon on 01/05/2018.
 */


public class Book implements Comparable<Book> {

    private int pages = 0;

    public Book(int pages) {
        this.pages = pages;
    }

    @Override
    public int compareTo(Book book) {
        return this.pages - book.pages;
    }
}
