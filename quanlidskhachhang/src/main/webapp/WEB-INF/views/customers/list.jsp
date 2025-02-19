<%--
  Created by IntelliJ IDEA.
  User: SON
  Date: 2/19/2025
  Time: 9:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<table border = "1px">

<tr>
    <td>id</td>
    <td>name</td>
    <td>email</td>
    <td>address</td>
</tr>
<c:forEach var = "c" items = "${customers}">
    <tr>
        <td>${c.id}</td>
        <td>${c.name}</td>
        <td>${c.email}</td>
        <td>${c.address}</td>
    </tr>
</c:forEach>


</table>
</body>
</html>
