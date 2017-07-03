<%@page import="stockDTO.stockDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.title:HOVER {
	background-color: #eff9ff;
	text-decoration: underline;
	color: skyblue;
}
</style>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">
	var Stock_name;
	$(document).ready(function() {
		$(".title").on("mouseover", function() {

			$("." + Stock_name).css("display", "block");
			$("#pre" + Stock_name).html("투자하세요");

		});
	});
	$(document).ready(function() {
		$(".title").on("mouseout", function() {

			$("." + Stock_name).css("display", "none");

		});
	});
	$(document).ready(function() {
		$(".title").on("click", function() {

			searchAddress();

		});
	});

	function idSet(str) {
		Stock_name = str;
	}

	function searchAddress() {

		//alert(id)
		myopen = window.open("/WebProject01/stock/popup.jsp?Stock_name="
				+ Stock_name, "mywin", "width=400,height=200");

	}
</script>

</head>
<body>
	<%
		String state = request.getParameter("state");
		ArrayList<stockDTO> stocklist = (ArrayList<stockDTO>) request
				.getAttribute("stocklist");
		int count = 0;
	%>
	<div class="container">

		<h2><%=state%>종목
		</h2>


		<div class="col-sm-10">
			<table class="table table-bordered">

				<tr>
					<th>/</th>
					<th>종목명</th>
					<th>현재가</th>
					<th>전일비</th>
					<th>등락률</th>
					<th>거래량</th>
					<th>매수호가</th>
					<th>매도호가</th>
					<th>시가총액</th>


				</tr>


				<%
					for (int i = 0; i < stocklist.size(); i++) {
						stockDTO dept = stocklist.get(i);
						count++;
				%>

				<tr class="title" onmouseover="idSet('<%=dept.getStock_name()%>')">
					<td><%=count%></td>
					<td><%=dept.getStock_name()%></td>
					<td><%=dept.getCur_price()%></td>
					<td><%=dept.getYesterday()%></td>
					<td><%=dept.getChange_rate()%></td>
					<td><%=dept.getTrade_val()%></td>
					<td><%=dept.getBuy_fav_price()%></td>
					<td><%=dept.getSell_fav_price()%></td>
					<td><%=dept.getSum_price()%></td>
				</tr>
				
				<tr style="display: none;"
					width: 2000px; class="<%=dept.getStock_name()%>">
					
					<td><span id="pre<%=dept.getStock_name()%>"></span></td>

				</tr>

				<%
					}
				%>
			</table>
		</div>
	</div>
</body>
</html>