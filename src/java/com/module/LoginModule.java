/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.module;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.model.Login;
import com.service.loginService;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author naeem
 */
public class LoginModule {
    
    
    public boolean checkModule(HttpServletRequest request) throws Exception{
     boolean ans=true;
     JsonObject jsonobj=new JsonObject();
         String username=request.getParameter("username");
         String password=request.getParameter("password");
         jsonobj.addProperty("password", password);
         jsonobj.addProperty("username",username);
         
        Login l=null;
        Gson g = new Gson();
        l=g.fromJson(jsonobj,Login.class);
        System.out.println(l);
        ans=new loginService().checkUser(l);
        
     
     
     return ans;
        
        
    }
    
    
}
