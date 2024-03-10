<%--
  Created by IntelliJ IDEA.
  User: iseongmin
  Date: 3/9/24
  Time: 2:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link rel="stylesheet" href="css/index_style.css">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Dream Tree</title>
</head>
<body>
<jsp:include page="header.jsp"/>

<div class="container">
    <div class="banner">
        <div class="banner-word">
            <p>DreamTree</p>
            <p>많은 사람들의 꿈과 희망이 거름이 되어 자라나는 나무</p>
        </div>
        <img id="banner-png" src="../images/mr-great-heart-NUbEq0B15zU-unsplash.jpg" alt="배너 사진">
    </div>
</div>

<div class="banner-nav container text-center">

    <button  type="button" class="btn1 btn-primary">인기 자격증</button>

    <button  type="button" class="btn1 btn-primary">추천 자격증</button>

    <button  type="button" class="btn1 btn-primary">합격 후기</button>

    <button  type="button" class="btn1 btn-primary">시험 일정</button>

</div>
<div class="menu container">
    <div class="none"></div>

    <div class="menu-group container">
        <div class="notice ">
            <div class="certificate">
                <p>자격증시험</p>
            </div>
            <div class="certificate">
                <text>자격증시험</text>
            </div>
            <div class="certificate">
                <text>자격증시험</text>
            </div>
        </div>

        <div class="content">
            <div class="hot-title">
                <a href="https://www.youtube.com/" class="title">인기글 제목</a>
            </div>
            <div class="hot-title">
                <a href="https://www.youtube.com/" class="title">인기글 제목</a>
            </div>
            <div class="hot-title">
                <a href="https://www.youtube.com/" class="title">인기글 제목</a>
            </div>
            <div class="hot-title">
                <a href="https://www.youtube.com/" class="title">인기글 제목</a>
            </div>
            <div class="hot-title">
                <a href="https://www.youtube.com/" class="title">인기글 제목</a>
            </div>
            <div class="hot-title">
                <a href="https://www.youtube.com/" class="title">인기글 제목</a>
            </div>
        </div>

        <div class="certificate-date ">
            <div class="href-a">
                <a href="http://www.naver.com" class="cer">공지 사항</a>
            </div>
            <div class="href-a">
                <a href="http://www.naver.com" class="cer">공지 사항</a>
            </div>
            <div class="href-a">
                <a href="http://www.naver.com" class="cer">공지 사항</a>
            </div>
        </div>
    </div>
</div>

<div class="passing-review">
    <div class="passing container">
        <div class="p1">
            <img src="../images/Amuimg.jpg" id="img1">
        </div>

        <div class="as">
            <text id="txt">닉네임 : </text>
            <textbox id="txt1">이호석멍청한사람입니다.</textbox>
            <textbox id="txt2">정보처리기능사</textbox>
        </div>
        <div class="as1">
            <text id="cont">제목 : </text>
            <textbox id="cont2">제목내용들어갈 내용입니다.<br>제목 내용들어갈 내용이다 <br>제목 내용들어갈 내용이다</textbox>
        </div>
        <div class="as2">
            <text>날짜들어갈 예정</text>
        </div>
    </div>

    <button type="button" class="btnimg"><img src="../images/arrow.svg"> </button>
    <button type="button" class="btnimg2"><img src="../images/arrow.svg"> </button>

    <div class="passing2 container">
        <div class="p1">
            <img src="../images/yoikitencai.jpg" id="img2">
        </div>

        <div class="as">
            <text id="txt">닉네임 : </text>
            <textbox id="txt1">両面宿儺</textbox>
            <textbox id="txt2">영역전개 : 伏魔御廚子</textbox>
        </div>
        <div class="as1">
            <text id="cont">제목 : </text>
            <textbox id="cont2">"좋은 기회니까 친히 가르쳐주지. 진짜 주술이라는 것을 말이야."</textbox>
        </div>
        <div class="as2">
            <text>너희들이야말로 어째서 그렇게나 약한 주제에 삶에 집착하는거지? 쿡 찌르면 죽어버리는 약해빠진 생물이 오래오래 행복하게 살고 싶다느니 하는 말을 입에 담다니. 네놈들은 그저 분수에 맞게 평생 불행을 곱씹으면 그만인 거다.</text>
        </div>
    </div>

</div>
<div class="calendar">
    <div class="calendarBox">
        <div id="month"></div>
        <div id="calendar"></div>
    </div>
</div>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
<script type="text/javascript" src="js/index_javascript.js"></script>
</body>
<footer>
    <div class="name container">
        <div class="name1">
            <text>@반반무</text>
        </div>
        <div class="name1">
            <text>Tel | 010-4895-6519</text>
        </div>
        <div class="name1">
            <text>Email | KingChan@naver.com</text>
        </div>

    </div>
</footer>
</html>
