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
        <link rel="stylesheet" href="<%=request.getContextPath()%>/dist/css/estiloFrmListarCompra.css" >
        
        
</head>
<body>
    <header>
        <%@ include file="head.jsp" %>
    </header>
    
    

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<%=request.getContextPath()%>/css/estiloFrmListarCompra.css" rel="stylesheet" type="text/css"/>
        <title>FrmListaOrdenCompra</title>
    </head>
    <body>
        
         <center>
             <br/>
             <h1>LISTADO DE ORDEN DE COMPRA</h1>
              </center>
           
          <div class="boton">
              <img src="<%=request.getContextPath()%>/dist/img/imagenesListaOrdenCompra/buscar.png" height="15"/>
              <input type="tcxt" name="busqueda" size="18" maxlength="10" placeholder="Numero de compra">
             <input type="button" style="padding:8px 8px 8px 8px ;font-family:verdana; background-color:#3374FF; 
                    color: white; border-radius:10px "    name="boton" value="BUSCAR" >
          </div>
     <img src="<%=request.getContextPath()%>/dist/img/imagenesListaOrdenCompra/buscar.png" height="15"/>
    <div id="main-container">
		<table>
			<thead>
				<tr>
					<th>Numero de compra</th>
                                        <th>Fecha Creada</th>
                                        <th>Empresa Proveedor</th>
                                        <th>Fecha Llegada</th>
                                        <th>Detalle</th>
                                        <th>Estado</th>
                                        <th>Almacen</th>
				</tr>
			</thead>

			<tr>
				<td>001</td>
                                <td>19/10/2018</td>
                                <td>PINTURA REYES SAC</td>
                                <td>22/10/2018</td>
                                <td>
                                   <a href="Frm_Ver_Orden_Compra.jsp">
                                        <button> <img src="<%=request.getContextPath()%>/dist/img/imagenes_OrdenPedido/vista.png" alt="" width="25"> </button>   
                                    </a> 
                                  
                                </td>
                                 <td>  
                                     <select>
                                         <option>Seleccionar</option>
                                         <option>Total</option>
                                         <option>Parcial</option>
                                         <option>En espera</option>
                                         <option>Rechazado</option>
                                     </select>
                                 </td>
                                <td><input type="button" style="padding:6px 6px 6px 6px ;font-family:verdana; background-color:#FFAC33; 
                         border-radius:10px " name="boton" value="ENVIADO" >   </td>
			</tr>
			<tr>
				<td>002</td>
                                <td>19/10/2018</td>
                                <td>DERPAGE SAC</td>
                                <td>21/10/2018</td>
                                <td> 
                                   <a href="Frm_Ver_Orden_Compra.jsp">
                                        <button> <img src="<%=request.getContextPath()%>/dist/img/imagenes_OrdenPedido/vista.png" alt="" width="25"> </button>   
                                    </a> 
                                <td>  
                                      <select>
                                         <option>Seleccionar</option>
                                         <option>Total</option>
                                         <option>Parcial</option>
                                         <option>En espera</option>
                                           <option>Rechazado</option>
                                     </select>
                                </td>
                                <td><input type="button" style="padding:6px 6px 6px 6px ;font-family:verdana; background-color:#52FF33; 
                         border-radius:10px " name="boton" value="ENVIADO" >   </td>
			</tr>
			<tr>
				<td>003</td>
                                <td>21/10/2018</td>
                                <td>DERPAGE SAC</td>
                                <td>24/10/2018</td>
                                <td>  
                                  <a href="Frm_Ver_Orden_Compra.jsp">
                                        <button> <img src="<%=request.getContextPath()%>/dist/img/imagenes_OrdenPedido/vista.png" alt="" width="25"> </button>   
                                    </a> 
                                </td>
                                <td> 
                                      <select>
                                         <option>Seleccionar</option>
                                         <option>Total</option>
                                         <option>Parcial</option>
                                         <option>En espera</option>
                                           <option>Rechazado</option>
                                     </select>
                                </td>
                               <td><input type="button" style="padding:6px 6px 6px 6px ;font-family:verdana; background-color:#52FF33; 
                         border-radius:10px " name="boton" value="ENVIADO" >   </td>
			</tr>
			<tr>
				<td>004</td>
                                <td>23/10/2018</td>
                                <td>DERPAGE SAC</td>
                                <td>28/10/2018</td>
                                <td>  
                                  <a href="Frm_Ver_Orden_Compra.jsp">
                                        <button> <img src="<%=request.getContextPath()%>/dist/img/imagenes_OrdenPedido/vista.png" alt="" width="25"> </button>   
                                    </a> 
                                </td>
                                 <td> 
                                       <select>
                                         <option>Seleccionar</option>
                                         <option>Total</option>
                                         <option>Parcial</option>
                                         <option>En espera</option>
                                           <option>Rechazado</option>
                                     </select>
                                     </td>
                                <td><input type="button" style="padding:6px 6px 6px 6px ;font-family:verdana; background-color:#FF3333; 
                         border-radius:10px " name="boton" value="ENVIADO" >   </td>
			</tr>
                        <tr>
				<td>005</td>
                                <td>15/10/2018</td>
                                <td>DERPAGE SAC</td>
                                <td>19/10/2018</td>
                                <td>   
                                     <a href="Frm_Ver_Orden_Compra.jsp">
                                        <button> <img src="<%=request.getContextPath()%>/dist/img/imagenes_OrdenPedido/vista.png" alt="" width="25"> </button>   
                                    </a> 
                                </td>
                                 <td> 
                                       <select>
                                         <option>Seleccionar</option>
                                         <option>Total</option>
                                         <option>Parcial</option>
                                         <option>En espera</option>
                                           <option>Rechazado</option>
                                     </select>
                                 </td>
                                <td><input type="button" style="padding:6px 6px 6px 6px ;font-family:verdana; background-color:#FF3333; 
                         border-radius:10px " name="boton" value="ENVIADO" >   </td>
			</tr>
		</table>
	</div>
   
    </body>
</html>


     <footer>
       
         <%@include file="footer.jsp" %>        
    </footer>
    
    
        
	<script type="text/javascript" src="<%=request.getContextPath()%>/dist/js/jquery.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/dist/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/dist/js/responsive_navbar.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/dist/js/navshrink.js"></script>
   
   
</body>
</html>
