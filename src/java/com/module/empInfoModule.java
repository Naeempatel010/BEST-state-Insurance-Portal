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
import com.model.empInfo;
import com.service.empInfoService;
import java.util.Arrays;

/**
 *
 * @author naeem
 */
public class empInfoModule {
    
    
public JsonArray getEmp(){
    
JsonObject result =new JsonObject();
JsonArray ja=new JsonArray();
    Gson gson=new Gson();
try{
empInfo[] emplist ;
emplist=new empInfoService().getData() ;

for(empInfo emp:emplist){
   
    String objestr=gson.toJson(emp);
    JsonElement jelement = new JsonParser().parse(objestr);
    ja.add(jelement);

  
}
}
        catch(Exception e){
                System.out.println(e);
                }
 


return ja;  
}    
    
}
