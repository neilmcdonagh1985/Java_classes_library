import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;
    private Book book6;

    @Before
    public void before() {
        library = new Library(5);
        book1 = new Book("Trainspotting", "Irvine Welsh", "Social Realism");
        book2 = new Book("Fall of Giants", "Ken Follet", "Historical Fiction");
        book3 = new Book("Dubliners", "James Joyce", "Social Realism");
        book4 = new Book("Animal Farm", "George Orwell", "Political History");
        book5 = new Book("Pride and Prejudice", "Jane Austin", "Romance");
        book6 = new Book("To Kill a Mockingbird", "Harper Lee", "classic");

    }

    @Test
    public void hasCapacity() {
        assertEquals(5, library.getCapacity());
    }

    @Test
    public void booksStartEmpty() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book1);
        assertEquals(3, library.bookCount());
    }

    @Test
    public void canBeAtFullBookCapacity() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        assertEquals(5, library.bookCount());
    }

    @Test
    public void canConfirmBookIsInStock() {
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(true, library.hasBookInStock(book1));
    }

    @Test
    public void canFailToLendBook() {
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(false, library.hasBookInStock(book3));
    }

    @Test
    public void canLendBook() {
        library.addBook(book1);
        library.addBook(book2);
        library.lendBook(book1);
        assertEquals(1, library.bookCount());
    }

}
