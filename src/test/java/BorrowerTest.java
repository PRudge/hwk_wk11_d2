import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Borrower borrower;

    @Before
    public void before(){
        library = new Library(6);
        book1 = new Book("Fine Balance","Rohinton Mystry", "Historical Fiction");

        borrower = new Borrower();
    }

    @Test
    public void canBorrowBookFromLibrary(){
        library.addBook(book1);
        borrower.borrowBook(library);
        assertEquals(0, library.countBooks());
        assertEquals(1, borrower.collectionCount());
    }


}