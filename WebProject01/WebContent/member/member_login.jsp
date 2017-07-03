<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<%-- <%
	Cookie[] cookies = request.getCookies();

	String id = "";

	for (int i = 0; i < cookies.length; i++) {
		if (cookies[i].getName().equals("id")) {
			id = cookies[i].getValue();
		}
	}
%>
 --%></head>
<body>
<div class="row">
		<form name="login_frm" action="/WebProject01/login.do" method="post">
				<img src="/WebProject01/images/page_login.gif">
				<br/>
				<img src="/WebProject01/images/login_id.gif"> 
				<input type="text" name="id" size="15" class="grayinput" tabindex=1 style="width: 156;" <%-- value=<%=id%> --%>>
			 	<input type='submit' class = "btn btn-default" border="0" tabindex=2 value="log in">
				<br/>
				<img src="/WebProject01/images/login_pass.gif"> 
				<input type="password" name="pass" size="15" class="grayinput" tabindex='2' style='width: 156;'>
				<a href="/WebProject01/member/member_signup.jsp"><input type="button" name="sign up" size="15" class = "btn btn-default" tabindex='2' style='width: 156;' value="signup"></a> 
					<br/> <br/>
					<div style = "align: rigth;">                         
				<input type="checkbox" name="member_id_save" id="member_id_save" value="T"
					<%-- <%if (id.length() != 0)%> <%="checked"%> --%> />아이디저장
					<br/>
					<br/>
					</div>
					
	</form>
	</div>
</body>
</html>