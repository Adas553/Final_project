<%--
  Created by IntelliJ IDEA.
  User: adam
  Date: 14.04.2021
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Przychodnia Wacuś</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <%--    <link rel="stylesheet" type="text/css" href="/style.css">--%>
</head>

<body>
<header>

    <nav class="navbar navbar-light navbar-expand-md" style="background-color: #b6d4fe;">

        <a class="navbar-brand" href="#">Wacus.pl</a>

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mainmenu"
                aria-controls="mainmenu" aria-expanded="false" aria-label="Przełącznik nawigacji">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="mainmenu">
            <ul class="navbar-nav">
                <li class="nav-item active">
                    <a class="nav-link" href="<c:url value="/home"/>">Strona główna</a>
                </li>
                <li class="nav-item dropdown active">
                    <a class="nav-link dropdown-toggle" href="#" data-bs-toggle="dropdown" role="button"
                       aria-expanded="false" id="dropdownMenuLink" aria-haspopup="true">
                        O nas
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="dropdownMenuLink">

                        <li><a class="dropdown-item" href="<c:url value="/specialists"/>">Informacje o przychodni</a></li>
                       <li><a class="dropdown-item" href="<c:url value="/specialists"/>">Specjaliści</a></li>

                    </ul>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="<c:url value="/login"/>">Logowanie</a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="<c:url value="/registration"/>">Rejestracja</a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="<c:url value="/contact"/>">Kontakt</a>
                </li>
            </ul>
        </div>

    </nav>

</header>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>
