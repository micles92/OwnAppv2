<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lesiulol
  Date: 25.01.16
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:url value="/create-user" var="createUserURL" > </c:url>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="../css/Main.css">
    <title>User Create</title>
</head>
<body>
    <h1>Create user</h1>

    <form action="${createUserURL}" method="post">
        <input type="hidden"
               name="${_csrf.parameterName}"
               value="${_csrf.token}"/>



       login: <input type="text" name="login" placeholder="Enter login" />
        <br>
       email: <input type="text" name="email" placeholder="Email..." />
        <br>
       password: <input type="password" name="password" placeholder="password..." />
        <br>
       repeat password: <input type="password" name="repeatedpassword" placeholder="repeat password." />
        <input type="submit" value="Submit" />

    </form>

</body>
</html>
