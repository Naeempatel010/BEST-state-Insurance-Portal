/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.model.Employee;
import com.util.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author naeem
 */
public class empService {
    
   
    public String saveData(Employee e) throws SQLException{
        
    String ans="success";     
        String strsql;
        DBConnect db=new DBConnect();
        Connection conn=null;
        Statement stmt=null;
        PreparedStatement pstmt=null;
        ResultSet rs= null;
         conn=db.getConnection();
        try{
            conn=db.getConnection();
            strsql="";
            String insno=e.getInsno();
            strsql="select count(*) from empinfo where insno="+insno;
            stmt = conn.createStatement();
            rs = stmt.executeQuery(strsql);
            System.out.println(rs.toString());

            int cnt = 0;
            if (rs.isBeforeFirst()) {
                rs.next();
                   cnt = rs.getInt(1);
            }    
            if(cnt==0){
                
            conn.setAutoCommit(false);
            strsql="insert into empinfo(insno,empname,bdate,jdate,ldate,checkno,userid) values(?,?,?,?,?,?,?)";
            System.out.println(strsql);
            pstmt=conn.prepareStatement(strsql);
            pstmt.setString(1,e.getInsno());
            pstmt.setString(2,e.getEmpname());
            pstmt.setString(3,e.getBdate());
            pstmt.setString(4,e.getJdate());
            pstmt.setString(5,e.getLdate());
            pstmt.setInt(6,e.getCheckno());
            pstmt.setInt(7, e.getUserid());
            System.out.print(pstmt.toString());
            pstmt.executeUpdate();
            
            conn.commit();
            ans="success";
            }
            else{
                ans="failed";
                System.out.println("duplicate records");
                    
            }
                                    
        }
        catch(SQLException exc){
            System.out.println(exc);
            ans="failed";
            conn.rollback();
            
        }
        finally{
        
        conn.close();
       
        pstmt.close();
        } 
    
    
    
        
    return ans;
    }   
}
