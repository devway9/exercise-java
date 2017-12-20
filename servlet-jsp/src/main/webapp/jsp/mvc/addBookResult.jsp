<%--
  Created by IntelliJ IDEA.
  User: wangying391
  Date: 2017-12-08
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>添加书籍结果</title>
</head>
<body>

<form action="<%= request.getContextPath()%>/jsp/mvc/addBook.jsp">
    <p>添加成功</p>
    <p>作用域：${scope}</p>
    <p>书名1：${book[name]}</p>
    <p>书名2：${book.bookName}</p>
    <p>页数：${book.pageNo}</p>
    <p>描述：${book.desc}</p>

    <p>隐式对象</p>
    <p>${pageContext.session.id}</p>
    <p>${param.desc}</p>
    <p>${header.Accept}</p>
    <p>${cookie.userCookie.value}</p>
    <p>${initParam.defaultColor}</p>
    <p>${requestScope.scope}</p>
    <p>${sessionScope.scope}</p>
    <p>${applicationScope.scope}</p>
    <p><input type="submit" name="returnAdd" id="returnAdd" value="继续添加"></p>
</form>

</body>
</html>
