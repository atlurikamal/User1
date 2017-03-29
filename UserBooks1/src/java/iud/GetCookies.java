
package iud;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class GetCookies extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
     res.setContentType("text/html");
     PrintWriter pw=res.getWriter();
     pw.write("hi");
     Cookie[] c=req.getCookies();
     for(Cookie ck:c)
     {
        pw.write("Name: "+ck.getName()+" value: "+ck.getValue());
     }
     pw.close();
    }
    
    
}