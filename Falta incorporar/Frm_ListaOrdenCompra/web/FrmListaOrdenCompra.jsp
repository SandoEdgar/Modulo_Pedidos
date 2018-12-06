

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
              <img src="imagenesListaOrdenCompra/buscar.png" height="15"/>
              <input type="tcxt" name="busqueda" size="18" maxlength="10" placeholder="Numero de compra">
             <input type="button" style="padding:8px 8px 8px 8px ;font-family:verdana; background-color:#3374FF; 
                    color: white; border-radius:10px "    name="boton" value="BUSCAR" >
          </div>
     <img src="imagenesListaOrdenCompra/buscar.png" height="15"/>
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
                                    <button><img src="imagenesListaOrdenCompra/vista.png" width="25"/></button>
                                  
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
                                  <button><img src="imagenesListaOrdenCompra/vista.png" width="25"/></button>
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
                                 <button><img src="imagenesListaOrdenCompra/vista.png" width="25"/></button>
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
                                 <button><img src="imagenesListaOrdenCompra/vista.png" width="25"/></button>
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
                                    <button><img src="imagenesListaOrdenCompra/vista.png"  width="25"/></button>
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
