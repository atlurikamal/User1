package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import util.BookUtil;
import dao.BookDao;
import model.BookModel;
import java.util.List;
import java.util.ArrayList;

public final class pagination_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Pagination</title>\n");
      out.write("        <script type=\"text/javascript\" src=\"jquery.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            var last=0;\n");
      out.write("            var prev=0;\n");
      out.write("            var next=0;\n");
      out.write("            $(document).ready(function(){\n");
      out.write("                $(\".all\").hide();\n");
      out.write("                $(\"#prev\").hide();\n");
      out.write("                $(\".1\").show();                \n");
      out.write("                last=Number($(\"#last\").val());\n");
      out.write("            });\n");
      out.write("            function myFun(y){\n");
      out.write("                var x=0;\n");
      out.write("                x=Number(y);\n");
      out.write("                $(\"#prev\").show();\n");
      out.write("                $(\"#next\").show();\n");
      out.write("                $(\"#prev\").data(\"ans\",x-1);\n");
      out.write("                $(\"#next\").data(\"ans\",x+1);\n");
      out.write("                if(x===1)\n");
      out.write("                {\n");
      out.write("                    $(\"#prev\").hide();\n");
      out.write("                }\n");
      out.write("                else if(x===last)\n");
      out.write("                {\n");
      out.write("                   $(\"#next\").hide();       \n");
      out.write("                }\n");
      out.write("                $(\".all\").hide();\n");
      out.write("                $(\".\"+x).show();\n");
      out.write("            }\n");
      out.write("            function myFun2(y)\n");
      out.write("            {\n");
      out.write("                var prev=$(\"#prev\").data(\"ans\");\n");
      out.write("                var next=$(\"#next\").data(\"ans\");\n");
      out.write("                if(y===p)\n");
      out.write("                    {\n");
      out.write("                        myFun(prev);\n");
      out.write("                    }\n");
      out.write("                else if(y===n)\n");
      out.write("                    {\n");
      out.write("                        myFun(next);\n");
      out.write("                    }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            BookUtil book=new BookDao();
            List<BookModel> list=new ArrayList<BookModel>();
            list=book.getAll();
            int i,j,k,x,a,n;
            k=list.size();
            x=k/3;
            if(k%3!=0)
            {
             x++;
            } 
      out.write("\n");
      out.write("            <input type=\"hidden\" value=\"");
      out.print(x);
      out.write("\" id=\"last\"/>\n");
      out.write("            ");
   for(i=1;i<=x;i++)
            {
             
      out.write("\n");
      out.write("             <input type=\"button\" value=\"");
      out.print(i);
      out.write("\" name=\"page\" onclick='myFun(\"");
      out.print(i);
      out.write("\");'/>\n");
      out.write("           ");
 
            }
                n=0;
                for(i=0;i<x;i++)
                {
                    
      out.write("\n");
      out.write("                    <div class=\"");
      out.print(i+1);
      out.write(" all\">\n");
      out.write("                        ");

                           a=(2+n*3);
                           if(a>k-1)
                           {
                               a=k-1;
                           }
                           for(j=(n*3);j<=a;j++)
                           {
                             BookModel model=new BookModel();
                             model=list.get(j); 
                        
      out.write("\n");
      out.write("                        <p> <h2>   ");
      out.print(model.getBname());
      out.write(" </h2> </p>\n");
      out.write("                        ");

                           }
                           n++; 
                        
      out.write("                        \n");
      out.write("                    </div>                \n");
      out.write("               ");
 
                }
              
      out.write(" \n");
      out.write("              <input type=\"button\" value=\"Prev\" data-ans=\"1\" id=\"prev\" onclick=\"myFun2('p');\"/>\n");
      out.write("              <input type=\"button\" value=\"Next\" data-ans=\"2\" id=\"next\" onclick=\"myFun2('n');\"/>\n");
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
