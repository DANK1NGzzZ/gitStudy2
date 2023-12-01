<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"   %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ywh_end_menu Table</title>
</head>
<body>
<h2>Ywh_end_menu Table</h2>
<ul>
       <c:forEach var="menu" items="${ywh_end_menus}">
    <li><a href="./courseinfo">${menu.name}</a></li>
</c:forEach>
</ul>
</body>
</html>