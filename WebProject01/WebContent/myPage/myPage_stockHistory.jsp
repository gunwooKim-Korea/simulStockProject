<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">


</script>
	
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2 class="col-sm-offset-1">보유주식현황</h2>
	</hr>
	<div class = "col-sm-offset-1">
		<table class="table table-bordered ">
			<tr>
				<th>종목</th>
				<th>매수가</th>
				<th>현재가</th>
				<th>등락율</th>
				<th>주식수</th>
				<th>매수날짜</th>
				<th>수량</th>
				<th>매도하기</th>
			</tr>
			<tr>
				<td><%="d" %></td>
				<td>a</td>
				<td>a</td>
				<td>a</td>
				<td>a</td>
				<td>a</td>
				<td><form method = "GET" action = "/WebProject01/sell.do?company_id=006360&mem_id=구매아이디">
				<input type = "text" name = "val" width="7"/></td>
				<td><input type='submit' value='매도하기'> </form>
		
						
				</td>
				
			</tr>
		</table>
	</div>
</body>
</html>