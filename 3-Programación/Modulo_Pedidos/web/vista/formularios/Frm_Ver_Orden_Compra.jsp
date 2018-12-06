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
        <link href="<%=request.getContextPath()%>/dist/css/style_orden_de_compra1.css" rel="stylesheet" type="text/css"/>
</head>
<body>
    <header>
        <%@ include file="head.jsp" %>
    </header>
    <div class="contenedor-orden">
    <div class="head">
            <div class="pt1">
                <h1>DISTRIBUIDORA Y FERRETERIA<BR>
                PROGRESO S.A.C</h1>
                <h3>Av Los Jazminez Universales #520<br>
                Santa Anita</h3>
                <h3>Telefono: 987654321</h3>
                <h3>Sitio web: <a href="#">www.ferreteriaProgreso.com</a></h3>
                <table class="table" style="background:  wheat;">
                    <tr><td><h3>Proveedor:</h3>
                    <h3>Nombre Empresa: Universal S.A.C</h3>
                    <h3>Contacto o Departamento: Alexandra Rodrigez</h3>
                    <h3>Direccion: Av. Los Girasoles MzU Lt2</h3>
                    <h3>Ciudad: Santa Anita</h3>
                    <h3>Telefono: 987654321</h3>
                    <h3>Email: suministros@contacto.com</h3></td></tr>
                </table>
            </div>
            <div class="pt2">
                <h1 >ORDEN DE COMPRA</h1>
                <h4>#000012</h4>
                <h3>Fecha: 04/11/2018</h3>
                <h3>RUC: 101234569874</h3>
                <br>
                <br>
                <br>
                <table class="table1" style="border:3px solid black;background:  wheat;">
                    <tr style="border:hidden"><td><h3>ENVIE A: </h3>
                    <h3>Departamento/Area: Almacén</h3>
                    <h3>Nombre Empresa: Distribuidora Ferretería y Progreso S.A.C</h3>
                    <h3>Direccion: Av. Los Algarrobos #698</h3>
                    <h3>Ciudad: Santa Anita</h3>
                    <h3>Telefono: 987654321</h3></td></tr>
                </table>
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
            </div>
            <br>
                
        </div>
    <br>
                
    <center>     
       <div id="main-container">
           <br>
           <br>
		<table>
			<thead>
				<tr>
					<th>Item</th>
                                        <th>Producto</th>
                                        <th>Descripcion</th>
                                        <th>Cantidad</th>
                                        <th>Precio unitario</th>
                                        <th>Prec total</th>
				</tr>
                                <tr>
					<th>1</th>
                                        <th>Martillos</th>
                                        <th>-------</th>
                                        <th>5</th>
                                        <th>7.00</th>
                                        <th>35.00</th>
				</tr>
                                 <tr>
					<th>2</th>
                                        <th>Candados</th>
                                        <th>-------</th>
                                        <th>20</th>
                                        <th>5.00</th>
                                        <th>100.00</th>
				</tr>
                                 <tr>
					<th>3</th>
                                        <th>Cementos sol</th>
                                        <th>-------</th>
                                        <th>500</th>
                                        <th>20.00</th>
                                        <th>1000.00</th>
				</tr>
			</thead>
		</table>
	</div>
    </center>
    <div class="head1" style="padding-left:11em; text-align: center;">
        <div class="pt3" style="float: left;font-size: 15px;" >
                <h1>Observaciones</h1>
                <textarea style="width: 30em;  height: 100px; border-color: black;"></textarea><br><br>
                
            </div>
            <div class="pt4" style="float: rigth;font-size: 15px;">
                <h3>Total a pagar:           s/ 10135</h3>
                <h3>Tiempo de entrega:         3 días</h3>
                <h3>Modo de pago:             Contado</h3>
                <h3>Fecha de entrega:          07/11/2018</h3><br><br>
                
            </div>
            <br>
                <br>
                <br>
        </div>
    </div>  
    <input type="button" value="Imprimir" style="background-color: lightgreen;border-color:green;  text-transform: uppercase; text-align: center; width: 8em; height: 3em; margin-left: 500px;margin-bottom: 40px">
	<input type="button" value="Cerrar" style="background-color: lightcoral;border-color:red; text-transform: uppercase; text-align: center; width: 8em;height: 3em;margin-left: 100px">
                <input type="button" value="Exportar" style="background-color: lightblue;border-color:blue; text-transform: uppercase; text-align: center; width: 8em;height: 3em;margin-left: 100px">
     <footer>
       
         <%@include file="footer.jsp" %>        
    </footer>
    <script type="text/javascript" src="<%=request.getContextPath()%>/dist/js/jquery.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/dist/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/dist/js/responsive_navbar.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/dist/js/navshrink.js"></script>
   
   

    
</body>
</html>

