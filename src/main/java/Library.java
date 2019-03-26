import java.util.ArrayList;

public class Library {

    // initialise

    private ArrayList<Book> stock;
    private int capacity;


    // newing it up

    public Library(int capacity){
        this.stock = new ArrayList<>();
        this.capacity = capacity;
    }

    public int countBooks(){
        return this.stock.size();
    }

    public void addBook(Book book){
        if (!this.checkIfStockFull()) {
            this.stock.add(book);
        }
    }

    public boolean checkIfStockFull(){
        return (this.stock.size() >= this.capacity);
    }

    public Book removeBook(){
        return this.stock.remove(0);
    }
}
