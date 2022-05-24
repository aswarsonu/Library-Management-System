/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sonua
 * here we are using jdbc sqlite database
 * driver - sqlitejdbcV.056.jar
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
    Connection conn;
    public static Connection ConnerDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            /*
            for connection jdbc:sqlite:location of sqlite database
            */
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sonua\\Documents\\NetBeansProjects\\Library Management Project\\libraryNew.sqlite");
            return conn;
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
             return null;
        }
    }
    
}
