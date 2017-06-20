<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>无标题文档</title>
    <%--<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet" type="text/css">--%>
    <%--<link href="${pageContext.request.contextPath}/css/Untitled-3.css" rel="stylesheet" type="text/css">--%>
    <%--<link href="${pageContext.request.contextPath}/css/Untitled-1base.css" rel="stylesheet" type="text/css">--%>

</head>
<body>
测试循环C标签！！！
<br/>
<c:forEach items="${jnshuFeatures}" var="feature">
    <c:out value="${feature}"></c:out>
</c:forEach>

</body>
</html>