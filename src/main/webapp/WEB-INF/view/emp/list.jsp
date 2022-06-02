<%@include file="../header.jspf"%>
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
<%@include file="../footer.jspf"%>