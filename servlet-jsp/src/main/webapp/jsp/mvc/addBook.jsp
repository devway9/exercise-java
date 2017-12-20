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
    <title>添加书籍</title>
</head>
<body>
<form action="<%= request.getContextPath()%>/addBook" method="post">
    <p>书名：<input type="text" name="bookName" id="bookName"></p>
    <p>页数：<input type="text" name="pageNo" id="pageNo"></p>
    <p>描述：<input type="text" name="desc" id="desc"></p>
    <p><input type="submit" name="add" id="add" value="添加"></p>
</form>

</body>
</html>
