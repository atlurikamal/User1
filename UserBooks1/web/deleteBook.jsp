<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="util.BookUtil" %>
<%@page import="dao.BookDao" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Book</title>
    </head>
    <body>
        <%@include file="UserMenu.jsp" %>
        <%
            String name=session.getAttribute("uname").toString();
            BookUtil book=new BookDao();
            if(book.deleteBook(Integer.parseInt(request.getParameter("id")),name))
            {    %>
            <h3 align="center" style="color:green;font-size: 16pt">Deleted Successfully.. :)</h3>
           <% }
            else
            { %>
            <h3 align="center" style="color:red;font-size: 16pt">Deletion Failed :( Try Again...</h3>
            <% }
            %>
    </body>
</html>
