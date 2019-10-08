import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Library library;
    Borrower borrower;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;

    @Before
    public void before() {
        library = new Library(4);
        book1 = new Book("Great Expectations", "Charles Dickens", "classic");
        book2 = new Book("Fall of Giants", "Ken Follet", "Historical Fiction");
        book3 = new Book("Dubliners", "James Joyce", "Social Realism");
        book4 = new Book("Animal Farm", "George Orwell", "Political History");
        book5 = new Book("Pride and Prejudice", "Jane Austin", "Romance");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        borrower = new Borrower(library);
    }

    @Test
    public void getCollection() {
        assertEquals(0, borrower.getCollection());
    }

    @Test
    public void hasReachedLibrary() {
        assertEquals(library, borrower.goToLibrary());
    }

    @Test
    public void canBorrowBook() {
        borrower.borrowBook(book1);
        borrower.borrowBook(book2);
        assertEquals(2, borrower.getCollection());
    }

    @Test
    public void canFailToBorrowBook(){
        borrower.borrowBook(book1);
        borrower.borrowBook(book2);
        borrower.borrowBook(book5);
        assertEquals(2, borrower.getCollection());
    }
}
