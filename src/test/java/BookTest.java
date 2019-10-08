import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before() {
        book = new Book("Trainspotting", "Irvine Welsh", "Social Realism");
    }

    @Test
    public void hasTitle() {
        assertEquals("Trainspotting", book.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("Irvine Welsh", book.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("Social Realism", book.getGenre());
    }

}
