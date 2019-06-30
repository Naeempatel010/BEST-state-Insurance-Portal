/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.model.Frmentry;
import com.util.DBConnect;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author naeem
 */
public class EntryService {
    
public int findemp(int empid) throws SQLException{
    int flag=0;
    String strsql;
        DBConnect db=new DBConnect();
        Connection conn=null;
        Statement stmt=null;
        PreparedStatement pstmt=null;
        ResultSet rs= null;
        conn=db.getConnection();
        try{
            strsql="select count(*) from empinfo where id="+empid+"";
            System.out.println(strsql);
            stmt=conn.createStatement();
            rs=stmt.executeQuery(strsql);
            int cnt = 0;
            if (rs.isBeforeFirst()) {
                rs.next();
                   cnt = rs.getInt(1);
            }    
            if(cnt==0){
            flag=0;
            }
            else{
                flag=1;
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
    
    return flag;
}
public int findCid(int cid) throws SQLException{
    int flag=0;
    String strsql;
        DBConnect db=new DBConnect();
        Connection conn=null;
        Statement stmt=null;
        PreparedStatement pstmt=null;
        ResultSet rs= null;
        conn=db.getConnection();
        try{
            strsql="select count(*) from contractorinfo where id="+cid+"";
            System.out.println(strsql);
            stmt=conn.createStatement();
            rs=stmt.executeQuery(strsql);
            int cnt = 0;
            if (rs.isBeforeFirst()) {
                rs.next();
                   cnt = rs.getInt(1);
            }    
            if(cnt==0){
            flag=0;
            }
            else{
                flag=1;
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
    
    return flag;
}
public String saveRecord(Frmentry frm,int count) throws SQLException{
 String ans="false";
 String strsql;
DBConnect db=new DBConnect();
Connection conn=null;
Statement stmt=null;
PreparedStatement pstmt=null;
ResultSet rs= null;
conn=db.getConnection();
try{
    conn.setAutoCommit(false);
    System.out.println(count);
    if(count==1){
        strsql="{call entryfirst(?,?,?,?,?,?,?,?,?,?)}";
    }
        else{
        strsql="{call entrysec(?,?,?,?,?,?,?,?,?,?)}";
           }
        CallableStatement cstmt=conn.prepareCall(strsql);
        cstmt.setInt(1,frm.getContracid());
        cstmt.setInt(2,frm.getEmpid());
        cstmt.setInt(3,frm.getJdays());
        cstmt.setString(4,frm.getJdate());
        cstmt.setInt(5,frm.getSalary());
        cstmt.setString(6,frm.getNofwork());
        cstmt.setString(7,frm.getZone());
        cstmt.setString(8,frm.getService());
        cstmt.setString(9,frm.getWardno());
        cstmt.setInt(10,frm.getCreatedby());
        System.out.println(cstmt.toString());
        
        cstmt.execute();
        conn.commit();
        ans="true";
    }
catch(SQLException se){
    conn.rollback();
    System.out.println(se);
    ans="false";
}
 return ans;
}

}
