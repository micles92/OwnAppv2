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
    <link rel="stylesheet" type="text/css" href="../css/Main.css">
    <title>Add book.</title>
</head>
<body>
<div><h1>Add Book.</h1></div>

<form action="${addBookURL}" method="post">
    autor: <input type="text" name="autor" placeholder="autor" />
    <br>
    title: <input type="text" name="title" placeholder="title..." />
    <br>
    year: <input type="text" name="year" placeholder="year..." />
    <br>

    <input type="submit" value="Submit" />

</form>

</body>
</html>
