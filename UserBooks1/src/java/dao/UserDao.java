
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.UserModel;
import util.UserUtil;

public class UserDao implements UserUtil {

    @Override
    public boolean registerUser(UserModel model) {
       Connection con=Database.getConnection();
        try{
         PreparedStatement ps=con.prepareStatement("insert into userstable values(3,?,?,?)");
         ps.setString(1,model.getUname());
         ps.setString(2,model.getPassword());
         ps.setString(3,model.getEmail());
         return 1==ps.executeUpdate();          
        }
        catch(Exception e){
         System.out.println(e.getMessage());
         return false;
        }
        finally{
         Database.closeConnection(con);
        }
    }

    @Override
    public boolean authenticateUser(UserModel model) {
        Connection con=Database.getConnection();
        try{
         PreparedStatement ps=con.prepareStatement("select * from userstable where uname=? and pwd=?");
         ps.setString(1, model.getUname());
         ps.setString(2, model.getPassword());
         ResultSet rs=ps.executeQuery();
         if(rs.next())
             return true;
         else
             return false;
        }
        catch(Exception e){
         System.out.println(e.getMessage());
         return false;
        }
        finally{
         Database.closeConnection(con);
        }
    }

    @Override
    public boolean changePassword(UserModel model,String newPwd) {
        Connection con=Database.getConnection();
        try{
         PreparedStatement ps=con.prepareStatement("update users set password=? where uname=?");
         ps.setString(1,newPwd);
         ps.setString(2,model.getUname());
         return 1==ps.executeUpdate();  
        }
        catch(Exception e){
         System.out.println(e.getMessage());
         return false;
        }
        finally{
         Database.closeConnection(con);
        }
    }
    
}
