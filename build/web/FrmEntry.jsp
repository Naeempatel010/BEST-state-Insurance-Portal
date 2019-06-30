<%-- 
    Document   : FrmEntry
    Created on : 20 Dec, 2018, 10:41:22 PM
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
        <script src="fulltable/jquery.fulltable.js"></script>
    <link rel="stylesheet" href="fulltable/jquery.fulltable.css">
    <link rel="stylesheet" href="css/style.css">
    <script src="appjs/FrmEntry.js"></script>    
        <title>Contractor-Employee</title>
    </head>
    <body>
        <img src="images/logo.jpg" width="90" height="90" class="center">
        <h1 class="jumbotron"><strong>CONTRACTOR-EMPLOYEE ENTRY</strong></h1>
        <form>
            <div class="form-group">
                <table align="center">
                    <tr>
                        <td>
                            <strong>Ward No :</strong>
                        </td>
                        <td>
                            <select class="form-control" id="wardno"> 
                                <option>Select The option</option>
                                <option value="supply">100-Supply</option>
                                <option value="gAdministration">700-General Administration</option>
                                <option value="traffic">200-Traffic</option>
                            </select>
                        </td>
                        <td>
                            <strong>Contractor ID :</strong>
                        </td>
                        <td>
                            <select class="form-control"  id="contraid" required />
                            </select>
                        </td>    
                    </tr>
                    <tr>
                        <td>
                            <strong>Job Date :</strong>
                        </td>
                        <td>

                            <input type="date" class="form-control" id="jobdate"  required />
                        </td>
                        <td>
                        <strong>Zone :</strong>
                        </td>
                        <td>
                            <select id="zone" class="form-control" required >
                                <option>Select Your Zone</option>
                                <option>North</option>
                                <option>South</option>
                                <option>East</option>
                                <option>West</option>
                                
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <strong>Nature Of Work</strong>
                        </td>
                        <td colspan="3">
                    <input type="text" id="nofwork" class="form-control" placeholder="Describe the Work Nature" required />
                        </td>
                    </tr>
                        
                    
                    
                </table>
                <br>
                <div style="text-align: center"><strong>Enter the Employees Working for the Contractor:</strong></div>
                <br>
                <div class="table table-bordered">
        <table class="fulltable fulltable-editable" style="border:1px solid black" id="test-table">
  <thead>
    <tr>
      <th fulltable-field-name="empid">Employee ID</th>
      <th fulltable-field-name="jdays">Working Days</th>
      <th fulltable-field-name="salary">Salary</th>
      <th fulltable-field-name="service">In Service</th>
      </tr>
  </thead>
  <tbody>
      

  </tbody>
</table>
                </div>
                
            <div class="text-center">
                <input type="submit" value="Save" id="entrysubmit" class="btn btn-primary" onsubmit="return confirmform()"  />
            </div>
            
    </div>
            
        </form> 
        
    </body>
</html>
