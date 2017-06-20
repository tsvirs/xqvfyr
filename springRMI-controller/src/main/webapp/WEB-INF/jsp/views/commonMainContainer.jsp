<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="main container">
    <!--第一部分开始-->
    <div class="main-a row">
        <c:forEach items="${jnshuFeatures}" var="feature">
            <div class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
                <div class="row text-center">
                    <ul class="list-unstyled">
                        <li class="col-xs-12 up-1">
                            <img alt="" src="${pageContext.request.contextPath}/${feature.img}">
                        </li>
                        <li class="up-2 col-xs-12">${feature.feature}</li>
                        <li class="up-3 col-xs-12">${feature.featureDesc}</li>
                    </ul>
                </div>
            </div>
        </c:forEach>

        <div class="col-xs-12 col-sm-6 col-md-6 col-lg-3 text-center">
            <p>
                <img src="${pageContext.request.contextPath}/images/453254312.png">12400<br>
                <span class="up-3">累计在线学习人数</span>
            </p>
            <p>
                <img src="${pageContext.request.contextPath}/images/453254312.png">12400<br>
                <span class="up-3">学员已经找到满意工作</span>
            </p>
        </div>
    </div>

    <!--第二部分开始-->
    <div class="main-b row">
        <h3 class="text-center main-tab">如何学习</h3>
        <ul class="list-unstyled text-center">
            <c:forEach items="${jnshuIntros}" var="intro" >
                <li class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
                    <span class="up-1 text-center">${intro.orderId}</span>
                    <p class="up-2">${intro.introText}</p>
                    <span class="up-3"></span>
                </li>
            </c:forEach>
        </ul>
    </div>

    <!--第三部分开始-->
    <div class="main-c row">
        <h3 class="text-center main-tab">优秀学员展示</h3>
        <ul class="list-unstyled text-center">
            <c:forEach items="${jnshuStuShows}" var="stuShow">
                <li class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
                    <div>
                        <img src="${pageContext.request.contextPath}/${stuShow.img}">
                        <span>${stuShow.counsellor}</span>
                        <p class="text-left">${stuShow.stuDesc}</p>
                    </div>
                </li>
            </c:forEach>
        </ul>
    </div>

    <!--第四部分开始-->
    <div class="row main-bottom">
        <h3 class="text-center">战略合作企业</h3>
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <ul class="logo">
                <li>
                    <a href=""><img src="${pageContext.request.contextPath}/images/123132.png"></a>
                </li>
                <li>
                    <a href=""> <img src="${pageContext.request.contextPath}/images/1549865.png"></a>
                </li>
                <li>
                    <a href=""> <img src="${pageContext.request.contextPath}/images/785345.png"></a>
                </li>
                <li>
                    <a href=""> <img src="${pageContext.request.contextPath}/images/1471.png"></a>
                </li>
                <li>
                    <a href=""> <img src="${pageContext.request.contextPath}/images/7861.png"></a>
                </li>
            </ul>
        </div>
    </div>
</div>

<div class="main-e">
    <h3 class="text-center main-tab ">友情链接</h3>
    <div class="container">
        <ul class="text-justify">
            <li><a href="#">手机软件</a></li>
            <li><a href="#">教师招聘</a></li>
            <li><a href="#">找工作</a></li>
            <li><a href="#">教师招聘</a></li>
            <li><a href="#">找工作</a></li>
            <li><a href="#">手机软件</a></li>
            <li><a href="#">教师招聘</a></li>
            <li><a href="#">手机软件</a></li>
            <li><a href="#">手机软件</a></li>
            <li><a href="#">找工作</a></li>
            <li><a href="#">手机软件</a></li>
            <li><a href="#">教师招聘</a></li>
            <li><a href="#">找工作</a></li>
            <li><a href="#">教师招聘</a></li>
            <li><a href="#">找工作</a></li>
            <li><a href="#">手机软件</a></li>
            <li><a href="#">教师招聘</a></li>
            <li><a href="#">手机软件</a></li>
            <li><a href="#">手机软件</a></li>
            <li><a href="#">找工作</a></li>
        </ul>
    </div>
</div>