<%--
  Created by IntelliJ IDEA.
  User: adam
  Date: 08.04.2021
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Przychodnia Wacuś</title>
    <link rel="stylesheet" href="<c:url value="../css/style.css"/>">
</head>
<body>
<style>
    .header-table {
        background-color: aquamarine;
        width: 100%;
        height: 10%;
    }
    .header-table td {
        border: 1px solid black;
        color: #007bff;
        text-align: center;
    }
    .header-table td a {
        text-decoration: none;
        color: black;
    }
    .footer-table {
        background-color: aquamarine;
        width: 100%;
        height: 10%;
        position: fixed;
        bottom: 0;
    }
    .footer-table td {
        border: 1px solid black;
        color: #007bff;
        text-align: center;
    }
    .footer-table td a {
        text-decoration: none;
        color: black;
    }


</style>
<%@include file="header.jsp"%>

<div style="color: black; font-size: 20px; text-align: center; line-height: 350px; background-color: bisque">
<h1>Witamy na głównej stronie przychodni Wacuś.</h1>
</div>

<%@include file="footer.jsp"%>
</body>
</html>
