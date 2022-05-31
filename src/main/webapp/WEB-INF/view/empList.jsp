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
            <li class="link"><a href="/departments">Departments</a></li>
            <li class="link active"><a href="/employees">Employees</a></li>
        </ul>
        <div class="logout">
            welcome back,&nbsp;<span><c:out value="${username}" /></span>
            <a href="/logout" class="btn-logout">Logout</a>
        </div>
    </div>
</div>
<div class="content">   
    <div class="page-title">
        <h2>Employees</h2>
    </div>
    <div class="content-table">
        <div class="create-btn">
            <button>
                <a href="/employees/new">Add Employee</a>
            </button>
        </div>
        <table class="table-data" border="0">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Hire date</th>
                    <th>Salary</th>
                    <th>Department</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="emp" items="${employees}">
                    <tr>
                        <td><c:out value="${emp.matricule}" /></td>
                        <td><c:out value="${emp.firstName}" /></td>
                        <td><c:out value="${emp.lastName}" /></td>
                        <td><c:out value="${emp.hireDate}" /></td>
                        <td>$<c:out value="${emp.salary}" /></td>
                        <td><c:out value="${emp.department.name}" /></td>
                        <td>
                            <a href="employees/${emp.matricule}">Detail</a>
                            <a href="employees/update/${emp.matricule}">Update</a>
                            <a href="employees/delete/${emp.matricule}">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
