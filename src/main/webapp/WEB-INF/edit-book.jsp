<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lesiulol
  Date: 29.01.16
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:url value="/edit-book" var="editBookURL"/>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="../css/Main.css">
    <title>Book edit.</title>
</head>
<body>
<div><h1>Edit book.</h1></div>

<form action="${editBookURL}" method="post">

    <input type="hidden" name="id" value="${book.id}"/>

    autor: <input type="text" name="autor" value = "${book.autor}" />
    <br>
    title: <input type="text" name="title" value="${book.title}" />
    <br>
    year: <input type="text" name="year"  value="${book.year}" />
    <br>

    <input type="submit" value="Submit" />

</form>

</body>
</html>
