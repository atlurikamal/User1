
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <%@include file="heading.html" %>
        <section style="background-color: wheat;font-size: 14pt;width:20%;float:left;height:38em">
            <table cellspacing="4" cellpadding="4" style="margin-top: 20px;">
            <tr style="color: black"><td>Welcome <%=session.getAttribute("uname")%></td></tr>
            <tr><td><a href="home.jsp">Home</a></td></tr>
            <tr><td><a href="viewBooks.jsp">View Books</a></td></tr>
            <tr><td><a href="addBook.jsp">Add a Book</a></td></tr>
            <tr><td><a href="changePassword.jsp">Change Password</a></td></tr>
            <tr><td><a href="logOut.jsp">LogOut</a></td></tr>
        </table> 
        </section>
    </body>
</html>
