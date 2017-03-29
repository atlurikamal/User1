<%@page import="util.BookUtil" %>
<%@page import="dao.BookDao" %>
<%@page import="model.BookModel" %>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.List" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Books</title>
    </head>
    <body>
        <%@include file="UserMenu.jsp" %>
        <h2 align="center">MY BOOKS</h2>
        <table cellspacing="4px" cellpadding="6px" align="center" style='font-size: 14pt'>
            <th>S.No.</th>
            <th>ISBN</th>
            <th>Name</th>
            <th>Author</th>
            <th>Price</th>
            <th>Options</th>   
            
            <%
                try{
              int index=0;
              BookUtil book=new BookDao();
              List<BookModel> list=new ArrayList<BookModel>(); 
              String name=session.getAttribute("uname").toString();              
              list=book.getList(name);
              for(BookModel b:list){
            %>
            
            <tr><td><%=++index%></td>
                <td><%=b.getBid()%></td>
                <td><%=b.getBname()%></td>
                <td><%=b.getAuthor()%></td>
                <td><%=b.getPrice()%></td>
                <td><a href="modifyBook.jsp?id=<%=b.getBid()%>&name=<%=b.getBname()%>&auth=<%=b.getAuthor()%>&pric=<%=b.getPrice()%>">Modify</a>
                    /<a href="deleteBook.jsp?id=<%=b.getBid()%>">Delete</a></td></tr>   
            
              <%
              }
                }
                catch(Exception e){
                System.out.println(e.getMessage());
                }
            %>
        </table>
    </body>
</html>
