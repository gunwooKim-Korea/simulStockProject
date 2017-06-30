<%@page import="javafx.scene.control.Alert"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
	<%@page import="term.dto.TermDTO"%>
<%@page import="java.util.ArrayList,term.dto.*,term.dto.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<title>Insert title here</title>
</head>
<body>

<% 
		final int TERMTOTAL = 1349;
		ArrayList<TermDTO> termlist = (ArrayList<TermDTO>)request.getAttribute("termlist");
		
		%>


<div class="container">          
  <table class="table table-bordered">
    <thead>
      <tr>
        <th>번호</th>
        <th>용어</th>
      </tr>
    </thead>
    <tbody>
    
    <%
    	int size = termlist.size();
    	boolean check = true;
	    if(size<15){
	    	check = false;
	    }
    	for(int i=0;i<size;i++){
    		TermDTO dto = termlist.get(i);%>
    		 <tr>
    	        <td><%=dto.getTerm_id() %></td>
    	        <td><a href="#"><%=dto.getTerm_name()%></a></td>
    	      </tr>
<%}%>
    
    </tbody>
  </table>
  
  	<ul class="pagination">
  	<% if(check){for(int i =1; i<10;i++){%>
	  <li><a href="/WebProject01/termlist.do?page=<%=i %>"><%=i %></a></li>
	   <%} }%>
		</ul> 
  
</div>

</body>
</html>