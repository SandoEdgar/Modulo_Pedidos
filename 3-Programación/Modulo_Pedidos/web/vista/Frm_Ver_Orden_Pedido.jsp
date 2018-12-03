<%-- 
    Document   : Frm_Ver_Orden_Pedido
    Created on : 02-dic-2018, 2:18:41
    Author     : Edgar
--%>

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
                 <li><a href="#"> Ver Orden Pedido</a></li>  
                 <li><a href="#">Lista Ordenes de Pedidos </a></li>   
                 <li><a href="#">Lista Ordenes de Compra</a></li>                 
            </ul>
        </nav>
    </header>
    <section class="banner">
    	<img src="<%=request.getContextPath()%>/dist/img/fondo1.jpg" alt="">
       
    </section>
	<script type="text/javascript" src="<%=request.getContextPath()%>/dist/js/jquery.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/dist/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/dist/js/responsive_navbar.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/dist/js/navshrink.js"></script>
   
   

     <footer>
       
       <div class="container-footer-all">
        
            <div class="container-body">

                <div class="colum1">
                    <h1>Mas informacion de la compañia</h1>

                    <p> DISTRIBUIDORA Y FERRETERIA PROGRESO s.a.c
                        venta de materiales de construccion  
                    en general </p>

                </div>

                <div class="colum2">

                    <h1>Redes Sociales</h1>

                    <div class="row">
                        <img src="<%=request.getContextPath()%>/dist/img/facebook.png">
                        <label>Siguenos en Facebook</label>
                    </div>
                  
                </div>

                <div class="colum3">

                    <h1>Informacion Contactos</h1>

                    <div class="row2">
                        <img src="<%=request.getContextPath()%>/dist/img/house.png">
                        <label>Av. Imperial 115 Coop.Andahuaylas-Santa Anita 
                        </label>
                    </div>

                    <div class="row2">
                        <img src="<%=request.getContextPath()%>/dist/img/smartphone.png">
                        <label>362-170</label>
                    </div>

                    <div class="row2">
                        <img src="<%=request.getContextPath()%>/dist/img/contact.png">
                         <label>progresp_df@hotmail.com</label>
                    </div>

                </div>

            </div>
        
        </div>
        
        <div class="container-footer">
               <div class="footer">
                    <div class="copyright">
                        © 2017 Todos los Derechos Reservados | <a href="">MARCIAL LLACTAHUAMAN CH.</a>
                    </div>

                    <div class="information">
                        <a href="">Informacion Compañia</a> | <a href="">Privacion y Politica</a> | <a href="">Terminos y Condiciones</a>
                    </div>
                </div>

            </div>
        
    </footer>
    
</body>
</html>
