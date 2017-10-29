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
import javax.swing.*;
public class BookDb {
    public static int save(String callno,String name,String author,String publisher,int quantity,int issued,String added_date)
    {
        int status=0;
        try{
        Connection con=DB.getconnection();
        PreparedStatement ps=con.prepareStatement("insert into books values(?,?,?,?,?,?,?)");
        ps.setString(1,callno);
        ps.setString(2,name);
        ps.setString(3,author);
        ps.setString(4,publisher);
        ps.setInt(5,quantity);
        ps.setInt(6,issued);
        ps.setString(7,added_date);
        status=ps.executeUpdate();
        con.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return status;
    }
}
