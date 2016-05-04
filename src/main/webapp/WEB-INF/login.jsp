<%--
  Created by IntelliJ IDEA.
  User: lesiulol
  Date: 04.05.16
  Time: 18:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title tiles:fragment="title">Messages : Create</title>
</head>
<body>
<div tiles:fragment="content">
    <form name="f" th:action="@{/login}" method="post">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <fieldset>
            <legend>Please Login</legend>
            <div th:if="${param.error}" class="alert alert-error">

            </div>
            <div th:if="${param.logout}" class="alert alert-success">

            </div>
            <label for="username">Username</label>
            <input type="text" id="username" name="username"/>
            <label for="password">Password</label>
            <input type="password" id="password" name="password"/>
            <div class="form-actions">
                <button type="submit" class="btn">Log in</button>
            </div>
        </fieldset>
    </form>
</div>

</body>
</html>
