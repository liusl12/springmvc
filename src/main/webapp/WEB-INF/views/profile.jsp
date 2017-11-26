<%--
  Created by IntelliJ IDEA.
  User: Sandy
  Date: 2017/11/25
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>profile</title>
</head>
<body>
<h1>Your Profile</h1>
<h3><c:out value="${spittler.username}" /></h3><br/>
<h3><c:out value="${spittler.firstName}" /></h3><br/>
<h3><c:out value="${spittler.lastName}" /></h3><br/>
</body>
</html>
