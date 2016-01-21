<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lesiulol
  Date: 20.01.16
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Lista uzytkownikow</h1>

<c:forEach items="users" var="user">
    ${user.email}
    <br>
    ${user.login}
    <br>
</c:forEach>

</body>
</html>
