/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.module;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.model.Employee;
import com.model.Login;
import com.service.empService;
import com.service.loginService;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author naeem
 */
public class EmployeeModule {
    
public String addEmployee(HttpServletRequest request) throws SQLException{
    String ans="success";
    JsonObject jsonobj=new JsonObject();
        
        String data=request.getParameter("data");
        Employee e=new Employee();
        Gson g = new Gson();
        e=g.fromJson(data,Employee.class);
        System.out.println(e);
        ans=new empService().saveData(e);   
    return ans;
}

}


