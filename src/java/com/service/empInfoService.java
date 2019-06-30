/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.model.empInfo;
import com.util.DBConnect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author naeem
 */
public class empInfoService {
    

public empInfo[] getData(){
    empInfo[] e = new empInfo[3];
    DBConnect db=new DBConnect();
    Connection conn=null;
    int cnt = 0;
    Statement stmt=null;
    ResultSet rs=null;
    try{
    conn=db.getConnection();
    String strsql="select id,insno,empname,bdate,jdate,datestamp,timecrea,checkno from empinfo";
    stmt=conn.createStatement();
    rs=stmt.executeQuery(strsql);
    cnt=-1;
    while(rs.next()){
        cnt++;
        System.out.println(cnt);
        e[cnt]=new empInfo();
        e[cnt].setId((Integer.toString(rs.getInt(1))));
        e[cnt].setInsno(rs.getString(2));
        e[cnt].setEmpname(rs.getString(3));
        e[cnt].setBdate(rs.getString(4));
        e[cnt].setJdate(rs.getString(5));
        e[cnt].setDatestamp(rs.getString(6));
        e[cnt].setTimecreated(rs.getString(7));
        e[cnt].setCheckno(rs.getString(8));
    }
    }
    
    
    catch(Exception ex){
        System.out.println(ex);
    }
    finally{
        
    }
    System.out.println(e);
    System.out.println(cnt);
    return e;
}

}
