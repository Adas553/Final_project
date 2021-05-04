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

<div class="container-fluid">
    <div class="row h-25 align-items-center border-dashed">
        <dl class="row">
            <dt class="col-sm-3">Imię:</dt>
            <dd class="col-sm-9"><c:out value="${user.name}"/></dd>
            <dt class="col-sm-3">Nazwisko:</dt>
            <dd class="col-sm-9"><c:out value="${user.lastName}"/></dd>
            <dt class="col-sm-3">Email:</dt>
            <dd class="col-sm-9"><c:out value="${user.email}"/></dd>
            <dt class="col-sm-3">Wiek:</dt>
            <dd class="col-sm-9"><c:out value="${patient.age}"/></dd>
            <dt class="col-sm-3">Płeć:</dt>
            <dd class="col-sm-9"><c:out value="${patient.gender}"/></dd>
        </dl>
        <dl class="row gy-4">
            <dt class="col-sm-3">Przewlekłe choroby:</dt>
            <dd class="col-sm-9"><c:out value="${patient.chronicDiseases}"/></dd>
            <dt class="col-sm-3">Przyjmowane leki:</dt>
            <dd class="col-sm-9"><c:out value="${patient.drugs}"/></dd>
            <dt class="col-sm-3">Papierosy:</dt>
            <dd class="col-sm-9"><c:out value="${patient.smoke}"/></dd>
            <dt class="col-sm-3">Przebyte choroby:</dt>
            <dd class="col-sm-9"><c:out value="${patient.medicalHistory}"/></dd>
            <dt class="col-sm-3">Choroby osób bliskich(dziadkowie, rodzice, rodzeństwo):</dt>
            <dd class="col-sm-9"><c:out value="${patient.diseasesOfRelatives}"/></dd>
        </dl>
    </div>
</div>

<%--<%@include file="footer.jsp"%>--%>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
        crossorigin="anonymous"></script>
<script src="/js/bootstrap.min.js"></script>
</body>
</html>
