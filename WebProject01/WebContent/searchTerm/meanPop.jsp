<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
  
    <%@page import="term.dto.MeanDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>

	
	<%/*
			document.getElementById("meandiv").innerHTML = term_mean;
			alert(term_mean);
	*/%>
	

</head>
<body>
	<%
		MeanDTO meandto=(MeanDTO)request.getAttribute("meandto");
	%>
	<div class="container">
		<h3>${term_name}<%=meandto.getTerm_name()%></h3>
		<hr/>
		<div id="meandiv"><%=meandto.getTerm_mean()%></div>
	</div>
</body>
</html>