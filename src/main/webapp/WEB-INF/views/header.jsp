<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<header>

  <nav class="navbar navbar-dark navbar-expand-md" style="background-color: dimgrey;">

    <a class="navbar-brand" href="<c:url value="/home"/>">Wacus.pl</a>

    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mainmenu"
            aria-controls="mainmenu" aria-expanded="false" aria-label="Przełącznik nawigacji">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="mainmenu">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link" href="<c:url value="/home"/>">Strona główna</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" data-bs-toggle="dropdown" role="button"
             aria-expanded="false" id="dropdownMenuLink" aria-haspopup="true">
            O nas
          </a>
          <ul class="dropdown-menu" aria-labelledby="dropdownMenuLink">

            <li><a class="dropdown-item" href="<c:url value="/specialists"/>">Informacje o przychodni</a></li>
            <li><a class="dropdown-item" href="<c:url value="/specialists"/>">Specjaliści</a></li>

          </ul>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="<c:url value="/login"/>">Logowanie</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="<c:url value="/registration"/>">Rejestracja</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="<c:url value="/contact"/>">Kontakt</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="<c:url value="/patient/home"/>">Mój profil</a>
        </li>
      </ul>
    </div>

  </nav>

</header>