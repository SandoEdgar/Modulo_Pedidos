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
        <link href="<%=request.getContextPath()%>/dist/css/css_OrdenPedido/estilo.css" rel="stylesheet" type="text/css"/>
</head>
<body>
    <header>
        <%@ include file="head.jsp" %>
    </header>
    <section class="banner">    
    <center>
             <br/>
             <h1>LISTADO DE ORDEN DE PEDIDO</h1>
              </center>
           
          <div class="boton">
              <img src="<%=request.getContextPath()%>/dist/img/imagenes_OrdenPedido/buscar.png" alt="" height="15"/>
              <input type="tcxt" name="busqueda" size="18" maxlength="5" placeholder="Numero de compra">
             <input type="button"  style="background-color: #33ACFF "    name="boton" value="BUSCAR" >
          </div>              
    <div id="main-container">
		<table>
			<thead>
				<tr>
					<th>Numero de Pedido</th>
                                        <th>Fecha</th>
                                        <th>Responsable</th>
                                        <th>Estado</th>
                                        <th>Detalle</th>
                                        
				</tr>
			</thead>
                                <tr>
				<td>001</td>
                                <td>10/09/2018</td>
                                <td>MAX</td>
                                <td>OBSERVADO</td>
                                <td>
                                    <button>      
                                        <img src="<%=request.getContextPath()%>/dist/img/imagenes_OrdenPedido/vista.png" alt="" width="25"/>
                                    </button>
                                </td>
			</tr>
			<tr>
				<td>002</td>
                                <td>10/07/2018</td>
                                <td>MAX</td>
                                <td>PENDIENTE</td>
                                <td> 
                                  <button> <img src="<%=request.getContextPath()%>/dist/img/imagenes_OrdenPedido/vista.png" alt="" width="25"/></button>
			</tr>
			<tr>
				<td>003</td>
                                <td>10/05/2018</td>
                                <td>MAX</td>
                                <td>PENDIENTE</td>
                                <td>  
                                 <button> <img src="<%=request.getContextPath()%>/dist/img/imagenes_OrdenPedido/vista.png" alt="" width="25"/></button>
                                </td>
			</tr>
			<tr>
				<td>004</td>
                                <td>23/10/2018</td>
                                <td>MAX</td>
                                <td>PENDIENTE</td>
                                <td>  
                                 <button> <img src="<%=request.getContextPath()%>/dist/img/imagenes_OrdenPedido/vista.png" alt="" width="25"/></button>
                                </td>
			</tr>
                        <tr>
				<td>005</td>
                                <td>15/10/2018</td>
                                <td>MAX</td>
                                <td>OBSERVADO</td>
                                <td>   
                                    <button> <img src="<%=request.getContextPath()%>/dist/img/imagenes_OrdenPedido/vista.png" alt="" width="25"/></button>
                                </td>
			</tr>
		</table>
	</div>
     </section>
     <footer>       
         <%@include file="footer.jsp" %>        
    </footer>   
    
    <script type="text/javascript" src="<%=request.getContextPath()%>/dist/js/jquery.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/dist/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/dist/js/responsive_navbar.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/dist/js/navshrink.js"></script>   
    <script type="text/javascript" src="<%=request.getContextPath()%>/dist/js/js_OrdenPedido.js"></script> 
</body>
</html>
