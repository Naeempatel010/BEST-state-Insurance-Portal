/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.model.contracdrop;
import com.model.empInfo;
import com.util.DBConnect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author naeem
 */
public class ContracdropService {
   
    
 public contracdrop[] getData(){
     
    contracdrop[] consd=new contracdrop[3];
    DBConnect db=new DBConnect();
    Connection conn=null;
    int cnt = 0;
    Statement stmt=null;
    ResultSet rs=null;
    try{
    conn=db.getConnection();
    String strsql="select id,cname from contractorinfo";
    stmt=conn.createStatement();
    rs=stmt.executeQuery(strsql);
    cnt=-1;
    while(rs.next()){
        cnt++;
        System.out.println(cnt);
        consd[cnt] =new contracdrop();
        consd[cnt].setId(Integer.toString(rs.getInt(1)));
        consd[cnt].setCname(rs.getString(2));
    }
    }
    
    
    catch(Exception ex){
        System.out.println(ex);
    }
    finally{
        
    }
    System.out.println(consd);
    System.out.println(cnt);
    
     
     
    return consd; 
 }   
}
