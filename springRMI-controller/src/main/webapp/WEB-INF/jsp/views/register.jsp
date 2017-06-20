<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>学员报名系统</title>
    <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
</head>
<body>
<div align="center">
    <h2>学员报名系统</h2>
    <form action="${pageContext.request.contextPath}/student/add" method="post" enctype="multipart/form-data">
        <table>
            <tr>
                <td>用户名：</td>
                <td><input type="text" name="stuName" /></td>
            </tr>
            <tr>
                <td>头像：</td>
                <td><input type="file" name="stu_photo" /></td>
            </tr>
            <tr>
                <td>邮箱：</td>
                <td><input name="email" type="text" /></td>
            </tr>
            <tr>
                <td>手机号：</td>
                <td><input type="text" id="mobile" name="mobile" />
                <br/><input type="button" id="sendCode" value="免费获取短信验证码" />
                </td>
            </tr>
            <tr>
                <td>验证码：</td>
                <td><input name="verifyCode" type="text" /></td>
            </tr>

            <tr>
                <td colspan="2" align="center"><input type="submit" value="登录" />
                    <input type="reset" value="注册" /></td>
            </tr>
            <tr>
                <td></td>
            </tr>


        </table>

    </form>

</div>

<script type="text/javascript" >

    $(function () {

       $('#sendCode').click(

           function () {
               var data={
                   mobile:$("#mobile").val()
               }
               $.ajax({
                   type:"POST",
                   url: "/student/sendCode",
                   data:data,
                   dataType:JSON,
                   success:function (html) {
                       console.log(html);
                   }
               })
           }
       );

    });
</script>
</body>
</html>