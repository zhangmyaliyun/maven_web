<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;utf-8" pageEncoding="utf-8" language="java" isELIgnored="false" %>
<html>
<body>
<%--<h2>Hello World!</h2>--%>

<table>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>性别</td>
    </tr>

    <c:forEach var="user" items="${requestScope.list}">
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
