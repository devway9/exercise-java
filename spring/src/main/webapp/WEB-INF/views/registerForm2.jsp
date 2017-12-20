<%--
  author: devway9
  date: 2017-12-20
--%>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf"
           uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>

<sf:form method="post" commandName="spitter">
    <div>
        <li>用户名<sf:input path="name"  />  <sf:errors path="name" /></li>
        <li>密码<sf:input path="password" />  <sf:errors path="password" /></li>
        <li><input type="submit" value="注册"/></li>
    </div>
</sf:form>

</body>
</html>
