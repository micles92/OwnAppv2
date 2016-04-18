<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lesiulol
  Date: 29.01.16
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:url value="/add-book" var="addBookURL"> </c:url>
<html>
<head>
    <%--<link rel="stylesheet" type="text/css" href="../css/Main.css">--%>
    <%--<link rel="stylesheet" type="text/css" href="../css/Main.css">--%>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
          integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css"
          integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
            integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
            crossorigin="anonymous"></script>

    <title>Add book.</title>
</head>
<body>

<h1 align="center">Add Book: </h1>

<form action="${addBookURL}" method="post" class="form-horizontal">
    <div class="form-group">
        <label for="inputAutor" class="col-sm-2 control-label">Autor</label>
        <div class="col-sm-10">
            <input type="text" name="autor" class="form-control" id="inputAutor" placeholder="Autor..."/>
        </div>
    </div>
    <div class="form-group">
        <label for="inputTitle" class="col-sm-2 control-label">Title</label>
        <div class="col-sm-10">
            <input type="text" name="title" class="form-control" id="inputTitle" placeholder="Title..."/>
        </div>
    </div>
    <div class="form-group">
        <label for="inputYear" class="col-sm-2 control-label">Year</label>
        <div class="col-sm-10">
            <input type="text" name="year" class="form-control" id="inputYear" placeholder="Year..."/>
        </div>
    </div>



    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <input type="submit" class="btn btn-primary" value="Submit"/>
        </div>
    </div>

</form>

</body>
</html>
