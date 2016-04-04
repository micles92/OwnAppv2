<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lesiulol
  Date: 28.01.16
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:url value="/add-rent" var="addRentURL"/>
<c:url value="/edit-rent" var="editRentURL" />
<c:url value="/delete-rent" var="deleteRentURL" />
<html>
<head>
    <title>Rent List</title>
    <link rel="stylesheet" type="text/css" href="../css/Main.css">
</head>
<body>

<div><h1>Lista wypozyczen</h1></div>

<table border="3" cellpadding="5">
    <tr>
        <th>Id</th>
        <th>Book</th>
        <th>User</th>
        <th>Action</th>
    </tr>
</table>
<table border="3" cellpadding="5" valign="bottom">
    <c:forEach items="${rents}" var="rent">


        <tr>
            <td align="center" valign="bottom">${rent.id}</td>
            <td align="center" valign="bottom">${rent.book.title} (${rent.book.autor}) </td>
            <td align="center" valign="bottom"> ${rent.user.login} (${rent.user.email}) </td>
            <td align="center" valign="bottom">
                <a href ="${editRentURL}/${rent.id}">Edit</a>
                <br>
                <a href ="${deleteRentURL}/${rent.id}">Delete</a>
            </td>
        </tr>

    </c:forEach>
</table>

<a href="${addRentURL}">Add Rent</a>
</body>
</html>
