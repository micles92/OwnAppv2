<%--
  Created by IntelliJ IDEA.
  User: lesiulol
  Date: 01.02.16
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>Error</title>
</head>
<body>
<h1>Strona Bledu.</h1>

<%= exception.getMessage()%>
<%--<%= exception.printStackTrace()%>--%>

</body>
</html>
