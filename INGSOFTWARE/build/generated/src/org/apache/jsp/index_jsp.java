package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>TODO supply a title</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link href=\"estillos/css.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("       <form>\r\n");
      out.write("           <h1 align=\"center\">ORDEN DE PEDIDO N° 0000XYZ</h1><br>\r\n");
      out.write("           <table>\r\n");
      out.write("               <thead>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                        <th>FECHA DE LLEGADA :</th> <td>07/11/2018</td> <th>AREA SOLICITANTE :</th> <td>Almacen</td><th>ESTADO :</th> <td>Pendiente</td>\r\n");
      out.write("                  </tr> \r\n");
      out.write("               </thead>\r\n");
      out.write("           </table>\r\n");
      out.write("            \r\n");
      out.write("               <table>\r\n");
      out.write("                   <tr><th>PROVEEDORES :</th> <td>SUMINISTROS</td> <th>DIRECCION :</th> <td>MZ X LT30</td></tr>\r\n");
      out.write("               <tr><th>MODO DE PAGO :</th> <td>SUMINISTROS</td> <th>MODO DE PAGO :</th> <td>MZ X LT30</td></tr>\r\n");
      out.write("               <tr><th>TIEMPO DE ENTREGA :</th> <td>SUMINISTROS</td> <th>EMAIL :</th> <td>MZ X LT30</td></tr>\r\n");
      out.write("               </table>\r\n");
      out.write("           \r\n");
      out.write("           <hr width=\"100%\" size=\"5\" color=\"white\"/>\r\n");
      out.write("        <div id=\"main-container\">\r\n");
      out.write("            <table>\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>PRODUCTO</th> <th>CANTIDAD</th> <th>PRECIO UNIT</th> <th>PRECIO TOTAL</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>martillos</td><td>5</td><td>7</td><td>35</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>candado</td><td>20</td><td>5</td><td>100</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>cemento sol</td><td>500</td><td>20</td><td>10000</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>martillos</td><td>5</td><td>7</td><td>35</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>candado</td><td>20</td><td>5</td><td>100</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>cemento sol</td><td>500</td><td>20</td><td>10000</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("           <center>\r\n");
      out.write("                <input type=\"button\" value=\"imprimir \" img src=\"recursos/imprimir.jpg\" alt=\"\"\r\n");
      out.write("                       onclick=\"Imprmir('");
      out.print(request.getContextPath());
      out.write("','Servlet',1)\"> <!--llama al js-->\r\n");
      out.write("            </center>\r\n");
      out.write("            <center>\r\n");
      out.write("                <input type=\"button\" value=\"crear orden de compra\"\r\n");
      out.write("                       onclick=\"crear('");
      out.print(request.getContextPath());
      out.write("','Servlet',2)\"> <!--llama al js-->\r\n");
      out.write("            </center>\r\n");
      out.write("            <center>\r\n");
      out.write("                <input type=\"button\" value=\"cerrar\"\r\n");
      out.write("                       onclick=\"cerrar('");
      out.print(request.getContextPath());
      out.write("','Servlet',3)\"> <!--llama al js-->\r\n");
      out.write("            </center>\r\n");
      out.write("       </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
