/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lbms;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import jdk.nashorn.internal.ir.ForNode;

/**
 *
 * @author DELL
 */
public class Dbconnect {
    public static Connection connect()
    {
       Connection conn = null;
       try{
           
            Class.forName("com.mysql.jdbc.Driver") ;
            //java.sql.Connection conn;
           conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/lbms","root","");
           
           
       }catch(Exception e)
       {
           System.out.println(e);
       }
       return conn;
    }
    
}
