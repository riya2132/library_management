/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a
 */
import java.sql.*;
public class Librariandb {
    public static int save(String id,String name,String password,String email,String address,String city,String contact)
    {
        int status=0;
        try{
            Connection con=DB.getconnection();
            PreparedStatement ps=con.prepareStatement("insert into librarian values(?,?,?,?,?,?,?)");
            ps.setString(1,id);
            ps.setString(2,name);
            ps.setString(3,password);
            ps.setString(4,email);
            ps.setString(5,address);
            ps.setString(6,city);
            ps.setString(7,contact);
            status=ps.executeUpdate();
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
        return status;
    }
    public static int delete(String id)
    {
        int status=0;
        try{
            Connection con=DB.getconnection();
            PreparedStatement ps=con.prepareStatement("delete from librarian where id=?");
            ps.setString(1,id);
            status=ps.executeUpdate();
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
        return status;
    }
    public static boolean passvalidate(String name,String password)
    {
        boolean status=false;
        try{
            Connection con=DB.getconnection();
            PreparedStatement ps=con.prepareStatement("select *from librarian where name=? and password=?");
            ps.setString(1,name);
            ps.setString(2,password);
            ResultSet rs=ps.executeQuery();
            status=rs.next();
            con.close();
        }catch(Exception e){
          System.out.println(e);  
        }
        return status;
    }
}
