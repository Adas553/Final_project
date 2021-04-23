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
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="/style.css">
</head>

<body>
<%@include file="header.jsp" %>


<div class="container">
    <div class="row">
        <div class="col-sm-12 d-flex flex-column justify-content-center align-items-center">
            <form method="post" action="/login">
                <h3>Logowanie: </h3>
                <div class="mb-3">
                    <label for="userName" class="form-label">Użytkownik: </label>
                    <input type="text" id="userName" name="userName" class="form-control" placeholder="podaj nazwę użytkownika"/>
                </div>
                <div class="mb-3">
                    <label for="password" class="form-label">Hasło: </label>
                    <input type="text" id="password" name="password" class="form-control"  placeholder="podaj hasło"/>
                </div>
                <%--    <input type="hidden" name="${_csrf.parameterName}" value="${_csfr.token}"/>--%>
                <input class="btn btn-sm btn-primary btn-block form-control" type="submit" value="Zaloguj">
            </form>
            <form action="/logout" method="post">
                <input class="btn btn-sm btn-primary btn-block form-control" type="submit" value="Wyloguj">
            </form>
        </div>
    </div>
</div>

<%--    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>--%>



<%--<%@include file="footer.jsp"%>--%>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
        crossorigin="anonymous"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>
