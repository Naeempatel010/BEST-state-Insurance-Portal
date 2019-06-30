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
import com.model.HalfYearly;
import com.model.empInfo;
import com.service.HalfYearlyService;
import com.service.empInfoService;

/**
 *
 * @author naeem
 */
public class HalfYearlyModule {
    
    public JsonArray getHalfR(String fdate,String ldate){
        
        JsonObject result =new JsonObject();
JsonArray ja=new JsonArray();
    Gson gson=new Gson();
try{
HalfYearly[] hyearly ;
hyearly=new HalfYearlyService().getData(fdate,ldate) ;

for(HalfYearly hyear:hyearly){
   
    String objestr=gson.toJson(hyear);
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
