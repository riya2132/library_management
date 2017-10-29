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
public class IssuebookDb {
    public static boolean checkbook(String callno)
    {
        boolean status=false;
        try{
            Connection con=DB.getconnection();
            PreparedStatement ps=con.prepareStatement("select *from books where callno=?");
            ps.setString(1, callno);
            ResultSet rs=ps.executeQuery();
            status=rs.next();
            con.close();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        return status;
    }
    public static int updatebook(String callno)
    {
        int quantity=0,issued=0;
        int status=0;
        try{
            Connection con=DB.getconnection();
            PreparedStatement ps=con.prepareStatement("select quantity,issued from books where callno=?");
            ps.setString(1, callno);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                quantity=rs.getInt("quantity");
                issued=rs.getInt("issued");
            }
            if(quantity>0){
                 PreparedStatement pst=con.prepareStatement("update books set quantity=?,issued=? where callno=?");
                 pst.setInt(1,quantity-1);
                 pst.setInt(2,issued+1);
                 pst.setString(3, callno);
                 status=pst.executeUpdate();
            }
            con.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return status;
    }
    public static int save(String bookcallno,int studentId,String studentName,String stuContact)
    {
        int status=0;
        try{
           Connection con=DB.getconnection();
           status=updatebook(bookcallno);
           if(status>0){
                PreparedStatement ps=con.prepareStatement("insert into issuebooks values(?,?,?,?)");
                ps.setString(1,bookcallno);
                ps.setInt(2,studentId);
                ps.setString(3, studentName);
                ps.setString(4, stuContact);
                status=ps.executeUpdate();
                con.close();
           }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return status;
    }
}

