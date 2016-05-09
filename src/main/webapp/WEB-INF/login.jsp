<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns:th="http://www.thymeleaf.org" xmlns:tiles="http://www.thymeleaf.org">
<head>
    <title tiles:fragment="title">Login</title>
    <link rel='stylesheet prefetch' href='http://aleksite.6te.net/css/bootstrap.css'>
    <link rel="stylesheet" type="text/css" href="../css/style.css">
</head>
<body>

<c:if test="${not empty registerSuccess}">
<div class="alert alert-success">
    <strong>Success!</strong> Indicates a successful or positive action.
</div>
</c:if>

<c:if test="${not empty logoutSuccess}">
    <div class="alert alert-success">
        <strong>Success!</strong> Udalo sie
    </div>
</c:if>


<div id="login" class="span3 well well-large offset4">
    <form  name="f" th:action="@{/login}" method="post">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

            <legend>Account Panel</legend>
            <div th:if="${param.error}" class="alert alert-error">
            </div>
            <div th:if="${param.logout}" class="alert alert-success">
            </div>
            <label for="username">Username</label>
            <input type="text" id="username" name="username" placeholder="Login"/>
            <label for="password">Password</label>
            <input type="password" id="password" name="password" placeholde r="Password"/>
            <label class="checkbox" for="rememberme">
            <input type="checkbox" /> Remember me
            </label> <br />
            <div class="form-actions">
                <button type="submit" value="Login" class="btn btn-success">Log in</button> or <a class="btn" href="/register">Create Account</a>
            </div>

    </form>
</div>
<script src='http://aleksite.6te.net/js/bootstrap.js'></script>
</body>
</html>