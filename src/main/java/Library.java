import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int bookCount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (this.books.size() < this.capacity) {
            this.books.add(book);
        }
    }

    public boolean hasBookInStock(Book book) {
        if (books.contains(book)) {
            return true;
        }
        return false;
    }

    public int lendBook(Book book) {
        this.books.remove(book);
        return this.books.size();
    }


}
