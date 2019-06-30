var data;
$(document).ready(function(){
    
    $('#yearsubmit').on('click',function(){
        
      var reportfdate,reportldate;
        //console.log('clicked');
       var year=$('#halfyear').val();
       console.log(year);
       if(year==='July-December'){
           var d=new Date();
           reportldate=d.getFullYear()+'-12-31';
           console.log(reportldate);
           reportfdate=d.getFullYear()+'-07-01';
           console.log(reportfdate);
       }    
       else{
           var d=new Date();
           reportldate=d.getFullYear()+'-06-30';
           console.log(reportldate);
           reportfdate=d.getFullYear()+'-01-01';
           console.log(reportfdate);
           console.log('ajax first');
       }
           
       var jqxhr=$.get('HalfYearly',{ 
          async:false,
          fdate:reportfdate,
          
           ldate:reportldate
           
           
       },function(ResponseText){
        console.log(ResponseText);   
       data=ResponseText;
       var table = new Tabulator("#grid", {
 	
        
        // set height of table (in CSS or here), this enables the Virtual DOM and improves render speed dramatically (can be any valid css height value)
 	data:data, //assign data to table
 	layout:"fitColumns", //fit columns to width of table (optional)
 	columns:[ //Define Table Columns
	 	{title:"Advice No", field:"advno", width:110},
	 	{title:"Contractor Name", field:"cname",width:160},
                {title:"Employee Name", field:"empname",width:170},
                {title:"Salary", field:"salary",width:130},
                {title:"join Date", field:"jdate",width:150},
                {title:"Nature of work", field:"nofwork",width:250},
                {title:"Zone", field:"zon",width:100},
                
                {title:"ESI Govt", field:"esigovt",width:140},
                {title:"ESI Emp", field:"esiemp",width:160},
                {title:"Service", field:"servic",width:120},
                {title:"Ward No", field:"wardno",width:140},
                {title:"Created at", field:"createdat",width:150},
                {title:"Created By", field:"createdby",width:150}
                
        ]
    
});
   });
   console.log(data);
    
    
         
    });    
           
           
       
       
        
    });
    
 
    
    