<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Saraya Employee Management</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/mystyle.css" />">
</head>
<body>
    <div class="navbar">
        <div class="logo">
            <a href="/home">STS</a>
        </div>
        <div class="nav-links">
            <ul class="links">
                <li class="link active"><a href="/home">Home</a></li>
                <li class="link"><a href="/departments">Departments</a></li>
                <li class="link"><a href="/employees">Employees</a></li>
            </ul>
            <div class="logout">
                welcome back,&nbsp;<span>${username}</span>
                <a href="/logout" class="btn-logout">Logout</a>
            </div>
        </div>
    </div>
    <h1>Welcome ${username}</h1>

    <a href="/departments">Departments</a>
</body>
</html>
