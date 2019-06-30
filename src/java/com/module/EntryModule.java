/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.module;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.model.Frmentry;
import com.service.EntryService;
import java.sql.SQLException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author naeem
 */
public class EntryModule {
 
    
    public String addEntry(HttpServletRequest request) throws SQLException{
        String ans="false";
        int count=0;
        String data=request.getParameter("data");
        Gson g=new Gson();
        int validcid = 0;
        Frmentry frmentries[]=g.fromJson(data,Frmentry[].class);
        int contid=frmentries[0].getContracid();
        try{
        validcid=new EntryService().findCid(contid);
        }
        catch(Exception e){
        System.out.println(e);
        }
        if(validcid==1){
        for(Frmentry frmentry:frmentries){
            int flag=0;
            EntryService ens=new EntryService();
            flag=ens.findemp(frmentry.getEmpid());
            
            if(flag==0){
                System.out.println("The Employee"+frmentry.getEmpid()+"is not present");
                
            }
            else{
                count++;
                try{
                ans=ens.saveRecord(frmentry,count);
                System.out.println(ans);
                }
                catch(Exception e){
                    System.out.println(e);
                }
            
            }
            
        }
        }
        else
        {
            System.out.println("incorrect cid so no entry in table for any emp");
        }
      
        
        
        return ans;
        
        
        
        
    }
    
}
