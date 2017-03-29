
package iud;

import dao.UserDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.UserModel;
import util.UserUtil;


public class Insert extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
    res.setContentType("text/html");
    PrintWriter ps=res.getWriter();
    String name=req.getParameter("name");
    String pwd=req.getParameter("pwd");    
    UserModel model=new UserModel();
    model.setUname(name);
    model.setPassword(pwd);
    UserUtil user=new UserDao();
    if(user.registerUser(model))
        ps.write("<h3>Succesfully Inserted</h3>");
    else
         ps.write("<h3>Insertion Failed!!! :( Try Again...</h3>");
    }
    
}
