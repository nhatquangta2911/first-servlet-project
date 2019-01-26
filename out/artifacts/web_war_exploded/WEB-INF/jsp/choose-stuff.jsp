<%--
  Created by IntelliJ IDEA.
  User: ryan-ta
  Date: 1/25/19
  Time: 1:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Choose Anything You Want</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
</head>
<body class="container-fluid">
    <br><br>
    <form action="/choose-stuff" class="form-group" method="post">
        <label> Choose Product: </label>
        <select class="form-control" name="choose-product" id="choose-product">
            <option>Book</option>
            <option>Pencil</option>
            <option>Ruler</option>
            <option>Notebook</option>
            <option>Souvenir</option>
            <option>Blackboard</option>
            <option>Student Bag</option>
        </select>
        <br>
        <button type="submit" class="btn btn-primary" >Show</button>
    </form>
    <p class="text-success">${result}</p>
</body>
</html>
