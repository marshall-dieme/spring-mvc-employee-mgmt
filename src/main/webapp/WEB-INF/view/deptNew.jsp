<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Department New</title>
</head>
<body>
    <form action="/departments" method="post">
        Department Name : <input type="text" name="deptName" value="${dept.name}" />

        <input type="text" value="${dept.id}" name="id" hidden />

        <br>
        <br>
        <input type="submit" value="${dept != null ? "Update" : "Create"}" />
    </form>
</body>
</html>
