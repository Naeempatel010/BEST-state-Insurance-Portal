/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.model.Contractor;
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
public class contractorService{
    
    public String saveData(Contractor c) throws SQLException{
      String ans="Success";
      DBConnect db=new DBConnect();
        Connection conn=null;
        Statement stmt=null;
        PreparedStatement pstmt=null;
        ResultSet rs= null;
         conn=db.getConnection();
        try{
            conn=db.getConnection();
            String strsql="";
            String cname=c.getCname();
            System.out.println(cname);
            strsql="select count(*) from contractorinfo where cname='"+cname+"'";
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
            strsql="insert into contractorinfo(cname,userid) values(?,?)";
            System.out.println(strsql);
            pstmt=conn.prepareStatement(strsql);
            pstmt.setString(1,cname);
            pstmt.setInt(2, c.getUserid());
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
       
        //pstmt.close();
        }
      
      return ans;
        
    }
}
