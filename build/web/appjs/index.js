$(document).ready(function(){
  
    $('#signin').on('submit',function(e){
       
      var data={}; 
      var username=$('#checkno').val();
      data['username']=username;
       var password=$('#inputPassword').val();
      data['password']=password;
      data=JSON.stringify(data);
      //console.log(data);
        
       // var jqxhr=$.post('indexservlet',{
           //async:false,
          // data:data
       //},function(responseText){
           //alert('Successfully Logged in');
       
       
   
           
       //}).fail(function(jqXHR, textStatus, errorThrown){
           //reporting any error
       });
        
        
    });

    
    
