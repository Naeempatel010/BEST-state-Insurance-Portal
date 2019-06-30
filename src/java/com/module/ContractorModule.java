/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.module;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.model.Contractor;
import com.model.Employee;
import com.service.contractorService;
import com.service.empService;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author naeem
 */
public class ContractorModule {
    
    
    public String addContractor(HttpServletRequest request) throws SQLException{
    String ans="success";
    JsonObject jsonobj=new JsonObject();
        
        String data=request.getParameter("data");
        Contractor c =new Contractor();
        Gson g = new Gson();
        c=g.fromJson(data,Contractor.class);
        System.out.println(c.getCname());
        ans=new contractorService().saveData(c);       
    
    
    
    
     return ans;   
    }
}
