<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
	var deptlist = '{"dept":' + 
		  '[{"code" : "001", "name":"정보시스템팀","loc":"4층","tel":"02-770-1111"},' + 
			'{"code" : "002", "name":"정보팀","loc":"5층","tel":"02-770-1111"},'+
			'{"code" : "003", "name":"보안팀","loc":"6층","tel":"02-770-1111"},'+
			'{"code" : "004", "name":"총무팀","loc":"7층","tel":"02-770-1111"}]}';
		
			var obj = JSON.parse(deptlist)
			mydata = obj.dept[3].code
			alert(mydata)
		
</script>
</body>
</html>