
package demo;

import java.io.IOException;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Hello extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
      res.setContentType("text/html");
      PrintWriter ps=res.getWriter();
      String name=req.getParameter("name");
      ps.write("Hello "+name);      
    }
    
}
