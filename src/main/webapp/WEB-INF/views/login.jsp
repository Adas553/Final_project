<%--
  Created by IntelliJ IDEA.
  User: adam
  Date: 08.04.2021
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Strona logowania</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/style.css">
</head>

<body>
<%@include file="header.jsp"%>

<%--<div style="display: flex; text-align: center; justify-content: center; align-items: center;">--%>
<div class="container-fluid">
    <div class="row ">
<form method="post" action="/login" class="col-xs-8 col-xs-offset-2  col-sm-6 col-sm-offset-3 col-md-4 col-sm-offset-4 col-lg-2 col-lg-offset-5">
    <h3>Logowanie: </h3>
    <div class="form-group form-inline">
    <label for="userName">Użytkownik: </label>
    <input type="text" id="userName" name="userName" placeholder="podaj nazwę użytkownika"/>
    </div>
    <div class="form-group form-inline">
    <label for="password">Hasło: </label>
    <input type="text" id="password" name="password" placeholder="podaj hasło"/>
    </div>
<%--    <input type="hidden" name="${_csrf.parameterName}" value="${_csfr.token}"/>--%>
    <input class="btn btn-sm btn-primary btn-block" type="submit" value="Zaloguj">
</form>
<%--</div>--%>
    </div>
</div>
<form action="/logout" method="post"
      class="col-xs-8 col-xs-offset-2  col-sm-6 col-sm-offset-3 col-md-4 col-sm-offset-4 col-lg-2 col-lg-offset-5">
<input class="btn btn-sm btn-primary btn-block" " type="submit" value="Wyloguj">
<%--    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>--%>
</form>


<%--<%@include file="footer.jsp"%>--%>
</body>
</html>
