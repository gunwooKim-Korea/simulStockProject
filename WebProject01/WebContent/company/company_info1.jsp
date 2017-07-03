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

<div class="container">
  
  <ul class="nav nav-tabs">
    <li class="active"><a data-toggle="tab" href="#home">기업정보</a></li>
    
    <li><a data-toggle="tab" href="#menu2">주가정보</a></li>
    <li><a data-toggle="tab" href="#menu3">공시정보</a></li>
    <li><a data-toggle="tab" href="#menu4">관련기사</a></li>
  </ul>

  <div class="tab-content">
    <div id="home" class="tab-pane fade in active">
      <%@ include file="company_builtinfo.jsp" %>
    </div>
    
    <div id="menu2" class="tab-pane fade">
      <%@ include file="company_stockinfo.jsp" %>
    </div>
    <div id="menu3" class="tab-pane fade">
      <%@ include file="company_capitalinfo.jsp" %>
    </div>
    <div id="menu4" class="tab-pane fade">
      <h2>관련기사</h2>
      <%@ include file="company_capitalinfo.jsp" %>
    </div>
  </div>
</div>

</body>
</html>