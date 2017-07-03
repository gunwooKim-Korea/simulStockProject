<%@page import="javafx.scene.control.Alert"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
	<%@page import="term.dto.TermDTO"%>
<%@page import="java.util.ArrayList,term.dto.*,term.dto.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">

	function termMean(termId){
		myopen = window.open("/WebProject01/meanPopup.do?termId="+termId,"mywin","width=400,height=600");
	}


</script>

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
		//container
		%>


<div class=" col-sm-12">          
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
    	        <td><a href="#" onclick="termMean(<%=dto.getTerm_id() %>)"><%=dto.getTerm_name()%></a></td>
    	      </tr>
<%}%>
    
    </tbody>
  </table>
  
  	<ul class="pagination">
  	<% if(check){for(int i =1; i<10;i++){%>
	  <li><a href="/WebProject01/termlist.do?page=<%=i %>"><%=i %></a></li>
	   <%} }%>
		</ul> 
  
  <ul class="pagination">
    <li class="disabled"><a href="#!"><i class="material-icons">chevron_left</i></a></li>
    <li class="active"><a href="#!">1</a></li>
    <li class="waves-effect"><a href="#!">2</a></li>
    <li class="waves-effect"><a href="#!">3</a></li>
    <li class="waves-effect"><a href="#!">4</a></li>
    <li class="waves-effect"><a href="#!">5</a></li>
    <li class="waves-effect"><a href="#!"><i class="material-icons">chevron_right</i></a></li>
  </ul>
            
  
  
</div>

</body>
</html>