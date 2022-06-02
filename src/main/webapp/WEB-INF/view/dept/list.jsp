<%@include file="../header.jspf"%>
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
<%@include file="../footer.jspf"%>
