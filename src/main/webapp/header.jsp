<%@ page contentType="text/html;charset=UTF-8"
				 language="java" isELIgnored="false" %>
<html>
<head>

	<title>Title</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
				integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
	<link rel="stylesheet" href="../css/header.css">
</head>
<body>
<div class="cont">
	<div class="container">
		<div class="header">
			<div class="header-nav me-4">
				<a class="me-3" href="../index">Logo</a>
				<a class="me-1" href="">공지사항</a>
				<a class="me-1" href="">커뮤니티</a>
				<a href="">자격증</a>
			</div>
			<%
				if (session.getAttribute("member") == null) {
			%>
			<div class="login_nav d-flex">
				<a class="me-3" href=""><img src="../images/Vector.svg"></a>
				<a class="me-2" href="../sign_in">sign_in</a>
				<button class="sign-up"><a class="me-2" href="../sign_in">sign_up</a></button>
			</div>
			<%
			} else {
			%>
			<div class="login_nav d-flex">
				<a class="me-3" href=""><img src="../images/Vector.svg"></a>
				<button class="sign-up"><a class="me-2" href="../member/my_page_update"><i class="fa-solid fa-user"
																																									 style="color: white;"></i></a>
				</button>
			</div>
			<%
				}
			%>
		</div>
	</div>
</div>
</body>
</html>
