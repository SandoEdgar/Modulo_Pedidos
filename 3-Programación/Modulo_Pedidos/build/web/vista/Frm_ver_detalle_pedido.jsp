<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Ver Detalle Pedido</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="<%=request.getContextPath()%>/dist/css/estillos/css.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
       <form>
           <h1 align="center">ORDEN DE PEDIDO N° 0000XYZ</h1><br>
           <table>
               <thead>
                  <tr>
                        <th>FECHA DE LLEGADA :</th> <td>07/11/2018</td> <th>AREA SOLICITANTE :</th> <td>Almacen</td><th>ESTADO :</th> <td>Pendiente</td>
                  </tr> 
               </thead>
           </table>
            
               <table>
                   <tr><th>PROVEEDORES :</th> <td>SUMINISTROS</td> <th>DIRECCION :</th> <td>MZ X LT30</td></tr>
               <tr><th>MODO DE PAGO :</th> <td>SUMINISTROS</td> <th>MODO DE PAGO :</th> <td>MZ X LT30</td></tr>
               <tr><th>TIEMPO DE ENTREGA :</th> <td>SUMINISTROS</td> <th>EMAIL :</th> <td>MZ X LT30</td></tr>
               </table>
           
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
                <input type="button" value="imprimir " img src="<%=request.getContextPath()%>/dist/img/recursos/imprimir.jpg" alt=""
                       onclick="Imprmir('<%=request.getContextPath()%>','Servlet',1)"> <!--llama al js-->
            </center>
            <center>
                <input type="button" value="crear orden de compra"
                       onclick="crear('<%=request.getContextPath()%>','Servlet',2)"> <!--llama al js-->
            </center>
            <center>
                <input type="button" value="cerrar"
                       onclick="cerrar('<%=request.getContextPath()%>','Servlet',3)"> <!--llama al js-->
            </center>
       </form>
    </body>
</html>
