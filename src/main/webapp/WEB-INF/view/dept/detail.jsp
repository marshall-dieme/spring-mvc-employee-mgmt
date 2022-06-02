<%@include file="../header.jspf"%>
    <div class="content">
        <div class="dept-info">
            <h1>${dept.name}</h1>
        </div>
        <div class="dept-details">
            <h3>Employees</h3>
            <table class="employee-table">
                <thead>
                    <tr>
                        <th>Matricule</th>
                        <th>Full Name</th>
                        <th>Actions</th>
                    </tr>
                </thead>
            </table>
        </div>

    </div>
<%@include file="../footer.jspf"%>