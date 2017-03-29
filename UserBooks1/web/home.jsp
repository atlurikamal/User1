<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dao.BookDao" %>
<%@page import="util.BookUtil" %>
<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>
<%@page import="model.BookModel" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <%@include file="UserMenu.jsp" %>
        <form method="POST">
        <h2 align="center">SEARCH BOOKS</h2>
        <table cellspacing="5px" cellpadding="5px" align="center">
            <tr><td><input type="text" style="font-size: 16pt" size="40"  name="bname" placeholder="Search By Book Name"/></td></tr>
            <tr><td><input type="text" style="font-size: 16pt" size="40"  name="aname" placeholder="Search By Author Name"/></td></tr>
            <tr><td align="center"><input type="submit" style="height:30px" value="SEARCH"/></td></tr>
        </table>
        <% 
            
            String bname=request.getParameter("bname");
            String aname=request.getParameter("aname");
         if((bname!="" && bname!=null) || (aname!="" && aname!=null)){ %>
        <table cellspacing="4px" cellpadding="6px" align="center" style="font-size: 14pt;margin-top: 20px">
            <th>S.No.</th>
            <th>ISBN</th>
            <th>Name</th>
            <th>Author</th>
            <th>Price</th>            
            <%
              try{
              int index=0;
              BookUtil book=new BookDao();
              List<BookModel> list=new ArrayList<BookModel>();           
              if(bname=="")
              {  
               list=book.searchByAuthor(aname); 
              }
              else 
              {
               list=book.searchByName(bname);
              }
              for(BookModel b:list){
            %>
            
            <tr><td><%=++index%></td>
                <td><%=b.getBid()%></td>
                <td><%=b.getBname()%></td>
                <td><%=b.getAuthor()%></td>
                <td><%=b.getPrice()%></td>                
                <td><a href="#">Reviews</a></td>
              <%
              }
              }
                
                catch(Exception e){
                System.out.println(e.getMessage());
                }
            
         }
            %>
               </table>
             </form>
    </body>
</html>
