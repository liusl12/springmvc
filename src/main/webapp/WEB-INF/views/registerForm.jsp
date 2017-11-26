<%--
  Created by IntelliJ IDEA.
  User: liusl12
  Date: 2017/11/21
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>controller处理表单参数</title>
</head>
<body>
<h1>注册</h1>
<form method="POST">
    <label>First Name:</label><input type="text" name="FirstName" /><br/>
    <label>Last Name:</label><input type="text" name="LastName" /><br/>
    <label>Username:</label><input type="text" name="Username" /><br/>
    <label>Password:</label><input type="password" name="Password" /><br/>
    <input type="submit" name="Register" />
</form>
</body>
</html>
