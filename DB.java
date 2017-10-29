/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a
 */
import java.sql.Connection;
import java.sql.DriverManager;
public class DB {
    public static Connection getconnection()
    {
        Connection con=null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");//register driver class
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","rhea1323");//create connection
        }catch(Exception e){
            System.out.println(e);
        }
        return con;
    }
}