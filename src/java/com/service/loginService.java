/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;
import com.model.Login;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.util.DBConnect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author naeem
 */
public class loginService {
    
    public boolean checkUser(Login l) throws Exception{
    
        boolean ans=false;
        String strsql;
        DBConnect db=new DBConnect();
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs= null;
        try{
            conn=db.getConnection();
            strsql= "select count(*) from logininfo where checkno="+l.getUsername()+" and password ='"+l.getPassword()+"'";
            System.out.println(strsql);
            stmt=conn.createStatement();
            rs=stmt.executeQuery(strsql);
            System.out.println(rs.toString());
            int cnt = 0;
            if (rs.isBeforeFirst()) {
                rs.next();
                cnt = rs.getInt(1);
            }
            if(cnt==0){
                ans=false;
            }
            else{
                ans=true;
            }
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        finally{
        
        conn.close();
        
        }
        
    return ans;    
    }
    
    
}
