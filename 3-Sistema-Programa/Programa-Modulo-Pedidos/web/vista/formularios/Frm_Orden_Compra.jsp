<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<title>Principal</title>
	<!-- For Resposive Device -->
	<meta name="viewport" content="width=device-width, initial-scale=1.0">	
	<link rel="stylesheet" href="<%=request.getContextPath()%>/dist/css/bootstrap.min.css">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/dist/css/style.css" >
        <link rel="stylesheet" href="<%=request.getContextPath()%>/dist/css/style_2.css" >
</head>
<body>
    <header>
        <%@ include file="head.jsp" %>
    </header>
    
    <section class="banner">
    	<img src="<%=request.getContextPath()%>/dist/img/fondo1.jpg" alt="">
       
    </section>
	<script type="text/javascript" src="<%=request.getContextPath()%>/dist/js/jquery.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/dist/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/dist/js/responsive_navbar.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/dist/js/navshrink.js"></script>
   
   

     <footer>
       
         <%@include file="footer.jsp" %>        
    </footer>
    
</body>
</html>
