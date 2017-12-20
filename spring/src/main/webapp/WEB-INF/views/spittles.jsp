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
<c:forEach items="${spittleList}" var="spittle">
    <li id="spittle_<c:out value="spittle.id"/>">
        <div>
            <c:out value="${spittle.message}"/>
        </div>
    </li>
</c:forEach>
</body>
</html>
