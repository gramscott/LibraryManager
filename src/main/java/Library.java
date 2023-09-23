import java.util.ArrayList;

public class Library {

    private ArrayList <Book> books;

    private int capacity;


    public Library (int capacity){
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public boolean addBook(Book book) {
        if (bookCount() < capacity){
            books.add(book);
            return true;
        }
        return false;
    }


    public int bookCount() {
        return books.size();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
