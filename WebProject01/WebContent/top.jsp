<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
  <title>serverweb main</title>
  <meta charset="euc-kr">
</head>
<body>
<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="Home.jsp">Logo</a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
			<ul class="nav navbar-nav">
					<li class="active"><a href="Home.jsp">Home</a></li>
					<li><a href="/WebProject01/stock.do?state=kospi">모의투자</a></li>
					<li><a href="/WebProject01/companylist.do?state=company">기업정보</a></li>
					<li><a href="/WebProject01/termlist.do?page=1">용어검색</a></li>
					<li><a href="/WebProject01/view.do?viewpath=../myPage/myPage_userHistory.jsp&menupath=../myPage/myPage_menu.jsp">마이페이지(주식관리)</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#"><span class="glyphicon glyphicon-log-in"></span>
							Login</a></li>
				</ul>
			</div>
		</div>
	</nav>


</body>
</html>