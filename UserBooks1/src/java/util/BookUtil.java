
package util;

import java.util.List;
import model.BookModel;


public interface BookUtil {
    public boolean addBook(BookModel model);
    public boolean updateBook(BookModel model);
    public boolean deleteBook(int bookId,String name);
    public List<BookModel> searchByName(String bName);
    public List<BookModel> searchByAuthor(String aName);
    public List<BookModel> getList(String uname);
    public List<BookModel> getAll();
}
