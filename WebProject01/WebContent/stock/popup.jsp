<%@page import="stock.dto.companyInfoDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
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
			

			<tr><td><%=info.getCeo_nm()%></td></tr>
			<tr><td><%=info.getCrp_nm_e()%></td></tr>
			<tr><td><%=info.getCrp_nm_i()%></td></tr>
			<tr><td><%=info.getStock_cd()%></td></tr>
			<tr><td><%=info.getCeo_nm()%></td></tr>
			<tr><td><%=info.getCrp_cls()%></td></tr>
			<tr><td><%=info.getCrp_no()%></td></tr>
			<tr><td><%=info.getBsn_no()%></td></tr>
			<tr><td><%=info.getAdr()%></td></tr>
			<tr><td><%=info.getHm_url()%></td></tr>
			<tr><td><%=info.getIr_url()%></td></tr>
			<tr><td><%=info.getPhn_no()%></td></tr>
			<tr><td><%=info.getFax_no()%></td></tr>
			<tr><td><%=info.getInd_cd()%></td></tr>
			<tr><td><%=info.getEst_dt()%></td></tr>	
			<tr><td><%=info.getAcc_mt()%></td></tr>
				
				
				
				
				
				
				


		
		</table>

<h4>����̸� : ${param.Stock_name}</h4>

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