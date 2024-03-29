<%@ page contentType="text/html;charset=UTF-8" language="java"
         isELIgnored="false" pageEncoding="UTF-8" %>
<html lang="en">
<head>
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <link rel="stylesheet" type="text/css"
          href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    <link rel="stylesheet" href="./css/sign_style.css">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Sign In</title>
</head>
<body>
<div class="container" id="container">
    <jsp:include page="modal_id.jsp"/>
    <jsp:include page="modal_nickname.jsp"/>
    <form method="post" action="/member/signup">
        <div class="form-container sign-up">
            <div class="form">
                <h1>Create Account</h1>
                <div class="social-icons">
                    <a href="https://www.google.co.kr" class="icon"><i class="fa-brands fa-google-plus-g"></i></a>
                    <a href="https://www.facebook.com" class="icon"><i class="fa-brands fa-facebook-f"></i></a>
                    <a href="https://github.com" class="icon"><i class="fa-brands fa-github"></i></a>
                    <a href="https://kr.linkedin.com" class="icon"><i class="fa-brands fa-linkedin-in"></i></a>
                </div>
                <span>or use your email for registration</span>
                <div>
                    <div class="input">
                        <div>
                            <input type="text" name="userId" id="user_id" placeholder="아이디">
                        </div>
                        <div>
                            <button type="button" id="btn-check-id">확인</button>
                        </div>
                    </div>
                    <input type="password" id="user_password" name="userPassword" placeholder="비밀번호">
                    <input type="password" id="user_password2" name="userPassword2" placeholder="비밀번호 확인">
                    <input type="text" name="userName" placeholder="이름">
                    <div class="input">
                        <div>
                            <input type="text" name="userNick" id="user_nick" placeholder="닉네임">
                        </div>
                        <div>
                            <button type="button" id="btn-check-nick">확인</button>
                        </div>
                    </div>
                    <input type="text" name="userMobile" placeholder="전화번호">
                    <button id="btn_sign_up">Sign Up</button>
                </div>
            </div>
        </div>
    </form>
    <form method="post" action="/member/signIn">
        <div class="form-container sign-in">
            <div class="form">
                <h1>Sign In</h1>
                <div class="social-icons">
                    <a href="https://www.google.co.kr" class="icon"><i class="fa-brands fa-google-plus-g"></i></a>
                    <a href="https://www.facebook.com" class="icon"><i class="fa-brands fa-facebook-f"></i></a>
                    <a href="https://github.com" class="icon"><i class="fa-brands fa-github"></i></a>
                    <a href="https://kr.linkedin.com" class="icon"><i class="fa-brands fa-linkedin-in"></i></a>
                </div>
                <span>or use your email password</span>
                <input type="text" name="userId" placeholder="아아디">
                <input type="password" name="userPassword" placeholder="비밀번호">
                <a href="#">Forget Your Password?</a>
                <button id="btn_sign_in">Sign In</button>
            </div>
        </div>
    </form>
    <div class="toggle-container">
        <div class="toggle">
            <div class="toggle-panel toggle-left">
                <h1>Welcome Back!</h1>
                <p>Enter your personal details to use all of site features</p>
                <button class="hidden" id="login">Sign In</button>
            </div>
            <div class="toggle-panel toggle-right">
                <h1>Hello, Friend!</h1>
                <p>Register with your personal details to use all of site features</p>
                <button class="hidden" id="register">Sign Up</button>
            </div>
        </div>

    </div>
</div>
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4="
        crossorigin="anonymous"></script>
<script type="text/javascript" src="./js/sign_style.js"></script>
<script type="text/javascript" src="js/modal_style.js"></script>
<script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
</body>
</html>
