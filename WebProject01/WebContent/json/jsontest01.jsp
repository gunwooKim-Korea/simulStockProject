<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<script>
		var person = {
				"name" : "김서연",
				"age" : 25,
				"like" : ["자바", "서블릿", "하둡"],
				"addr":{
					"zipcode" : "11-22",
					"addr1" : "인천시",
					"addr2" : "남구"
				},
				"hisotry" :[
					{
						"subject":"java",
						"month":4
					},
					{
						"subject":"linux",
						"month":4
					},
					{
						"subject":"hadoop",
						"month":4
					}
				]
		}
		document.write("<h3>name:" + person.name+"</h3>");
		document.write("<h3>age:" + person.age+"</h3>");
		document.write("<h3>addr:" + person.addr.addr1+"</h3>");
		document.write("<h3>history:" + person.history[1].subject+"</h3>");
		document.write("<h3>history:" + person.history[2].subject+"</h3>");
	</script>
</body>
</html>