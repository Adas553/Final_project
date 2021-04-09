<%--
  Created by IntelliJ IDEA.
  User: adam
  Date: 08.04.2021
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Strona logowania</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <link rel="stylesheet" href="/style.css">
</head>

<body>
<%@include file="header.jsp"%>

<div style="display: flex; text-align: center; justify-content: center; align-items: center; height: 400px">
<form>
    <label for="email">email: </label>
    <input type="text" id="email" placeholder="podaj email"/>
    <br>
    <label for="password">password: </label>
    <input type="text" id="password" placeholder="podaj hasło"/>
    <br>
    <input type="submit" value="Zaloguj">
</form>
</div>

<%@include file="footer.jsp"%>
</body>
</html>
