
package iud;

import dao.BookDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.BookUtil;


public class Delete extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
    res.setContentType("text/html");
    PrintWriter ps=res.getWriter();
    int bId=Integer.parseInt(req.getParameter("bid"));   
    BookUtil book=new BookDao();
    if(book.deleteBook(bId))
        ps.write("<h3>Succesfully deleted</h3>");
    else
         ps.write("<h3>Deletion Failed!!! :( Try Again...</h3>");
    }
    
}
