<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"  %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
</head>
<body>
<h2>testHeader</h2>
<form action="<%=request.getContextPath() %>/testCookie" method="post" accept-charset="UTF-8">
    姓名：<input type="text" id="name" name="name"/>
    <p>年龄：<input type="text" id="age" name="age"/></p>
    <input type="submit" id="submit" value="submit"/>
</form>
</body>
</html>
