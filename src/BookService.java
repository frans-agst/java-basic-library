import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    List<Book> getBooksByCategory(String category);
    Book getBookById(Long id);
    void addBook(Book book);
    void updateBook(Book book);
    void deleteBook(Long id);
}
