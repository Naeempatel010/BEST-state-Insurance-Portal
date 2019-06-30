<%-- 
    Document   : FrmEmpReg
    Created on : 20 Dec, 2018, 2:43:22 PM
    Author     : Namira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" type="text/css" href="css/style.css" />
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.bundle.min.js"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <title>Employee Registration</title>
    </head>
    <body>
        <p hidden id="userid"> <%= request.getParameter("userid") %> </p>
        <h1 class="page-header" style="text-align:center;background-color: lightblue" id="user"> <b>WELCOME  USER:-<%= request.getParameter("userid") %></b></h1>
         <nav class="navbar navbar-dark bg-dark">
          
          <li class="nav-item">
              <a class="nav-link" style="color:white;" href=""><b>Employee Registration</b></a>
      </li>
      <li class="nav-item">
          <a class="nav-link" style="color:white" href="FrmContrac.jsp"><b>Contractor Registration</b></a>
      </li>
      <li class="nav-item">
          <a class="nav-link" href="FrmEntry.jsp" style="color:white"><b>Employee-Contractor Entry</b></a>
      </li>
      <li class="nav-item dropdown">
          <div class="dropdown">
              <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown"><b>Reports</b>
    <span class="caret"></span></button>
    <ul class="dropdown-menu" style="font-color:white">
        <li><a href="empinfo.jsp"><b>Employee Info</b></a></li>
      <li><a href="#"><b>Contractor Info</b></a></li>
      <li><a href="halfyearly.jsp"><b>Half Yearly Statement</b></a></li>
      <li><a href="#"><b>Zone Summary Report</b></a></li>
      <li><a href="#"><b>Employee Contribution Statement</b></a></li>
    </ul>
  </div>
          </li>
          <a class="navbar-brand" href="index.jsp"><b>Logout</b></a>
</nav>

        <img src="images/logo.jpg" width="90" height="90" class="center">
        <h1 class="jumbotron"><strong>EMPLOYEE REGISTRATION</strong></h1>
        <form id="employee" class="form-group" name="employeeform" method="post" > 
            <div id="one">
                <table align="center">
                    <tr>
                        <td>
                            <strong>Employee Insurance No :</strong>
                        </td>
                        <td>
                            <input id="insurance" type="number" name="insno" class="form-control" oninput="javascript: if (this.value.length > this.maxLength) this.value = this.value.slice(0, this.maxLength); " placeholder="10 digit Insurance Number" autofocus  maxlength = "10" required />
                        </td>
                        <td>
                            <strong>Check No :</strong>
                        </td>
                        <td>
                            <input id="Checkno" type="number" name="checkno" class="form-control" maxlength = "6" oninput="javascript: if (this.value.length > this.maxLength) this.value = this.value.slice(0, this.maxLength);" placeholder="6 digit check No" autofocus/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <strong>Employee's Name :</strong>
                        </td>
                        <td>
                            <input id="empname" type="text" name="empname" class="form-control" onkeyup="upper()" placeholder="Enter the Name" autofocus  required />
                        </td>
                        <td>
                            <strong>Birth Date :</strong>
                        </td>
                        <td>
                            <input type="date" class="form-control" name="bdate" id="birthdate" autofocus required />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <strong>Join Date :</strong>
                        </td>
                        <td>
                            <input type="date" class="form-control "id="joindate" name="jdate" autofocus required />
                        </td>
                        <td>
                            <strong>Leave Date :</strong>
                        </td>
                        <td>
                            <input type="date" class="form-control" id="leavedate" name="ldate" autofocus/>
                        </td>
                    </tr>
                    
                </table>
            <br><input type="submit" id="registerEmp" value="Register"  class="btn btn-primary" autofocus style="position:absolute; left:50%;">
            </div>
            </form>
    <script src="appjs/frmEmpReg.js"></script>

        
        
                        
                    </tr>
            </div>
            <footer style="position:absolute;bottom:0px;left:30%">
                <div style="background-color:lightgray">
                <p>Copyright © 2018 - All Rights Reserved - BEST IT DEPT. Site best view on CHROME.</p>
                </div>
            </footer>
</body>
</html>
