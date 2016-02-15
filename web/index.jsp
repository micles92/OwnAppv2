<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:url value="/login" var="loginURL"/>
<c:url value="/logout" var="logoutULR"/>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="../css/Main.css">
    <title>MyApp</title>
</head>
<body>
<div><h1>Menu</h1></div>
    <a href="/users" >Lista Uzytkownikow</a>
<br>
    <a href="/books">Lista Ksiazek</a>

<c:if test="${loggeduser != null}" >
    <a href="${logoutULR}">Logout</a>
</c:if>

<c:choose>
<c:when test="${loggeduser == null}">
<form action="${loginURL}" method="post">
    <input type="text" name="login" placeholder="login" />
    <input type="text" name="password" placeholder="password" />
    <input type="submit" value="Submit" />
</form>
</c:when>
<c:otherwise>
    <h2>Witaj ${loggeduser.login}</h2>

</c:otherwise>
</c:choose>

<%--<c:if  test="${loggeduser == null}">--%>
    <%--<form action="${loginURL}" method="post">--%>
        <%--<input type="text" name="login" placeholder="login" />--%>
        <%--<input type="text" name="password" placeholder="password" />--%>
        <%--<input type="submit" value="Submit" />--%>
    <%--</form>--%>
<%--</c:if>--%>
<%--<c:if test="${loggeduser != null}">--%>
    <%--<h2>Witaj ${loggeduser.login}</h2>--%>

<%--</c:if>--%>


</body>
</html>
