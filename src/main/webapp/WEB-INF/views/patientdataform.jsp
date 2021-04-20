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
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="/style.css">
</head>

<body>
<%@include file="patientheader.jsp" %>
filled form in java
<div class="container">
    <div class="row">
        <div class="col-sm-12 d-flex flex-column justify-content-center align-items-center">
        <form:form autocomplete="off" method="post" action="/registration" modelAttribute="patient">
            <%--    <form:errors path="*" cssClass="errorblock" element="div"/>--%>
            <h3>Uzupełnij swoje dane:</h3>
            <div class="form-group">
                <label for="email" class="form-label">email: </label>
                <form:input class="form-control" path="email"/>
                <form:errors path="email" cssClass="error"/>
            </div>
            <div class="form-check">
                <label for="gender" class="form-label">płeć: </label>
                <form:input class="form-check-input" type="radio" path="gender" value="M"/>
                <form:errors path="gender" cssClass="error"/>
            </div>
            <div class="form-group">
                <label for="userName" class="form-label">użytkownik: </label>
                <form:input class="form-control" path="userName" placeholder="podaj nazwę użytkownika"/>
                <form:errors path="userName" cssClass="error"/>
            </div>
            <input class="btn btn-sm btn-primary btn-block" type="submit" value="Wyślij"/>
        </form:form>
            <h2><c:out value="${successMessage}"/></h2>
    </div>
</div>

<%--<%@include file="footer.jsp"%>--%>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
        crossorigin="anonymous"></script>
<script src="/js/bootstrap.min.js"></script>
</body>
</html>
