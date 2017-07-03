<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<div class="row">		
	
		<jsp:include page="search.jsp"></jsp:include>
		<br/>
		<jsp:include page="${listpath}"></jsp:include>
		
	
	
		<%/*
			<div class="col-sm-8">
				<jsp:include page="${leftpath}"></jsp:include>
			</div>
			
			
			<div class="col-sm-4">
					<jsp:include page="${rightpath}"></jsp:include> 
				</div>
				*/ %>
		</div>
		

</body>
</html>