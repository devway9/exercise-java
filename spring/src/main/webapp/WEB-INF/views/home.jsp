<%--
  author: devway9
  date: 2017-12-20
--%>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Welcome</h1>
    <a href="<c:url value="/spittles"/>"/>Spittles</a>
    <a href="<c:url value="/spittler/register"/>"/>Register</a>
</body>
</html>
