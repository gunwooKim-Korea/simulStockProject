<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
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
<style>
/* Add a gray background color and some padding to the footer */
footer {
	background-color: #f2f2f2;
	padding: 25px;
	margin-top: 60px;
}

.carousel-inner img {
	width: 100%; /* Set width to 100% */
	min-height: 200px;
}

.content {
	height: 700px;
}

.menupath{
	background-color: #f2f2f5;
	height: 700px;
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
	<jsp:include page="../top.jsp"></jsp:include>

	<div class="container">

		<div class="row content">
			<div class="col-sm-2 menupath">
				<jsp:include page="${menupath}"></jsp:include>
			</div> 
			<div class="col-sm-9">
				<jsp:include page="${viewpath}"></jsp:include>
			</div>
		</div>


			<hr>
		</div>

		<div class="container text-center">
			<jsp:include page="${footpath}"></jsp:include>
		</div>


		<footer class="container-fluid text-center">
			<p>Footer Text</p>
		</footer>
</body>
</html>
