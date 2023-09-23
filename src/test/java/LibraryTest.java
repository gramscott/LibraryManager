import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {


    Library library;

    Book book;

    @Before
    public void setUp(){
        library = new Library(100);
        book = new Book("The 7 Habits of Highly Effective People", "Stephen R.Covey", "personal development");
    }

    @Test
    public void canCountBooks(){
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void canAddBookAtCapacity(){
        for (int i = 1; i <= 100; i++) {
            assertTrue(library.addBook(new Book("The 7 Habits of Highly Effective People", "Stephen R.Covey", "personal development" + i)));
        }
        assertFalse(library.addBook(new Book("Fifty Shades Of Grey", " E. L. James", "Romance")));
        assertEquals(100, library.bookCount());
    }



}
