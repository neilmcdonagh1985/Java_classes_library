import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;
    private Library library;

    public Borrower(Library library) {
        this.collection = new ArrayList<Book>();
        this.library = library;
    }

    public int getCollection() {
        return this.collection.size();
    }

    public Library goToLibrary() {
        return this.library;
    }

    public int borrowBook(Book book) {
        if (this.library.hasBookInStock(book)) {
            this.collection.add(book);
            library.lendBook(book);
            return this.collection.size();
        }
        return this.collection.size();
    }


}
