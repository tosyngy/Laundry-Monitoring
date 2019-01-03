package laundry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author vicsoft
 */
public class DbConnect {

    Connection con;
    ResultSet rs;
    PreparedStatement ps;
    Statement st;
    Vector<String> data = new Vector<>();
    public static String[] rowData;

    public DbConnect() {
        try {

          //  System.out.println("MySQL Connect Example.");
            //con = null;
            String url = "jdbc:mysql://localhost:3306/";
            //
            String dbName = "cleanrite";
            String driver = "com.mysql.jdbc.Driver";
            String userName = "root";
            String password = "";
            try {
                Class.forName(driver).newInstance();
                con = DriverManager.getConnection(url + dbName, userName, password);
                st = con.createStatement();
              //  System.out.println("Connected to the database");
            } catch (Exception e) {
                System.out.println("datbase con : " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("connector Error  " + e);
        }
    }

}
