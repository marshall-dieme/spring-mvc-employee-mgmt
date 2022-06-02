<%@include file="../header.jspf"%>
    <form action="/departments" method="post">
        Department Name : <input type="text" name="deptName" value="${dept.name}" />

        <input type="text" value="${dept.id}" name="id" hidden />

        <br>
        <br>
        <input type="submit" value="${dept != null ? "Update" : "Create"}" />
    </form>
<%@include file="../footer.jspf"%>
