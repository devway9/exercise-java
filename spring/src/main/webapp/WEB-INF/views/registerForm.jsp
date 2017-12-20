<%--
  author: devway9
  date: 2017-12-20
--%>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form method="post">
    <div>
        <li>用户名<input type="text" name="name" id="name" value="" /></li>
        <li>密码<input type="password" name="password" id="password" value="" /></li>
        <li><input type="submit" value="注册"/></li>
    </div>
</form>
</body>
</html>
