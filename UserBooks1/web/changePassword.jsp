<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dao.UserDao" %>
<%@page import="util.UserUtil" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change Password</title>
    </head>
    <body>
        <%@include file="UserMenu.jsp" %>
        <section>
            <form method="POST">
            <table cellspacing="4px" cellpadding="4px" align="center" style='font-size: 14pt'>
                <tr><td colspan="2"><h3>UPDATE PASSWORD</h3></td></tr> 
                <tr><td>Name</td><td><input type="text" size="20"  required name="uname" /></td></tr> 
                <tr><td>Password</td><td><input type="password" size="20" required name="password"/></td></tr>
                <tr><td>New Password</td><td><input type="password" size="20" required name="npwd"/></td></tr>
                <tr><td colspan="2"><input type="submit" value="Change Password"/></td></tr>
                <jsp:useBean id="model" class="model.UserModel" scope="page"></jsp:useBean>
                <jsp:setProperty name="model" property="*"></jsp:setProperty>
                <%
                    if(request.getParameter("uname")!=null){
                     UserUtil user=new UserDao();
                     if(user.authenticateUser(model)){
                      if(user.changePassword(model,request.getParameter("npwd"))){ %>
                        <tr><td colspan="2"><span style="color:green;font-size:14pt">Updated Successfully.. :)</span></td></tr>
                   <%   }
                      else{ %>
                  <tr><td colspan="2"><span style="color:red;font-size:14pt">Updation Failed!! Try Again... :(</span></td></tr>
                       <% }
                     }
                    }
                    %>
            </table>
            </form>
        </section>
    </body>
</html>
