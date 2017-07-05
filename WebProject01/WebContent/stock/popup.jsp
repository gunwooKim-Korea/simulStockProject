<%@page import="stock.dto.companyInfoDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">

table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    padding: 8px;
    text-align: left;
    border-bottom: 1px solid #ddd;
}
</style>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
			function showCom(){
				opener.open("/WebProject01/view.do?viewpath=../company/company_main.jsp&menupath=../company/company_menu.jsp",
				"dd")
				alert("으아아")
				window.close();
				
			}
		
		</script>
</head>
<body> 

 <%companyInfoDTO info = (companyInfoDTO) request.getAttribute("info"); %>

<h2>기업 정보</h2> 
<table border="">
		
			<tr><td>정식명칭 </td><td><%=info.getCrp_nm()%></td></tr>
			<tr><td>대표자명 </td><td><%=info.getCeo_nm()%></td></tr>
			<tr><td>법인구분 </td><td><%=info.getCrp_cls()%></td></tr>
			<tr><td>주소 </td><td><%=info.getAdr()%></td></tr>
			<tr><td>홈페이지 </td><td><%=info.getHm_url()%></td></tr>
			<tr><td>전화번호 </td><td><%=info.getPhn_no()%></td></tr>
			<tr><td>팩스번호</td><td><%=info.getFax_no()%></td></tr>
		
		
		</table>

	<form name="checkform" method="post" action="/WebProject01/stock_popup.do">
	수량:<input type="text" name="val" value="${param.Stock_name}">
	
	
	
<input type="submit" value="투자하기" /><br/>
 <%if(request.getAttribute("msg")!=null){ %>
<h5 style="color: red"><%=request.getAttribute("msg")%></h5>
<%} %>

<%-- <a href="javascript:showId()"><%=data %></a><br/>
<a href="javascript:sendData()"><%=data %></a><br/>
 <%if(request.getAttribute("msg")!=null){ %>
<h5 style="color: red"><%=request.getAttribute("msg")%></h5>
<%} %>  --%>
</form>
<form action="javascript:showCom()">
<input type="submit"  value="상세정보보기"/><br/>
</form>
</body>
</html>