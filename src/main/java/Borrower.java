import java.util.ArrayList;

public class Borrower {


    private ArrayList <Book> collection;


    public Borrower(){
        collection = new ArrayList<>();
    }

    public ArrayList<Book> getCollection() {
        return collection;
    }

    public void setCollection(ArrayList<Book> collection) {
        this.collection = collection;
    }

    public void addToCollection(Book book) {
        this.collection.add(book);
    }

    public int collectionCount() {
        return this.collection.size();
    }

}
