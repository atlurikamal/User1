package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.BookDao;
import util.BookUtil;

public final class addBook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/UserMenu.jsp");
    _jspx_dependants.add("/heading.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add Book</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title></title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title></title>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles.css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("           <h1>UserBooks</h1>\r\n");
      out.write("      \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("        <section style=\"background-color: wheat;font-size: 14pt;width:20%;float:left;height:38em\">\n");
      out.write("            <table cellspacing=\"4\" cellpadding=\"4\" style=\"margin-top: 20px;\">\n");
      out.write("            <tr style=\"color: black\"><td>Welcome ");
      out.print(session.getAttribute("uname"));
      out.write("</td></tr>\n");
      out.write("            <tr><td><a href=\"home.jsp\">Home</a></td></tr>\n");
      out.write("            <tr><td><a href=\"viewBooks.jsp\">View Books</a></td></tr>\n");
      out.write("            <tr><td><a href=\"addBook.jsp\">Add a Book</a></td></tr>\n");
      out.write("            <tr><td><a href=\"changePassword.jsp\">Change Password</a></td></tr>\n");
      out.write("            <tr><td><a href=\"logOut.jsp\">LogOut</a></td></tr>\n");
      out.write("        </table> \n");
      out.write("        </section>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <section>\n");
      out.write("            <form method=\"POST\">\n");
      out.write("                <input type=\"hidden\" value='");
      out.print(session.getAttribute("uname"));
      out.write("' name=\"uname\"/>\n");
      out.write("                <table cellspacing=\"4px\" cellpadding=\"4px\" align=\"center\" style='font-size: 14pt'>\n");
      out.write("                <tr><td colspan=\"2\"><h3>ADD BOOK</h3></td></tr> \n");
      out.write("                <tr><td>ISBN</td><td><input type=\"text\" size=\"20\"  required name=\"bid\" /></td></tr>\n");
      out.write("                <tr><td>Book Name</td><td><input type=\"text\" size=\"20\"  required name=\"bname\" /></td></tr> \n");
      out.write("                <tr><td>Author</td><td><input type=\"text\" size=\"20\" required name=\"author\"/></td></tr>\n");
      out.write("                <tr><td>Price(Rs.)</td><td><input type=\"text\" size=\"20\" required name=\"price\"/></td></tr>\n");
      out.write("                <tr><td colspan=\"2\"><input type=\"submit\" value=\"Add book\"/></td></tr>\n");
      out.write("                ");
      model.BookModel model = null;
      synchronized (_jspx_page_context) {
        model = (model.BookModel) _jspx_page_context.getAttribute("model", PageContext.PAGE_SCOPE);
        if (model == null){
          model = new model.BookModel();
          _jspx_page_context.setAttribute("model", model, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("model"), request);
      out.write("\n");
      out.write("                ");
 
                    try{
                     if(request.getParameter("bid")!=null){
                     BookUtil book=new BookDao();
                     if(book.addBook(model)){
                       
      out.write("\n");
      out.write("                        <tr><td colspan=\"2\"><span style=\"color:green;font-size:14pt\">Added Successfully.. :)</span></td></tr>\n");
      out.write("                   ");
   }
                      else{ 
      out.write("\n");
      out.write("                        <tr><td colspan=\"2\"><span style=\"color:red;font-size:14pt\">Failed!! Try Again... :(</span></td></tr>\n");
      out.write("                       ");
 }
                     }
                    }
                    catch(Exception e)
                    {
                     System.out.println(e.getMessage());
                    }
                    
      out.write("\n");
      out.write("            </table>\n");
      out.write("            </form>\n");
      out.write("        </section>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
