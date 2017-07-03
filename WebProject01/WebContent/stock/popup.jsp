<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
			function showData(zip,addr){
				opener.document.kitri.zipcode.value = zip;
				opener.document.kitri.address.value = addr;
				window.close();
			}
		
		</script>
</head>
<!-- <body bgcolor="red"> -->
<h2>기업 정보  </h2>
<h4>기업이름 : ${param.Stock_name}</h4>

	<hr/>
	<form name="checkform" method="post" action="/WebProject01/stock_popup.do">
	수량:<input type="text" name="id" value="${param.Stock_name}">
	 <%if(request.getAttribute("msg")!=null){ %>
<h5 style="color: red"><%=request.getAttribute("msg")%></h5>
<%} %>
<input type="button" value="투자하기"/><br/>
<input type="button"  value="상세정보보기"/><br/>
<%-- <a href="javascript:showId()"><%=data %></a><br/>
<a href="javascript:sendData()"><%=data %></a><br/>
 <%if(request.getAttribute("msg")!=null){ %>
<h5 style="color: red"><%=request.getAttribute("msg")%></h5>
<%} %>  --%>
</form>
</body>
</html>