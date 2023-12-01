<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>注册</title>
</head>
<body>
<h2>注册页面</h2>

<%-- 注册表单 --%>
<form action="${pageContext.request.contextPath}/register" method="post">
    <label for="name">用户名:</label>
    <input type="text" name="name" id="name" required><br>

    <label for="password">密码:</label>
    <input type="password" name="password" id="password" required><br>

    <input type="submit" value="注册">
</form>
</body>
</html>