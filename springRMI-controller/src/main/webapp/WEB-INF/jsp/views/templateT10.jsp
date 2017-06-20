<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="tilesx" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>t10首页</title>
    <tiles:insertAttribute name="commonCss"></tiles:insertAttribute>
</head>
<body>
    <tiles:insertAttribute name="commonNav"></tiles:insertAttribute>
    <tiles:insertAttribute name="item1"></tiles:insertAttribute>
    <tiles:insertAttribute name="item2"></tiles:insertAttribute>
    <tiles:insertAttribute name="commonFooter" ></tiles:insertAttribute>

</body>
<tiles:insertAttribute name="commonJs" ></tiles:insertAttribute>
</html>