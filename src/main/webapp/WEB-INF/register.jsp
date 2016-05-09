<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
    <title>Formularz Rejestracji</title>
</head>
<body>
<H1>
    Formularz rejestracji
</H1>
<form:form modelAttribute="user" method="POST" enctype="utf8" action="/register">
    <br>
    <tr>
        <td><label>Login
        </label>
        </td>
        <td><form:input path="login" value="" /></td>

    </tr>
    <tr>
        <td><label>Email
        </label>
        </td>
        <td><form:input path="email" value="" /></td>

    </tr>
    <tr>
        <td><label>Haslo
        </label>
        </td>
        <td><form:input path="password" value="" /></td>

    </tr>


    <button type="submit">Zarejestruj
    </button>
</form:form>
<br>
<a href="<c:url value="/login" />">Zaloguj sie
</a>
</body>
</html>
