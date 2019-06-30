<%-- 
    Document   : FrmContrac
    Created on : 20 Dec, 2018, 9:33:08 PM
    Author     : Namira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <script src="appjs/FrmContrac.js"></script> 
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <title>Contractor Registration</title>
    </head>
    <body>
        <img src="images/logo.jpg" width="90" height="90" class="center">
        <h1 class="jumbotron"><strong>CONTRACTOR REGISTRATION</strong></h1>
        <form id="contractor" class="form-group"  method="post" style="left: 40%;margin-top:30px;">
            <div id="one" class="border">
                <table align="center">
                    <tr>
                        <td>
                            <strong>Contractor's Name:</strong>
                        </td>
                        <td>
                            <input type="text" id="contractorName" name="cname" class="form-control "placeholder="Enter the Name" onkeyup="upper()" required />
                        </td>
                    </tr>
                </table>
                <input type="submit" value="Submit" class="btn btn-primary"  id="contractorsubmit" style="position:absolute;margin-top: 10px;"/>     
            </div>
        </form>
    </body>
</html>
