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
        <th colspan='2'>��Ȳ����</th>
        
        
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>ȸ���̸�</td>
        <td><%=company.getCrp_nm()%></td>
        
      </tr>
      <tr>
        <td>������</td>
        <td><%=company.getCrp_nm_e() %></td>
        
      </tr>
      <tr>
        <td>����ȸ���</td>
        <td><%=company.getCrp_nm_i() %></td>
       
      </tr>
           <tr>
        <td>�����ڵ�</td>
        <td><%=company.getStock_cd() %></td>
        
      </tr>
      <tr>
        <td>��ǥ�ڸ�</td>
        <td><%=company.getCeo_nm() %></td>
        
      </tr>
      <tr>
        <td>���α���</td>
        <td><%=company.getCrp_cls() %></td>
       
      </tr>
           <tr>
        <td>���ε�Ϲ�ȣ</td>
        <td><%=company.getCrp_no() %></td>
        
      </tr>
      <tr>
        <td>����ڵ�Ϲ�ȣ</td>
        <td><%=company.getBsn_no() %></td>
        
      </tr>
      <tr>
        <td>�ּ�</td>
        <td><%=company.getAdr() %></td>
       
      </tr>
      
      <tr>
        <td>Ȩ������</td>
        <td><%=company.getHm_url() %></td>
        
      </tr>
      <tr>
        <td>IRȨ������</td>
        <td><%=company.getIr_url()%></td>
       
      </tr>
           <tr>
        <td>��ȭ��ȣ</td>
        <td><%=company.getPhn_no()%></td>
        
      </tr>
      <tr>
        <td>�ѽ���ȣ</td>
        <td><%=company.getFax_no() %></td>
        
      </tr>
      <tr>
        <td>�����ڵ�</td>
        <td><%=company.getInd_cd() %></td>
       
      </tr>
      <tr>
        <td>������</td>
        <td><%=company.getEst_dt() %></td>
       
      </tr>
      <tr>
        <td>����</td>
        <td><%=company.getAcc_mt() %></td>
       
      </tr>
	</tbody>
  </table>
</div>

</body>
</html>
