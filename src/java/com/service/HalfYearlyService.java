/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.model.HalfYearly;
import com.model.empInfo;
import com.util.DBConnect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author naeem
 */
public class HalfYearlyService {
    
    
    public HalfYearly[] getData(String fdate,String ldate)
    {
    
    HalfYearly[] hf = new HalfYearly[4];
    DBConnect db=new DBConnect();
    Connection conn=null;
    int cnt = 0;
    Statement stmt=null;
    ResultSet rs=null;
    try{
    conn=db.getConnection();
    String strsql="select advno,cname,empname,salary,frmentry.jdate,nofwork,zon,esigovt,esiemp,servic,wardno,frmentry.createdat,createdby from frmentry,empinfo,contractorinfo where cid=contractorinfo.id and empid=empinfo.id and frmentry.createdat >= '"+fdate+"' and frmentry.createdat <= '"+ldate+"'";
    System.out.println(strsql);
    stmt=conn.createStatement();
    rs=stmt.executeQuery(strsql);
    cnt=-1;
    while(rs.next()){
        cnt++;
        System.out.println(cnt);
        hf[cnt]=new HalfYearly();
        hf[cnt].setAdvno((Integer.toString(rs.getInt(1))));
        hf[cnt].setCname(rs.getString(2));
        hf[cnt].setEmpname(rs.getString(3));
        hf[cnt].setSalary(rs.getString(4));
        hf[cnt].setJdate(rs.getString(5));
        hf[cnt].setNofwork(rs.getString(6));
        hf[cnt].setZon(rs.getString(7));
        hf[cnt].setEsigovt(rs.getString(8));
        hf[cnt].setEsiemp(rs.getString(9));
        hf[cnt].setServic(rs.getString(10));
        hf[cnt].setWardno(rs.getString(11));
        hf[cnt].setCreatedat(rs.getString(12));
        hf[cnt].setCreatedby(rs.getString(13));
    
    }
    }
    
    
    catch(Exception ex){
        System.out.println(ex);
    }
    finally{
        
    }
    System.out.println(hf);
    System.out.println(cnt);
    return hf;
}

    
}
