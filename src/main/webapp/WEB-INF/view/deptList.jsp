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
            <li class="link"><a href="/home">Home</a></li>
            <li class="link active"><a href="/departments">Departments</a></li>
            <li class="link"><a href="/employees">Employees</a></li>
        </ul>
        <div class="logout">
            welcome back,&nbsp;<span><c:out value="${username}" /></span>
            <a href="/logout" class="btn-logout">Logout</a>
        </div>
    </div>
</div>
<div class="content">
    <div class="page-title">
        <h2>Departments</h2>
    </div>
    <div class="content-table">
        <div class="create-btn">
            <button>
                <a href="/departments/new">Add Department</a>
            </button>
        </div>
        <table class="table-data" border="0">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Manager</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="dept" items="${departments}">
                    <tr>
                        <td><c:out value="${dept.id}" /></td>
                        <td><c:out value="${dept.name}" /></td>
                        <td><c:out value="${dept.manager}" /></td>
                        <td>
                            <a href="departments/${dept.id}">Detail</a>
                            <a href="departments/update/${dept.id}">Update</a>
                            <a href="departments/delete/${dept.id}">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
