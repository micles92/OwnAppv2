<%--
  Created by IntelliJ IDEA.
  User: lesiulol
  Date: 15.04.16
  Time: 13:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>chart</title>
    <link rel="stylesheet" type="text/css" href="../css/chartist.min.css">
</head>
<body>

<script src="../js/chartist.min.js">

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

</body>
</html>
