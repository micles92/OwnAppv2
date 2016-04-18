<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:url value="/login" var="loginURL"/>
<c:url value="/logout" var="logoutULR"/>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="../css/Main.css">
    <link rel="stylesheet" type="text/css" href="../css/chartist.min.css">
    <script type="text/javascript" src="../js/chartist.min.js"></script>
    <title>MyApp</title>
</head>
<body>
<div><h1>Menu</h1></div>
    <a href="/users" >Lista Uzytkownikow</a>
<br>
    <a href="/books">Lista Ksiazek</a>
<br>
    <a href="/rents">Lista Wypozyczen</a>

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

<script>

    var data = {
        labels: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri'], series: [
            [5, 2, 4, 2, 0]
        ]
    };

    var options = {
        width: 300,
        height: 200
    };


    new Chartist.Line('.ct-chart', data);
</script>




<div class="ct-chart ct-perfect-fourth"></div>


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
