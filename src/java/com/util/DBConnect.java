/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;
import java.sql.*;
/**
 *
 * @author naeem
 */
public class DBConnect {
    
    public  Connection getConnection(){
        Connection conn=null;
        try {  
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
            "databaseName=EmployeeInsurance;user=sa;password=sa123;";
        conn = DriverManager.getConnection(connectionUrl);
        } catch (SQLException e) {
            System.out.println("SQL Exception: "+ e.toString());
        } catch (ClassNotFoundException cE) {
            System.out.println("Class Not Found Exception: "+ cE.toString());
        }
       
        return conn;
    }
    //public static void main(String args[]){
      //  getConnection conn=new getConnection();
        
        
        
    //}
    
}
