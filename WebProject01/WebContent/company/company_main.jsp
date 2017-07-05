<%@page import="company.dto.CompanyDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
		String state = request.getParameter("state");
		ArrayList<CompanyDTO> companylist = (ArrayList<CompanyDTO>) request
				.getAttribute("companylist");
		//int count = 0;
	%> 
<div class="container-fluid">
  
 
<table class="table table-bordered ">
 <% 
		for (int i = 0; i < companylist.size(); i++) {
		CompanyDTO company = companylist.get(i);
						//count++;
	%>
    <thead>
      <tr>
        <th>기업코드</th>
        <th>기업명</th>
        
      </tr>
    </thead>
    <tbody>
      <tr>
        <td><%=company.getStock_cd() %></td>
        <td> <a href="/WebProject01/companydetail.do?stock_id=<%=company.getStock_cd() %>"><%=company.getCrp_nm()%></a>
        </td>
       
      </tr>
     
    </tbody>
    <%
					}
				%>
  </table>
  </div>
</body>
</html>