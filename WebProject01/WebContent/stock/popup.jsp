<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
			function sendData(){
				opener.open("/WebProject01/view.do?viewpath=../company/company_main.jsp&menupath=../company/company_menu.jsp",
				"dd")
				window.close();
				
			}
		
		</script>
</head>
<!-- <body bgcolor="red"> -->
<h2>��� ����  </h2>
<h4>����̸� : ${param.Stock_name}</h4>

	<form name="checkform" method="post" action="/WebProject01/stock_popup.do">
	����:<input type="text" name="id" value="${param.Stock_name}">
	
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
<form action="javascript:sendData()">
<input type="submit"  value="����������"/><br/>
</form>
</body>
</html>