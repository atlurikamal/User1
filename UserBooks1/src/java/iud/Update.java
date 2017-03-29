
package iud;

import dao.BookDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.BookModel;
import util.BookUtil;

public class Update extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
    res.setContentType("text/html");
    PrintWriter ps=res.getWriter();
    String uName=req.getParameter("uname");
    int bId=Integer.parseInt(req.getParameter("bid")); 
    String bName=req.getParameter("bname");
    String auth=req.getParameter("auth");
    int price=Integer.parseInt(req.getParameter("price")); 
    BookModel model=new BookModel(uName,bId,bName,auth,price);
    BookUtil user=new BookDao();
    if(user.updateBook(model))
        ps.write("<h3>Succesfully Updated</h3>");
    else
         ps.write("<h3>Updation Failed!!! :( Try Again...</h3>");
    }
}
