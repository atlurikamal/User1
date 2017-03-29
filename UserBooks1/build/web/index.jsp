<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="util.UserUtil" %>
<%@page import="dao.UserDao" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body style="margin-top: 30px">
        <%@include file="heading.html"%>
        <table style="width:100%">
            <td style="font-size: 18pt">Book Reviews is a website to post and see reviews on Books</td>
            <td style="font-size: 18pt"><a href="register.jsp">Click Here</a> to register</td>
            <td style="width:25%">
                <form method="POST">
                <table style="margin-top: 80px">
                    <tr><td><h3>LOGIN</h3></td></tr> 
                    <tr><td><input type="text" size="20"  placeholder="UserName" required name="uname" /></td></tr> 
                    <tr><td><input type="password" size="20" placeholder="Password" required name="password" /></td></tr>
                    <tr><td><input type="submit" value="Login"/></td></tr>
                </table> </td>  
        <jsp:useBean id="model" class="model.UserModel" scope="page"></jsp:useBean>
        <jsp:setProperty name="model" property="*"></jsp:setProperty>
        <%  try{
            if(request.getParameter("uname")!=null)
            {
             UserUtil user=new UserDao();
             if(user.authenticateUser(model)){
                session.setAttribute("uname",model.getUname()); 
                 response.sendRedirect("home.jsp");
             }
             else{ %>
                <p></p><span style="color:red;font-size: 14pt;float: right;margin-right: 7em;">Login Failed!! Try Again...</span>
                 <%  } }
        }
        catch(Exception ex){
        System.out.println(ex.getMessage());
        }
            %>
          </form>
          </table>  
    </body>
</html>
