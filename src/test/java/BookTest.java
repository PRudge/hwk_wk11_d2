import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        this.book = new Book("Fine Balance","Rohinton Mystry", "Historical Fiction");
    };

    @Test
    public void hasTitle() {
        assertEquals("Fine Balance", book.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("Rohinton Mystry", book.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("Historical Fiction", book.getGenre());
    }

}





