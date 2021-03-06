<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dao.BookDao" %>
<%@page import="util.BookUtil" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">       
        <title>Update Book</title>  
        
    </head>
    <body>
        <%@include file="UserMenu.jsp" %>
        
        <form method="POST">
                <input type="hidden" value='<%=session.getAttribute("uname")%>' name="uname"/> 
                <input type="hidden" value='<%=request.getParameter("id")%>' name="bid"/>
                <table cellspacing="4px" cellpadding="4px" align="center" style='font-size: 14pt'>
                <tr><td colspan="2"><h3>UPDATE REQUIRED FIELDS</h3></td></tr>                 
                <tr><td>Book Name</td><td><input type="text" size="20" value='<%=request.getParameter("name")%>' required name="bname"/></td></tr> 
                <tr><td>Author</td><td><input type="text" size="20" value='<%=request.getParameter("auth")%>' required name="author"/></td></tr>
                <tr><td>Price(Rs.)</td><td><input type="text" size="20" value='<%=request.getParameter("pric")%>' required name="price"/></td></tr>
                <tr><td>Review</td><td><textarea rows="10" cols="50"></textarea></td></tr>
                <tr><td colspan="2"><input type="submit" value="Update book"/></td></tr>
                <jsp:useBean id="model" class="model.BookModel" scope="page"></jsp:useBean>
                <jsp:setProperty name="model" property="*"></jsp:setProperty>
                <% 
                    try{
                     if(request.getParameter("bname")!=null){
                     BookUtil book=new BookDao();
                     if(book.updateBook(model)){
                       %>
                        <tr><td colspan="2"><span style="color:green;font-size:14pt">Updated Successfully.. :)</span></td></tr>
                   <%   
                     }
                      else{ %>
                        <tr><td colspan="2"><span style="color:red;font-size:14pt">Failed!! Try Again... :(</span></td></tr>
                       <% }
                     }
                    }
                    catch(Exception e)
                    {
                     System.out.println(e.getMessage());
                    }
                    %>
            </table>
            </form>
    </body>
</html>
