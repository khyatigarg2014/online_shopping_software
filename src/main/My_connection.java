/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author khyati
 */
public class My_connection {
    public static Connection getConnection() throws ClassNotFoundException, SQLException
    {
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/shopping_site_database", "root", "");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            
            
        }
        return con;
        
    }
}
