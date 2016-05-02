<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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

<form:form commandName="book" action="${editBookURL}" method="post">

    <form:hidden path="id"/>

    autor: <form:input path="autor" type="text"  />
    <br>
    title: <form:input path="title" type="text"  />
    <br>
    year: <form:input path="year" type="text"  />
    <br>

    <input type="submit" value="Submit" />

</form:form>

</body>
</html>
