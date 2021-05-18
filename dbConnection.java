/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final1;

import java.sql.*;

/**
 *
 * @author BHUVAN
 */
public class dbConnection {
    public static Connection con(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
           // JOptionPane.showMessageDialog(null,"connection succesfull"); 
        }
        catch(ClassNotFoundException | SQLException e){
            //JOptionPane.showMessageDialog(null, e+"has error");
        }
        return con;
    }
}
