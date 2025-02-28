<%--
  Created by IntelliJ IDEA.
  User: ranjith-suranga
  Date: 2/25/25
  Time: 5:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>This is SSR</title>
    <link rel="stylesheet" href="css/style.css">
    <script defer src="js/main.js"></script>
</head>
<body>
    <%
        for(int i = 0; i<5; i++){
    %>
    <h1>I am awesome</h1>
    <%
        }
    %>
</body>
</html>
