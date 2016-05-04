<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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

    <form:form commandName="user"  action="${createUserURL}" method="post">


       login: <form:input path="login" type="text" name="login" placeholder="Enter login" />
        <br>
       email: <form:input path="email" type="text" name="email" placeholder="Email..." />
        <br>
       password: <form:input path="password" type="password" name="password" placeholder="password..." />
        <br>
       repeat password: <input  type="password" name="repeatedpassword" placeholder="repeat password." />

        <form:radiobutton path="role" value="ADMIN"/>Admin
        <form:radiobutton path="role" value="USER"/>User

        <input type="submit" value="Submit" />


    </form:form>

</body>
</html>
