<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>Saraya Employee Management</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css" />">
    <link href='https://unpkg.com/boxicons@2.1.2/css/boxicons.min.css' rel='stylesheet'>
</head>

<body>
<div class="container">
    <div class="card">
        <div class="card-title">
            <h1>Login</h1>
            <div>
                <ul>
                    <li><i class='bx bxl-facebook'></i></li>
                    <li><i class='bx bxl-twitter' ></i></li>
                    <li><i class='bx bxl-google-plus' ></i></li>
                    <li><i class='bx bxl-github' ></i></li>
                </ul>
            </div>
        </div>
        <div class="card-content">
            <form action="${pageContext.request.contextPath}/login" method="post">
                <div class="input-group">
                    <input type="text" name="username" id="username" placeholder=" " />
                    <label for="username">Username</label>
                </div>
                <div class="input-group">
                    <input type="password" name="password" id="password" placeholder=" " />
                    <label for="password">Password</label>
                </div>
                <div class="submit-group">
                    <button type="submit">Login</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>