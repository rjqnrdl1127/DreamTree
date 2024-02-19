<%@ page contentType="text/html;charset=UTF-8" language="java"
         isELIgnored="false" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="./css/modal.css">
    <title>Title</title>
</head>
<body>
<div id="modal-id" class="modal">
    <div class="modal-body">
        <div class="modal-title">
            <h2>아이디 중복 확인</h2>
        </div>
        <div class="modal-content">
            <p>아이디는 영문(소문자), 숫자로 4~16자 이내로 입력해 주세요</p>
            <input type="text" id="modal-check-id" required>
            <button id="modal-btn-check-id">확인</button>
        </div>
    </div>
</div>
</body>
</html>