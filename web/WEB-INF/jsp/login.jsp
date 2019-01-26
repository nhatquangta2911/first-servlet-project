<%--
  Created by IntelliJ IDEA.
  User: ryan-ta
  Date: 1/21/19
  Time: 7:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container-fluid">
    <br>
    <form action="/login" method="post">
        <%--<name: tham so truyen vao URL get--%>

        <fieldset>
            <h1 class="h1">LOGIN FORM</h1>
            ${errorMessage}
            <div class="form-group form-sm">
                <label for="email">Username:</label>
                <input name="username" type="text" class="form-control" id="email">
            </div>
            <div class="form-group">
                <label for="pwd">Password:</label>
                <input name="password" type="password" class="form-control" id="pwd">
            </div>
            <button type="submit" class="btn btn-outline-primary">Login</button>
        </fieldset>
    </form>
</div>
</body>
</html>
