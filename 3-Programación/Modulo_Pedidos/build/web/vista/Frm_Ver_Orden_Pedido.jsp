<%-- 
    Document   : Frm_Ver_Orden_Pedido
    Created on : 02-dic-2018, 2:18:41
    Author     : Edgar
--%>

<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<title>Nav Bar</title>
	<!-- For Resposive Device -->
	<meta name="viewport" content="width=device-width, initial-scale=1.0">	
	<link rel="stylesheet" href="<%=request.getContextPath()%>/dist/css/bootstrap.min.css">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/dist/css/style.css" >
</head>
<body>
	<header>       	
        <nav >
            <div class="logo-section">              
                <a href="index.html" class="logo">
                        <div class="row logo-caja float-left">
                            <div class="col-sm-8 logo-caja__text">
                                <h4 class="logo__text">PROGRESO S.A.C</h4>
                            </div>
                        </div>
                        
                    </a>
                <button class="hb-button"><i class="fa fa-bars"></i></button>
            </div>
            <ul>
                <li><a href="#">Nosotros</a></li>
                <li><a href="#">Servicios</a></li>
                <li><a href="#">Blog</a></li>
                <li><a href="#">Contacto</a></li>
            </ul>
        </nav>
    </header>
    <section class="banner">
    	<img src="<%=request.getContextPath()%>/dist/img/BannerWithText.png" alt="">
    </section>
	<script type="text/javascript" src="<%=request.getContextPath()%>/dist/js/jquery.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/dist/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/dist/js/responsive_navbar.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/dist/js/navshrink.js"></script>	
</body>
</html>
