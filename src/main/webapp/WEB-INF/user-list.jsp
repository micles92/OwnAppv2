<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lesiulol
  Date: 20.01.16
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:url value="/create-user" var="createUserURL" />
<c:url value="/edit-user" var="editUserURL"/>
<c:url value="/delete-user" var="deleteUserURL"/>
<html>
<head>
    <title>Lista uzytkownikow</title>
    <link rel="stylesheet" type="text/css" href="../css/Main.css">
</head>
<body>
<div><h1>Lista uzytkownikow</h1></div>
<table border="3" cellpadding="5">
    <tr>
        <th>Id</th>
        <th>Login</th>
        <th>E-mail</th>
        <th>Action</th>
    </tr>
</table>

    <table border="3" cellpadding="5" valign="bottom">
        <c:forEach items="${users}" var="user">
        <tr>
            <td align="center" valign="bottom">${user.id}</td>
            <td align="center" valign="bottom">${user.login} </td>
            <td align="center" valign="bottom"> ${user.email} </td>
            <td align="center" valign="bottom">
                <a href= "${editUserURL}/${user.id}">Edit</a>
                <br>
                <a href="${deleteUserURL}/${user.id}">Delete</a>
            </td>
        </tr>
        </c:forEach>
    </table>


<a href="${createUserURL}">Create User</a>


</body>
</html>
