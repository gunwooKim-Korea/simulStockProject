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
				alert("���ƾ�")
				window.close();
				
			}
		
		</script>
</head>
<body> 

 <%companyInfoDTO info = (companyInfoDTO) request.getAttribute("info"); %>

<h2>��� ����</h2> 
<table border="">
		
			<tr><td>���ĸ�Ī </td><td><%=info.getCrp_nm()%></td></tr>
			<tr><td>��ǥ�ڸ� </td><td><%=info.getCeo_nm()%></td></tr>
			<tr><td>���α��� </td><td><%=info.getCrp_cls()%></td></tr>
			<tr><td>�ּ� </td><td><%=info.getAdr()%></td></tr>
			<tr><td>Ȩ������ </td><td><%=info.getHm_url()%></td></tr>
			<tr><td>��ȭ��ȣ </td><td><%=info.getPhn_no()%></td></tr>
			<tr><td>�ѽ���ȣ</td><td><%=info.getFax_no()%></td></tr>
		
		
		</table>

	<form name="checkform" method="post" action="/WebProject01/stock_popup.do">
	����:<input type="text" name="val" value="${param.Stock_name}">
	
	
	
<input type="submit" value="�����ϱ�" /><br/>
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
<input type="submit"  value="����������"/><br/>
</form>
</body>
</html>