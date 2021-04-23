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
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/style.css">
</head>
<style>


</style>
<body>
<%@include file="header.jsp"%>

<%--<div style="display: flex; text-align: center; justify-content: center; align-items: center;">--%>
<div class="container-fluid">
    <div class="row">
<form:form autocomplete="off" method="post" action="/registration" modelAttribute="user"
           class="col-xs-8 col-xs-offset-2  col-sm-6 col-sm-offset-3 col-md-4 col-sm-offset-4 col-lg-2 col-lg-offset-5">
<%--    <form:errors path="*" cssClass="errorblock" element="div"/>--%>
    <h3>Rejestracja:</h3>
    <div class="form-group form-inline">
    <label for="name" >imię: </label>
    <form:input class="form-control mx-sm-3" path="name" placeholder="podaj imię"/>
    <form:errors path = "name" cssClass="error" />
    </div>
    <div class="form-group form-inline">
    <label for="lastName">nazwisko: </label>
    <form:input class="form-control mx-sm-3"   path="lastName" placeholder="podaj nazwisko"/>
    <form:errors path="lastName" cssClass="error"/>
    </div>
    <div class="form-group form-inline">
    <label for="userName">użytkownik: </label>
    <form:input class="form-control mx-sm-3"   path="userName" placeholder="podaj nazwę użytkownika"/>
    <form:errors path="userName" cssClass="error"/>
    </div>
    <div class="form-group form-inline">
    <label for="password">hasło: </label>
    <form:input class="form-control mx-sm-3"  path="password" placeholder="podaj hasło"/>
    <form:errors path="password" cssClass="error"/>
    </div>
    <div class="form-group form-inline">
    <label for="email">email: </label>
    <form:input class="form-control mx-sm-3"  path="email" placeholder="podaj email"/>
    <form:errors path="email" cssClass="error"/>
    </div>
    <input class="btn btn-sm btn-primary btn-block" type="submit" value="Wyślij"/>

    <h2><c:out value="${successMessage}"/></h2>
</form:form>
</div>
</div>

<%--<%@include file="footer.jsp"%>--%>
</body>
</html>
