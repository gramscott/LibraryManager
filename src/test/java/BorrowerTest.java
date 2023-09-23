import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;

    Library library;

    Book book;

    @Before
    public void setUp(){
        borrower = new Borrower();
        library = new Library(100);
        book = new Book("The Borrowers", "Mary Norton", "Fantasy");
    }

    @Test
    public void canAddToCollection(){
        borrower.addToCollection(book);
        assertEquals(1, borrower.collectionCount());
    }

    @Test
    public void canCountBooksInCollection(){
        borrower.addToCollection(book);
        borrower.addToCollection(book);
        borrower.collectionCount();
        assertEquals(2, borrower.collectionCount());
    }




}
