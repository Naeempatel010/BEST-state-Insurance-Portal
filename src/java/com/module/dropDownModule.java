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
import com.model.contracdrop;
import com.model.empInfo;
import com.service.ContracdropService;
import com.service.empInfoService;

/**
 *
 * @author naeem
 */
public class dropDownModule {
    
    
    public JsonArray getConlist(){
        
    JsonObject result =new JsonObject();
    JsonArray ja=new JsonArray();
    Gson gson=new Gson();
    try{
        contracdrop constd[] ;
        constd=new ContracdropService().getData() ;

        for(contracdrop con:constd){
   
        String objestr=gson.toJson(con);
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
