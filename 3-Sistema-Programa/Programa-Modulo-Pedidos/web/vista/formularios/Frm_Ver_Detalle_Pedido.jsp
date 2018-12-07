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
        <link href="<%=request.getContextPath()%>/dist/css/css.css" rel="stylesheet" type="text/css"/>
</head>
<body>
    <header>
        <%@ include file="head.jsp" %>
    </header>            
                 <!--   <div class="pt1">
                        <h1>ORDEN DE PEDIDO N° 0000XYZ</h1>
                        <h3>FECHA DE LLEGADA :07/11/2018</h3>               
                        <h3>Nombre Empresa: Universal S.A.C</h3>
                        <h3>ESTADO :Pendiente</h3>
                        <h3>AREA SOLICITANTE :Almacen</h3>
                        <h3>PROVEEDORES: Suministros</h3>
                        <h3>DIRECCIÓN: Av Los Jazminez Universales #520<br>
                        Santa Anita</h3>
                        <h3>MODO DE PAGO : Contado</h3>
                        <h3>Telefono: 987654321</h3>
                        <h3>TIEMPO DE ENTREGA :3 días</h3>>
                        <h3>EMAIL : Laentregarapida@gmail.com</h3>
                    </div>       -->              
           
           <hr width="100%" size="5" color="white"/>
        <div id="main-container">
            <table>
                <thead>
                    <tr>
                        <th>PRODUCTO</th> <th>CANTIDAD</th> <th>PRECIO UNIT</th> <th>PRECIO TOTAL</th>
                    </tr>
                </thead>
                <tr>
                    <td>martillos</td><td>5</td><td>7</td><td>35</td>
                </tr>
                <tr>
                    <td>candado</td><td>20</td><td>5</td><td>100</td>
                </tr>
                <tr>
                    <td>cemento sol</td><td>500</td><td>20</td><td>10000</td>
                </tr>
                <tr>
                    <td>martillos</td><td>5</td><td>7</td><td>35</td>
                </tr>
                <tr>
                    <td>candado</td><td>20</td><td>5</td><td>100</td>
                </tr>
                <tr>
                    <td>cemento sol</td><td>500</td><td>20</td><td>10000</td>
                </tr>
            </table>
        </div>
           <center>
                <input type="button" value="imprimir " img src="recursos/imprimir.jpg" alt=""
                       > <!--llama al js-->
            </center>
            <center>
                <input type="button" value="crear orden de compra"
                       > <!--llama al js-->
            </center>
            <center>
                <input type="button" value="cerrar"
                       > <!--llama al js-->
            </center>
       
	<script type="text/javascript" src="<%=request.getContextPath()%>/dist/js/jquery.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/dist/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/dist/js/responsive_navbar.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/dist/js/navshrink.js"></script>
   
   

     <footer>
       
         <%@include file="footer.jsp" %>        
    </footer>
    
</body>
</html>
