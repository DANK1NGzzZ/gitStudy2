<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"   %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>课程名称</th>
        <th>讲师</th>
    </tr>
    </thead>
    <c:forEach var="info" items="${ywh_end_courses}" >
        <tr>
            <td>${info.name}</td>
            <td>${info.teacher_name}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
