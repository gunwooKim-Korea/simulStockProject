<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<h3 style="margin-bottom: 30px">  myPage</h3>
	<div class="list-group">
		<a href="/WebProject01/view.do?viewpath=../myPage/myPage_userHistory.jsp&menupath=../myPage/myPage_menu.jsp" class="list-group-item">이용현황</a>
		<a href="/WebProject01/view.do?viewpath=../myPage/myPage_stockHistory.jsp&menupath=../myPage/myPage_menu.jsp" class="list-group-item">보유주식현황</a> 
		<a href="#" class="list-group-item">개인정보수정</a> 
		<a href="#" class="list-group-item">결제하기</a>
	</div>
	<div class="container"></div>

</body>
</html>