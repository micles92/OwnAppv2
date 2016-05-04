<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
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
    <%--<link rel="stylesheet" type="text/css" href="../css/Main.css">--%>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

</head>
<body>
<div><h1>Lista uzytkownikow</h1></div>
<table class="table table-bordered table-striped table-hover">
    <thead>
    <tr>
        <th>Id</th>
        <th>Login</th>
        <th>E-mail</th>
        <th>Action</th>
    </tr>
    </thead>
        <tbody>
        <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.login} </td>
            <td> ${user.email} </td>
            <sec:authorize access="hasRole('ADMIN')">
            <td>
                <a href= "${editUserURL}/${user.id}">Edit</a>
                <br>

                <a href="${deleteUserURL}/${user.id}">Delete</a>
            </td>
            </sec:authorize>
        </tr>
        </c:forEach>
        </tbody>
    </table>

<sec:authorize access="hasRole('ADMIN')">
<a href="${createUserURL}" class="btn btn-primary">Create User</a>
</sec:authorize>
<i class="fa fa-stop-circle-o"></i>


</body>
</html>
