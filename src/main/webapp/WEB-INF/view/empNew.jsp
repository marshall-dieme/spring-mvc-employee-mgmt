<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page import="com.saraya.dto.EmployeeDto" %>
<!DOCTYPE html>
<html>
<head>
    <title>Saraya Employee Management</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/mystyle.css" />">
    <link rel="stylesheet" href="<c:url value="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css" />">
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
<div class="">
    <%--Here we have our form binded--%>
    <form:form action="/employees" method="post" modelAttribute="employeeDto" enctype="multipart/form-data">
        First name : <form:input path="firstName" />
        <%--The validation for first name return error...to print it we use <form:errors>--%>
        <form:errors path="firstName" cssStyle="color: red" />
        Last name : <form:input path="lastName" />
        Hire date : <form:input path="hireDate"/>
        Salary : <form:input path="salary" />
        Manager : <form:radiobutton path="manager" value="true" label="Yes" />
        <form:radiobutton path="manager" value="false" label="No" /> <br>
        Department : <form:select path="deptId">
                <form:option value="">Select Department</form:option>
                <c:forEach items="${departments}" var="dept">
                    <form:option value="${dept.id}">${dept.name}</form:option>
                </c:forEach>
        </form:select>

        <button type="submit">Save</button>
    </form:form>
</div>



<script src="<c:url value="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" />"></script>
<script src="<c:url value="https://code.jquery.com/ui/1.13.1/jquery-ui.js" />"></script>
<script>
    jQuery(function ($) {
        $(".field-input").focus(function () {
            $(this).parent().addClass("is-focused has-label")
        })

        $(".field-input").blur(function () {
            $parent = $(this).parent()
            if ($(this).val() === "" || $(this).val() === null) {
                $parent.removeClass("has-label")
            }
                $parent.removeClass("is-focused")
        })

        /*$("#hireDate").datepicker({
            onClose : function (e) {
                if(e !==""){
                    $(this).parent().addClass("has-label")
                }
            },
            dateFormat: "dd-mm-yy"
        })*/

    })
</script>

</body>
</html>
