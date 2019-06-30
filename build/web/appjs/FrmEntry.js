var jqxhr=$.get('dropdownServlet',{
    
},function(ResponseText){
   contraclist=ResponseText;
    console.log(contraclist);
    });


var contraclist;
function confirmform(){
    if(confirm("Are you sure you want to continue?Any Non existent ContractorID or  EmployeeID will not be discarded")){
        return true;
    }
    else{
        return false;
    }
    
}

function validation()
{
    data1=$('#test-table').FullTable('getData');
//console.log('inside validation');
     ///console.log($('#wardno option:selected').text());
    if($('#wardno option:selected').text()==="Select The option"){
        //console.log("inside if");
        alert('Please select ward!');
        return false;
    }
    if($('#zone option:selected').text()==="Select Your Zone"){
        alert('Please Select Zone!');
        return false;
    }
    if($('#nofwork')===''){
        alert('please fill the the nature of work !');
        return false;
    }
    if($('#contraid').val()===''){
        alert('Please enter the contractor id');
        return false;
    }
    if($('#jobdate').val()===''){
        alert('Please Enter the Date');
        return false;
    }
    if($('#nofwork').val()===''){
        alert('Please enter the Nature of work');
        return false;
    }
    if(data1.length===0){
        
       //console.log('some value');
        //console.log($('#test-table').FullTable('getData'));
        //console.log('Please Make sure that you Fill atleast 1 Employee Detail');
        return false;
    }
    
    return true;
    }
$(document).ready(function(){

 $.each(contraclist,function(i,option){
     $('#contraid').append($('<option>').attr("value",option.id).text(option.cname));
     
     
 });   
    
$('#test-table').FullTable({
       "alwaysCreating":true,
       "fields":{
           "service":{
               "options":[
                   {
                       "title":"Yes",
                       "value":"yes"
                   },
                   {
                       "title":"No",
                       "value":"no"
                   }
               ],
               "mandatory":true,
               "placeholder":"Select One",
               "errors":{
                   "mandatory":"Compulsory"
               }
           },
           "empid":{
               "type":"integer",
               "mandatory":true,
               "errors":{
                   "mandatory":"EmployeeID is compulsory",
                   "type":"EmployeeID must be an integer number"

               }
           },
         "jdays":{   
            "type":"integer",
               "mandatory":true,
               "errors":{
                   "mandatory":"Working days is compulsory",
                   "type":"Working days must be an integer number"

        
            }
         
        
        },
        "salary":{
            "type":"integer",
               "mandatory":true,
               "errors":{
                   "mandatory":"Salary  is compulsory",
                   "type":"Salary must be an integer number"

            
        }
    
       }
       
    }    
        
        
   });
    
$("#test-table").FullTable("draw");
    
$('#entrysubmit').on('click',function(){
    corr=validation();
    if(corr){
        var createdby=sessionStorage.getItem("user");
        //alert('form has been validated successfully');
        var data1=JSON.stringify($('#test-table').FullTable('getData')); //console.log(data1);
        var data2=$('#test-table').FullTable('getData');
        for(var i in data2){
            data2[i]["wardno"]=$('#wardno').val();
            data2[i]["contracid"]=$('#contraid').val();
            data2[i]["jdate"]=$('#jobdate').val();
            data2[i]["zone"]=$('#zone').val();
            data2[i]["nofwork"]=$('#nofwork').val();
            data2[i]["createdby"]=createdby;
            //console.log(JSON.stringify(data2[i]));
        }
        //console.log(JSON.stringify(data2))
        formvars={};
        formvars['wardno']=$('#wardno').val();
        formvars['contracid']=$('#contraid').val();
        formvars['jdate']=$('#jobdate').val();
        formvars['zone']=$('#zone').val();
        formvars['nofwork']=$('#nofwork').val();
        //console.log(formvars);
        formvars=JSON.stringify(formvars);
        var finaldata=JSON.stringify(data2);
        var jqxhr=$.post('Entryservlet',{
        data:finaldata,
        success:function(){
            alert('your form has been successfully submitted');
        
        }
        ,function(responseText){
        //console.log("jqxhr:"+ jqxhr);
                alert('The data has been successfully stored');
            }
    }).fail(function(){
        alert('failed');
        
    });
        
    
    }  
});
       
    
});


