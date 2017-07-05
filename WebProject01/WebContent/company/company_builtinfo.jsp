<%@page import="company.dto.CompanyDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<%
		String state = request.getParameter("state");
		CompanyDTO company = (CompanyDTO) request.getAttribute("company");
		//int count = 0;
	%> 
	
	

	<div class="container">
      
  <table class="table table-bordered">
    <thead>
      <tr>
        <th colspan='2'>개황정보</th>
        
        
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>회사이름</td>
        <td><%=company.getCrp_nm()%></td>
        
      </tr>
      <tr>
        <td>영문명</td>
        <td><%=company.getCrp_nm_e() %></td>
        
      </tr>
      <tr>
        <td>공시회사명</td>
        <td><%=company.getCrp_nm_i() %></td>
       
      </tr>
           <tr>
        <td>종목코드</td>
        <td><%=company.getStock_cd() %></td>
        
      </tr>
      <tr>
        <td>대표자명</td>
        <td><%=company.getCeo_nm() %></td>
        
      </tr>
      <tr>
        <td>법인구분</td>
        <td><%=company.getCrp_cls() %></td>
       
      </tr>
           <tr>
        <td>법인등록번호</td>
        <td><%=company.getCrp_no() %></td>
        
      </tr>
      <tr>
        <td>사업자등록번호</td>
        <td><%=company.getBsn_no() %></td>
        
      </tr>
      <tr>
        <td>주소</td>
        <td><%=company.getAdr() %></td>
       
      </tr>
      
      <tr>
        <td>홈페이지</td>
        <td><%=company.getHm_url() %></td>
        
      </tr>
      <tr>
        <td>IR홈페이지</td>
        <td><%=company.getIr_url()%></td>
       
      </tr>
           <tr>
        <td>전화번호</td>
        <td><%=company.getPhn_no()%></td>
        
      </tr>
      <tr>
        <td>팩스번호</td>
        <td><%=company.getFax_no() %></td>
        
      </tr>
      <tr>
        <td>업종코드</td>
        <td><%=company.getInd_cd() %></td>
       
      </tr>
      <tr>
        <td>설립일</td>
        <td><%=company.getEst_dt() %></td>
       
      </tr>
      <tr>
        <td>결산월</td>
        <td><%=company.getAcc_mt() %></td>
       
      </tr>
	</tbody>
  </table>
</div>

</body>
</html>
