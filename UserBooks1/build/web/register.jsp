<%@page import="util.UserUtil" %>
<%@page import="dao.UserDao" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body>
        <%@include file="heading.html"%>
        <form method="POST">
            <h3 align='center'>User Registration</h3>
            <table align='center' style="font-size: 14pt" cellspacing='4px' cellpadding='4px'>
                <tr><td>Name</td><td><input type="text" size="20" required name="uname"/></td></tr>
                <tr><td>Password</td><td><input type="password" size="20" required name="password"/></td></tr>
                <tr><td>Email-Id</td><td><input type="email" size="20" required name="email"/></td></tr>
                <tr><td><input type="submit" value="Register"/></td></tr>
                <jsp:useBean id="model" class="model.UserModel" scope="page"></jsp:useBean>
                <jsp:setProperty name="model" property="*"></jsp:setProperty>
                <%
                    UserUtil user=new UserDao();
                    if(request.getParameter("uname")!=null){
                     if(user.registerUser(model)){ %>
                <tr><span style="color:green;font-size:14pt;margin-left: 20px">Registered Successfully!! :)</span></tr>
                    <% }
                     else{ %>
            <tr><span style="color:red;font-size:14pt;margin-left: 20px">Registration Failed!! Try Again.. :(</span></tr>
                    <% }
                    }
                    %>
            </table>
            <p style="color:maroon;font-size: 16pt;margin-left: 20px;top: 10px" align='center'><a href="index.jsp">Login</a></p>
        </form>
    </body>
</html>
