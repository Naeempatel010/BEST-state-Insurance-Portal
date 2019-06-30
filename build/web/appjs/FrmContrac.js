var formvars={};
function upper(){
    $('#contractorName').val($('#contractorName').val().toUpperCase());
}
function validate(){
   formvar=$('#contractor').serializeArray();
$.each(formvar, function(i, field){
    formvars[field.name]=field.value;
     });
//console.log(formvars);
if (!(formvars['cname'].search(/[^a-zA-Z]+/) === -1)) {
        alert('Please Enter Valid Name for the Employee');
        return false;
    }
return true;
}

$(document).ready(function(){
$('#contractor').submit(function(){
var corr=validate();

if(corr){
    alert('form validated successfully');
    
        
    
    var userid=sessionStorage.getItem("user");
    console.log(userid);
    formvars["userid"]=userid;
        var data=JSON.stringify(formvars);
    
        var jqxhr=$.post('contractorservlet',{
        async:false,
        data:data
       },function(responseText){
        console.log("jqxhr:"+ jqxhr);
                var ans = responseText.savej;
                console.log(ans);
                alert('The id generated for the Contractor is'+ans);
    }).fail(function(){
        alert('failed');
    });
}
});



});