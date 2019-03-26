import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void before(){
        library = new Library(2);
        book1 = new Book("Fine Balance","Rohinton Mystry", "Historical Fiction");
        book2 = new Book("A Little Life","Hanya Yanagihara", "Modern Fiction");
        book3 = new Book("Pillars of the Earth","Ken Follett", "Historical Fiction");
    }

    @Test
    public void canCountBooks(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void canCheckIfStockFull(){
        library.addBook(book1);
        assertEquals(false, library.checkIfStockFull());
        library.addBook(book2);
        assertEquals(true, library.checkIfStockFull());
    }

    @Test
    public void checkNotAddBookIfFullCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.countBooks());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book1);
        library.removeBook();
        assertEquals(0, library.countBooks());
    }
}