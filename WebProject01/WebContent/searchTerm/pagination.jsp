<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>


  <script type="text/javascript">
	  
	$(document).ready(function(){
		
		$("#previous").on("click",function(){
			alert("누름!");
			$.get("/serverweb/pagination.do",
					{"name":$("#name").val()},
					success_run
					)
		})
		
	})
	
	function success_run(txt){
		$("#checkVal").html(txt);
	}

  
  </script>

</head>
<body>

  <ul class="pagination">
       <% boolean check = true;
       		int pagenum=1;%>
    <li class="page-item disabled">
      <a class="page-link"  id = "previous" name="<%=pagenum %>" onkeyup="runAjax()" tabindex="-1">Previous</a>
    </li>
    
    <% if(check){for( pagenum =1; pagenum<=5;pagenum++){%>
    <li class="page-item">
    	<a class="page-link" href="/WebProject01/termlist.do?page=<%=pagenum %>"><%=pagenum %></a>
    </li>
     <%} }%>
    
    <li class="page-item">
      <a class="page-link" id = "next"  href="/WebProject01/termlist.do?page=<%=pagenum+5 %>">Next</a>
    </li>
    
  </ul>

</body>
</html>