var data;
var jqxhr=$.post('reportServlet',{
        
        menu:"empinfo",
        success:function(){
            alert('The Employee Has been registered Successfully');
            //console.log('this takes place');
        }
       },function(responseText){
        //console.log("jqxhr:"+ jqxhr);
            data=responseText;
            //console.log(responseText);
            console.log(typeof(data));
            console.log(data);
           
   }).fail(function(){
        alert('failed');
    }); 
      
$(document).ready(function(){
    
   //console.log(JSON.stringify(data));
   //var tabledata=$.parseJSON("["+JSON.stringify(data)+"]");
   
    console.log(data);
    var table = new Tabulator("#grid", {
 	
        
        // set height of table (in CSS or here), this enables the Virtual DOM and improves render speed dramatically (can be any valid css height value)
 	data:data, //assign data to table
 	layout:"fitColumns", //fit columns to width of table (optional)
 	columns:[ //Define Table Columns
	 	{title:"id", field:"id", width:150},
	 	{title:"Employee Name", field:"empname"},
                {title:"Insurance No.", field:"insno"},
                {title:"Birth Date", field:"bdate"},
                {title:"Join Date", field:"jdate"},
                {title:"DateStamp", field:"datestamp"},
                
                {title:"Time Created", field:"timecreated"},
                {title:"Check No", field:"checkno"}
	 	
        ],
    
});    
});







    