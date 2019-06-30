<%-- 
    Document   : empinfo
    Created on : 17 Jan, 2019, 11:46:15 PM
    Author     : naeem
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Info</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.bundle.min.js"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <link href="https://unpkg.com/tabulator-tables@4.1.4/dist/css/tabulator.min.css" rel="stylesheet">
        <script type="text/javascript" src="https://unpkg.com/tabulator-tables@4.1.4/dist/js/tabulator.min.js"></script>
        <script src="appjs/halfyearly.js"></script> 
    </head>
    <body>
        <h1 class="jumbotron"><b>HALF YEARLY REPORT </b></h1>
        
        <form class="form-group" id="hyear">
            <h3><b>Please Select the half Yearly Statement</b><h3><br>
            <select id="halfyear" class="form-control" style="width:30%;text-align: center">
                <option disabled>--Select--</option>
                <option>July-December</option>
                <option>Jan-June</option>
                
            </select>
            <br>
          <input type="button" id="yearsubmit" value="submit" class="btn btn-primary" >  
        </form>
        <br><br><b><h4 class="text-center">REPORT</h4></b>
        <div id="grid" style="font-size:15px"></div>
    </body>
</html>
