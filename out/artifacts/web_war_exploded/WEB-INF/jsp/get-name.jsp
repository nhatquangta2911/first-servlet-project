<%--
  Created by IntelliJ IDEA.
  User: ryan-ta
  Date: 1/22/19
  Time: 2:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Get your name</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
</head>
<body>
    <form action="/get-name" method="post">
        <br><label>Input your name:
            <input type="text" name="name">
        </label>
        <input class="btn btn-info" type="submit" name="button" value="SEND">
        <br>
        <button class="btn btn-secondary">Log Out</button>
    </form>
    ${output}
</body>
</html>
