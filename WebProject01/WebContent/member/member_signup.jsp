<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script><style>

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
<form action="WebProject01/signup.do?id">
  <div class="form-group col-sm-4 col-sm-offset-4">
    <label for="exampleInputEmail1">ID</label>
    <input type="email" class="form-control" id="email" placeholder="Email">
  </div>
  <div class="form-group col-sm-4 col-sm-offset-4">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" id="pass" placeholder="Password">
  </div>
  <div class="form-group col-sm-4 col-sm-offset-4">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control" id="email" placeholder="Email">
  </div>
  <div class="form-group col-sm-4 col-sm-offset-4">
    <label for="exampleInputEmail1">Point</label>
    <input type="text" class="form-control" id="point" placeholder="Email">
  </div>
  <button type="submit" class="btn btn-default col-sm-4 col-sm-offset-4">Submit</button>
</form>
</body>
</html>
