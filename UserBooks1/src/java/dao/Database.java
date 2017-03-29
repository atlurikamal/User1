
package dao;


import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    public static Connection getConnection(){
       try{
        Class.forName("org.gjt.mm.mysql.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/internship","root","");
        return con;
       }
       catch(Exception e)
       {
         System.out.println(e.getMessage()+"Not");
         return null;
       }
    }
    public static void closeConnection(Connection con){
      try{
        con.close();
    }
      catch(Exception e){
      System.out.println(e.getMessage());
      }
    }
      
}
