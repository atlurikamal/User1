
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.BookModel;
import util.BookUtil;

public class BookDao implements BookUtil {

    @Override
    public boolean addBook(BookModel model) {
        Connection con=Database.getConnection();
        try{
         PreparedStatement ps=con.prepareStatement("insert into books values(?,?,?,?,?)");
         ps.setString(1,model.getUname());
         ps.setInt(2,model.getBid());
         ps.setString(3,model.getBname());
         ps.setString(4,model.getAuthor());
         ps.setInt(5,model.getPrice()); 
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
    public boolean updateBook(BookModel model) {
        Connection con=Database.getConnection();
        try{
         PreparedStatement ps=con.prepareStatement("update books set bname=?,author=?,price=? where bid=? and uname=?");
         ps.setString(1,model.getBname());
         ps.setString(2,model.getAuthor());
         ps.setInt(3,model.getPrice());
         ps.setInt(4,model.getBid());
         ps.setString(5,model.getUname());
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
        public boolean deleteBook(int bookId,String name) {
        Connection con=Database.getConnection();
        try{
         PreparedStatement ps=con.prepareStatement("delete from books where bid=? and uname=?");
         ps.setInt(1,bookId);
         ps.setString(2,name);
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
    public List<BookModel> searchByName(String bName) {
        Connection con=Database.getConnection();
        try{
         PreparedStatement ps=con.prepareStatement("select * from books where bname like '"+bName+"%'");
         ResultSet rs=ps.executeQuery();
         List<BookModel> list=new ArrayList<>();
         while(rs.next()){
             BookModel model=new BookModel(
               rs.getString(1),
               rs.getInt(2),
               rs.getString(3),
               rs.getString(4),
               rs.getInt(5));
             list.add(model);            
         }
         rs.close();
         return list;
        }
         
        catch(Exception e){
         System.out.println(e.getMessage());
         return null;
        }
        finally{
        Database.closeConnection(con);
        }
    }

    @Override
    public List<BookModel> searchByAuthor(String aName) {
       Connection con=Database.getConnection();
        try{
         PreparedStatement ps=con.prepareStatement("select * from books where author like '"+aName+"%'");
         ResultSet rs=ps.executeQuery();
         List<BookModel> list=new ArrayList<>();
         while(rs.next()){
             BookModel model=new BookModel(
               rs.getString(1),
               rs.getInt(2),
               rs.getString(3),
               rs.getString(4),
               rs.getInt(5));
             list.add(model);   
         }
         rs.close();
         return list;
        }
        catch(Exception e){
         System.out.println(e.getMessage());
         return null;
        }
        finally{
        Database.closeConnection(con);
        }
    }

    @Override
    public List<BookModel> getList(String uName) {
        Connection con=Database.getConnection();
        try{
         PreparedStatement ps=con.prepareStatement("select * from books where uname='"+uName+"'");
         ResultSet rs=ps.executeQuery();
         List<BookModel> list=new ArrayList<>();
         while(rs.next()){
             BookModel model=new BookModel(
               rs.getString(1),
               rs.getInt(2),
               rs.getString(3),
               rs.getString(4),
               rs.getInt(5));
             list.add(model);            
         }
         rs.close();
         return list;
        }
        catch(Exception e){
         System.out.println(e.getMessage());
         return null;
        }
        finally{
        Database.closeConnection(con);
        }
    }
    
    @Override
    public List<BookModel> getAll(){
    Connection con=Database.getConnection();
        try{
         PreparedStatement ps=con.prepareStatement("select * from books");
         ResultSet rs=ps.executeQuery();
         List<BookModel> list=new ArrayList<>();
         while(rs.next()){
             BookModel model=new BookModel(
               rs.getString(1),
               rs.getInt(2),
               rs.getString(3),
               rs.getString(4),
               rs.getInt(5));
             list.add(model);            
         }
         rs.close();
         return list;
        }
        catch(Exception e){
         System.out.println(e.getMessage());
         return null;
        }
        finally{
        Database.closeConnection(con);
        }
    
    }
    
}
