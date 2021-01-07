import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;

    @Before
    public void setUp(){
        book = new Book("His Dark Materials", "Phillip Pullman", "Adventure");

    }

    @Test
    public void doesBookHaveName(){
        assertEquals("His Dark Materials", book.bookName());
    }

    @Test
    public void doesBookHaveAuthor(){
        assertEquals("Phillip Pullman", book.bookAuthor());
    }

    @Test
    public void doesBookHaveGenre(){
        assertEquals("Adventure", book.bookGenre());
    }
}
