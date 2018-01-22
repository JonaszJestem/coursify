<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: Jonasz
  Date: 2018-01-19
  Time: 23:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Timetable</title>
</head>
<body>
    <form:form method="POST" action="/timetable" modelAttribute="course">
        <table>
            <tr>
                <td><form:label path = "name">Course name</form:label></td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td><form:label path = "type">Type</form:label></td>
                <td>
                    <form:select path = "type">
                        <form:option value = "LABORATORY" label = "Laboratory"/>
                        <form:option value = "SEMINARY" label = "Seminary"/>
                        <form:option value = "PRACTICAL" label = "Practical"/>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td><form:label path = "lecturer">Lecturer</form:label></td>
                <td><form:input path="lecturer" /></td>
            </tr>
            <tr>
                <td colspan = "2">
                    <input type = "submit" value = "Add course"/>
                </td>
            </tr>
        </table>
    </form:form>

    <p>Courses: </p>
    <c:forEach var="entry" items="${timetable.courseList}">
        <input type = "submit" value = "Remove"/> <c:out value="${entry.name}"/> <br />
    </c:forEach>
</body>
</html>
