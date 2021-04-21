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
    <title>Uzupełnienie danych</title>
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

<div class="container">
    <form:form method="post" modelAttribute="patient" class="row gx-2">
        <form:hidden path="id"/>
        <form:hidden path="userName"/>
        <form:hidden path="user"/>
        <div class="row row-cols-2 gx-2">
            <div class="col-md-4">
                <label for="email" class="form-label">email: </label>
                <form:input class="form-control" path="email"/>
                <form:errors path="email" cssClass="error"/>
            </div>
            <div class="col-md-4">
                <label for="age" class="form-label">wiek: </label>
                <form:input class="form-control" path="age"/>
                <form:errors path="age" cssClass="error"/>
            </div>
        </div>
        <div class="row row-cols-2 g-2">
            <div class="col-md-4">
                <p class="form-label">Płeć:</p>
                <label for="gender" class="form-check-label">Mężczyzna</label>
                <form:radiobutton class="form-check-input" path="gender" value="M"/>
                <label for="gender" class="form-check-label">Kobieta</label>
                <form:radiobutton class="form-check-input" path="gender" value="K" checked="checked"/>
            </div>

            <div class="col-md-4">
                <p class="form-label">Osoba paląca:</p>
                <form:radiobutton class="form-check-input" path="smoke" value="True"/>
                <label class="form-check-label">
                    Tak
                </label>

                <form:radiobutton class="form-check-input" path="smoke" value="False" checked="checked"/>
                <label class="form-check-label">
                    Nie
                </label>
            </div>
        </div>

        <div class="row row-cols-1 g-2">
            <div class="col-md-8">
                <label for="chronicDiseases" class="form-label">Przyjmowane leki:</label>
                <form:input class="form-control" path="drugs" value="${patient.drugs}"/>
                <form:errors path="chronicDiseases" cssClass="error"/>
            </div>
        </div>

        <div class="row row-cols-1 g-2">
            <div class="col-md-8">
                <label for="drugs" class="form-label">Przewlekłe choroby:</label>
                <form:input class="form-control" path="chronicDiseases" value="${patient.chronicDiseases}"/>
                <form:errors path="drugs" cssClass="error"/>
            </div>
        </div>

        <div class="row row-cols-1 g-2">
            <div class="col-md-8">
                <label for="drugs" class="form-label">Przebyte choroby:</label>
                <form:input class="form-control" path="medicalHistory" value="${patient.medicalHistory}"/>
                <form:errors path="drugs" cssClass="error"/>
            </div>
        </div>

        <div class="row row-cols-1 g-2">
            <div class="col-md-8">
                <label for="diseasesOfRelatives" class="form-label">Przewlekłe choroby wśród krewnych:</label>
                <form:input class="form-control" path="diseasesOfRelatives" value="${patient.diseasesOfRelatives}"/>
                <form:errors path="diseasesOfRelatives" cssClass="error"/>
            </div>
        </div>
        <div class="col-md-12 gy-2">
            <input class="btn btn-sm btn-primary" type="submit" value="Zapisz"/>
        </div>
    </form:form>
</div>

<%--<%@include file="footer.jsp"%>--%>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
        crossorigin="anonymous"></script>
<script src="/js/bootstrap.min.js"></script>
</body>
</html>
