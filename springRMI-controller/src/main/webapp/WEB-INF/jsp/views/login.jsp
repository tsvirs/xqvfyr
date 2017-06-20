<%@page import="java.security.SecureRandom"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <base href="<%=basePath%>">
    <title>SpringMVC Cookie Demo</title>
    <%
        SecureRandom random = new SecureRandom();
        random.setSeed(8738);
        double _csrf = random.nextDouble();
        session.setAttribute("_csrf", _csrf);
    %>
</head>
<body>
<div align="center">
    <h2>SpringMVC Cookie Demo</h2>
    <form action="${pageContext.request.contextPath}/student/login/validate" method="post">
        <table>
            <tr>
                <td>用户名：</td>
                <td><input type="text" name="username" /></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="password" name="password" /></td>
            </tr>
            <tr>
                <td><input name="remember-me" type="checkbox">30天内自动登录</input></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="登录" />
                    <input type="reset" value="重置" /></td>
            </tr>
        </table>
        <input type="hidden" name="_csrf" value="<%=_csrf %>" />
    </form>

</div>
</body>
</html>