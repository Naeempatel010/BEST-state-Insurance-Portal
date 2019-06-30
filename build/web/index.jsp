<%-- 
    Document   : index
    Created on : 19 Dec, 2018, 12:02:29 PM
    Author     : Namira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <script src="appjs/index.js"></script>
        <link rel="stylesheet" type="text/css" href="css/indexstyle.css">
        <title>ESI BEST</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body class="text-center">
        <div class="jumbotron">
    <h1>Employee State Insurance Portal</h1>
    <form class="form-signin" id="signin" method="POST" action="indexservlet">
      <img class="mb-4" src="images/logo.jpg" alt="" width="72" height="72">
      <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
      <label for="CheckNo" class="sr-only">User Name</label>
      <input type="number" name="username" id="checkno" class="form-control" placeholder="Check No" required autofocus maxlength="6" oninput="javascript: if (this.value.length > this.maxLength) this.value = this.value.slice(0, this.maxLength); " >
      <label for="inputPassword" class="sr-only">Password</label>
      <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required>
      <div class="checkbox mb-3">
      </div>
      <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      <p class="mt-5 mb-3 text-muted">Copyright © 2018 - All Rights Reserved - BEST IT DEPT</p>
    </form>
        </div>
  </body>
</html>
