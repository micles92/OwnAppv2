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
<c:url value="/add-rent" var="createRentURL"> </c:url>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="../css/Main.css">
    <title>Rent Create</title>
</head>
<body>
<div><h1>Add rent</h1></div>

<form action="${addRentURL}" method="post">


    <select name ="userId">
        <option value="">Wybierz uzytkownika</option>
        <c:forEach items="${users}" var="user">
        <option value=" ${user.id}">${user.login}</option>
        </c:forEach>
    </select>

    <select name = "bookId">
        <option value="">Wybierz ksiazke</option>
        <c:forEach items="${books}" var="book">
            <option value="${book.id}">${book.title}</option>
        </c:forEach>

    </select>


    <input type="submit" value="Rent"/>

</form>

</body>
</html>
