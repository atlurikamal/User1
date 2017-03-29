package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import util.UserUtil;
import dao.UserDao;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
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
      out.write("        <table style=\"width:100%\">\n");
      out.write("            <td style=\"font-size: 14pt\">UserBooks.com is a website to store your books and allow access to books</td>\n");
      out.write("            <td style=\"font-size: 14pt\"><a href=\"register.jsp\">Click Here</a> to register</td>\n");
      out.write("            <td style=\"width:25%\">\n");
      out.write("                <form method=\"POST\">\n");
      out.write("                <table>\n");
      out.write("                    <tr><td><h3>LOGIN</h3></td></tr> \n");
      out.write("                    <tr><td><input type=\"text\" size=\"20\"  placeholder=\"UserName\" required name=\"uname\" /></td></tr> \n");
      out.write("                    <tr><td><input type=\"password\" size=\"20\" placeholder=\"Password\" required name=\"password\" /></td></tr>\n");
      out.write("                    <tr><td><input type=\"submit\" value=\"Login\"/></td></tr>\n");
      out.write("                </table> </td>  \n");
      out.write("        ");
      model.UserModel model = null;
      synchronized (_jspx_page_context) {
        model = (model.UserModel) _jspx_page_context.getAttribute("model", PageContext.PAGE_SCOPE);
        if (model == null){
          model = new model.UserModel();
          _jspx_page_context.setAttribute("model", model, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("model"), request);
      out.write("\n");
      out.write("        ");
  try{
            if(request.getParameter("uname")!=null)
            {
             UserUtil user=new UserDao();
             if(user.authenticateUser(model)){
                session.setAttribute("uname",model.getUname()); 
                 response.sendRedirect("home.jsp");
             }
             else{ 
      out.write("\n");
      out.write("                <p></p><span style=\"color:red;font-size: 14pt;float: right;margin-right: 7em;\">Login Failed!! Try Again...</span>\n");
      out.write("                 ");
  } }
        }
        catch(Exception ex){
        System.out.println(ex.getMessage());
        }
            
      out.write("\n");
      out.write("          </form>\n");
      out.write("          </table>  \n");
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
