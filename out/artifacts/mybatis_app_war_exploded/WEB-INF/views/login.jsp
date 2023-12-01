<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>登录</title>
</head>
<body>
<h2>登录页面</h2>

<%-- 登录表单 --%>
<form action="${pageContext.request.contextPath}/login" method="post">
    <label for="name">用户名:</label>
    <input type="text" name="name" id="name" required><br>

    <label for="password">密码:</label>
    <input type="password" name="password" id="password" required><br>

    <input type="submit" value="登录"><a href="./re">注册</a>
</form>
</body>
</html>