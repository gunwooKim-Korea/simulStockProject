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

	<script type="text/javascript">
	
	function termMean(termId){
		myopen = window.open("/WebProject01/meanPopup.do?termId="+termId,"mywin","width=400,height=600");
	}

</script>
</head> 
<body>

		<% 
		final int TOTALTERM = 1349;
		final int TOTALPAGE = TOTALTERM/15;
		ArrayList<TermDTO> termlist = (ArrayList<TermDTO>)request.getAttribute("termlist");
		int startpage = Integer.parseInt(request.getAttribute("startpage").toString()); 
		//container
	//int	startpage=1;
		%>
		
<div class=" col-sm-12">          


        <br/>
        
        <h2> 용어 검색 </h2>
        
        <br/>
	
      <form class="input-group" action="/WebProject01/termlist.do">
      
        <input type="text" name="search" class="form-control" placeholder="Search">
        <span class="input-group-btn">
          <button class="btn btn-default" type="submit">
            <i class="glyphicon glyphicon-search"></i>
          </button>
        </span>
     

        <br/>
        <br/>
        </form>
        
        <!-- ////////////////////////////////////////////////////////////////////// -->
<form>
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
	 /*   if(size<15){
	    	check = false;
	    }*/
    	for(int i=0;i<size;i++){
    		TermDTO dto = termlist.get(i);%>
    		 <tr>
    	      <td><%=dto.getRownum() %></td>
    	      <td><a href="#" onclick="termMean(<%=dto.getTerm_id()%>)"><%=dto.getTerm_name()%></a></td>
    	      </tr>
<%}%>
    
    </tbody>
  </table>
  
  
  <ul class="pagination">
    <li class="page-item disabled">
  
      <a class="page-link" href="/WebProject01/termlist.do?ck=previous&page=<%=startpage %>" tabindex="-1">Previous</a>
    </li>
    
    <% if(check){for(int i =startpage; i<startpage+5 & i<=TOTALPAGE;i++){%>
    <li class="page-item">
    	<a class="page-link" href="/WebProject01/termlist.do?page=<%=i %>"><%=i %></a>
    </li>
     <%} }%>
    
    <li class="page-item">
      <a class="page-link" href="/WebProject01/termlist.do?ck=next&page=<%=startpage %>">Next</a>
    </li>
    
  </ul>
  
   </form>
</div>


</body>
</html>