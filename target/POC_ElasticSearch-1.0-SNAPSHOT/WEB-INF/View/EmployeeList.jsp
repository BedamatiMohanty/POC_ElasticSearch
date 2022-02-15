
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
    <title>Spring MVC Hello World</title>
</head>

<body>
    <h2>All Employees in System</h2>

    <table border="1">
        <tr>
            <th>EmployeeId</th>
            <th>Name</th>
            <th>Skillset</th>
        </tr>
        <c:forEach items="${employees}" var="employee">
            <tr>
                <td>${employee.employeeId}</td>
                <td>${employee.Name}</td>
                <td>${employee.Skillset}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
