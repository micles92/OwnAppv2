<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: lesiulol
  Date: 22.02.16
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:url value="/edit-user" var="editUserURL" />
<html>
<head>
    <link rel="stylesheet" type="text/css" href="../css/Main.css">
    <title>User edit</title>
</head>
<body>
<h1>Edit user</h1>

<form action="${editUserURL}" method="post">
    <input type="hidden" name="id" value="${user.id}">

    login: <input type="text" name="login" value="${user.login}" />
    <br>
    email: <input type="text" name="email" value="${user.email}" />
    <br>

    <input type="submit" value="Submit" />

</form>

</body>
</html>