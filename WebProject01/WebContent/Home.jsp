<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<<<<<<< HEAD
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script 
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>

footer {
	background-color: #f2f2f2;
	padding: 25px;
	margin-top: 60px;
}

.carousel-inner img {
	width: 100%; /* Set width to 100% */
	min-height: 200px;
}

/* Hide the carousel text when the screen is less than 600 pixels wide */
@media ( max-width : 600px) {
	.carousel-caption {
		display: none;
	}
}
</style>
</head>
<body>
	<jsp:include page="top.jsp"></jsp:include>
	
	<div class="container">
		<div class="row">
			<div class="col-sm-8">
				<jsp:include page="content.jsp"></jsp:include>
			</div>
			<div class="col-sm-4">
				
				<div>
					<jsp:include page="member/member_login.jsp"></jsp:include> 
				</div>
				<div class="well">
					<jsp:include page="data/datamain.jsp"></jsp:include>
				</div>
			</div>
		</div>
		<hr>
	</div>

	<div class="container text-center">
		<jsp:include page="news/news_main.jsp"></jsp:include>
	</div>

	<div class="container text-center">
		<jsp:include page="team/team_main.jsp"></jsp:include>
	</div>
	<br>

	<footer class="container-fluid text-center">
		<p>Footer Text</p>
	</footer>

</body>
</html>
=======
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>

footer {
	background-color: #f2f2f2;
	padding: 25px;
	margin-top: 60px;
}

.carousel-inner img {
	width: 100%; /* Set width to 100% */
	min-height: 200px;
}

/* Hide the carousel text when the screen is less than 600 pixels wide */
@media ( max-width : 600px) {
	.carousel-caption {
		display: none;
	}
}
</style>
</head>
<body>
	<jsp:include page="top.jsp"></jsp:include>
	
	<div class="container">
		<div class="row">
			<div class="col-sm-8">
				<jsp:include page="content.jsp"></jsp:include>
			</div>
			<div class="col-sm-4">
				
				<div>
					<jsp:include page="member/member_login.jsp"></jsp:include>
				</div>
				<div class="well">
					<jsp:include page="data/datamain.jsp"></jsp:include>
				</div>
			</div>
		</div>
		
		<hr>
	</div>

	<div class="container text-center">
		<jsp:include page="news/news_main.jsp"></jsp:include>
	</div>

	<div class="container text-center">
		<jsp:include page="team/team_main.jsp"></jsp:include>
	</div>
	<br>

	<footer class="container-fluid text-center">
		<p>Footer Text</p>
	</footer>

</body>
</html>
>>>>>>> refs/remotes/origin/songjang1
