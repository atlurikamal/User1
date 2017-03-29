
package iud;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoCookies extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
     Cookie ck=new Cookie("password","sss");
     res.setContentType("text/html");
     PrintWriter pw=res.getWriter();
     pw.write("hi");
     ck.setMaxAge(24*60*60);
     res.addCookie(ck);
     pw.write("Cookie successfully added");
     pw.close();
    }
    
    
}
