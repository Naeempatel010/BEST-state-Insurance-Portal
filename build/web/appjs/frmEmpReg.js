

var formvars={};
function validate(){    
     formvar=$('#employee').serializeArray();
     //console.log(formvar['insno']);
     var inslength= 10;
     var checklength=6;
     $.each(formvar, function(i, field){
    formvars[field.name]=field.value;
     });
     //console.log(typeof(formvars));
    if(!formvars['ldate']){
        formvars['ldate']=null;
    }
    if(!formvars['checkno']){
        formvars['checkno']=null;
    }
    if (!(formvars['empname'].search(/[^a-zA-Z]+/) === -1)) {
        alert('Please Enter Valid Name for the Employee');
     
        return false;
    }
    
    
    //console.log(url.searchParams.get("userid"));
    
    //console.log('The userid is'+$('#user').val());
    console.log($('user').val());
    return true;
    }
    
function upper(){
    $('#empname').val($('#empname').val().toUpperCase());
}    

$(document).ready(function(){
    var url_string=window.location.href;
    var url=new URL(url_string);
    formvars['userid']=url.searchParams.get("userid");
    sessionStorage.setItem("user",formvars['userid']);
    
    $('#employee').on('submit',function(e){
        
    var corr=validate();
    //if(corr){
      //  console.log('form validated');
    //}
    if(!corr){
    e.preventDefault();
    
    //console.log("in stopping");
    
}   else{
    var data=JSON.stringify(formvars);
    console.log(data);
   var jqxhr=$.post('employeeservlet',{
        async:false,
        data:data,
        success:function(){
            //alert('The Employee Has been registered Successfully');
        }
       },function(responseText){
        //console.log("jqxhr:"+ jqxhr);
                var ans = responseText.savej;
                console.log(ans);
                alert('The id generated for the Employee is'+ans);
    }).fail(function(){
        alert('failed');
    });

    
}
    




   });
   

   });
 
    
    


