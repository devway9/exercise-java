<%--
  author: devway9
  date: 2017-12-20
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
    <tiles:insertAttribute name="meta" />
    <title><tiles:insertAttribute name="title" /> </title>
</head>
<body>
    <div id="header">
        <tiles:insertAttribute name="header" />
    </div>
    <div id="body">
        <tiles:insertAttribute name="body" />
    </div>
    <div id="footer">
        <tiles:insertAttribute name="footer" />
    </div>
</body>
</html>
