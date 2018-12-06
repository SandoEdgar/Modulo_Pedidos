package org.apache.jsp.vista.formularios;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Frm_005fVer_005fOrden_005fPedido_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/vista/formularios/head.jsp");
    _jspx_dependants.add("/vista/formularios/footer.jsp");
  }

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<title>Principal</title>\r\n");
      out.write("\t<!-- For Resposive Device -->\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\t\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/dist/css/bootstrap.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/dist/css/style.css\" >\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/dist/css/style_2.css\" >\r\n");
      out.write("        <link href=\"");
      out.print(request.getContextPath());
      out.write("/dist/css/css_OrdenPedido/estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <header>\r\n");
      out.write("        ");
      out.write("      \t\n");
      out.write("        <nav >\n");
      out.write("            <div class=\"logo-section\">              \n");
      out.write("                <a href=\"index.html\" class=\"logo\">\n");
      out.write("                        <div class=\"row logo-caja float-left\">\n");
      out.write("                            <div class=\"col-sm-8 logo-caja__text\">                        \n");
      out.write("                                <h4 class=\"logo__text\">PROGRESO S.A.C</h4>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </a>\n");
      out.write("                <button class=\"hb-button\"><i class=\"fa fa-bars\"></i></button>\n");
      out.write("            </div>\n");
      out.write("            <ul>  \n");
      out.write("                 <li><a href=\"#\"> Ver Orden Pedido</a></li>  \n");
      out.write("                 <li><a href=\"#\">Lista Ordenes de Pedidos </a></li>   \n");
      out.write("                 <li><a href=\"#\">Lista Ordenes de Compra</a></li>                 \n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    </header>\r\n");
      out.write("    <center>\r\n");
      out.write("             <br/>\r\n");
      out.write("             <h1>LISTADO DE ORDEN DE PEDIDO</h1>\r\n");
      out.write("              </center>\r\n");
      out.write("           \r\n");
      out.write("          <div class=\"boton\">\r\n");
      out.write("              <img src=\"");
      out.print(request.getContextPath());
      out.write("/dist/img/imagenes_OrdenPedido/buscar.png\" alt=\"\" height=\"15\"/>\r\n");
      out.write("              <input type=\"tcxt\" name=\"busqueda\" size=\"18\" maxlength=\"5\" placeholder=\"Numero de compra\">\r\n");
      out.write("             <input type=\"button\"  style=\"background-color: #33ACFF \"    name=\"boton\" value=\"BUSCAR\" >\r\n");
      out.write("          </div>\r\n");
      out.write("    <div id=\"main-container\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<thead>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>Numero de Pedido</th>\r\n");
      out.write("                                        <th>Fecha</th>\r\n");
      out.write("                                        <th>Responsable</th>\r\n");
      out.write("                                        <th>Estado</th>\r\n");
      out.write("                                        <th>Detalle</th>\r\n");
      out.write("                                        \r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("                                <tr>\r\n");
      out.write("\t\t\t\t<td>001</td>\r\n");
      out.write("                                <td>10/09/2018</td>\r\n");
      out.write("                                <td>MAX</td>\r\n");
      out.write("                                <td>OBSERVADO</td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <button>      \r\n");
      out.write("                                        <img src=\"../dist/img/imagenes_OrdenPedido/vista.png\" alt=\"\" width=\"25\"/>\r\n");
      out.write("                                    </button>\r\n");
      out.write("                                </td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>002</td>\r\n");
      out.write("                                <td>10/07/2018</td>\r\n");
      out.write("                                <td>MAX</td>\r\n");
      out.write("                                <td>PENDIENTE</td>\r\n");
      out.write("                                <td> \r\n");
      out.write("                                  <button> <img src=\"../dist/img/imagenes_OrdenPedido/vista.png\" alt=\"\" width=\"25\"/></button>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>003</td>\r\n");
      out.write("                                <td>10/05/2018</td>\r\n");
      out.write("                                <td>MAX</td>\r\n");
      out.write("                                <td>PENDIENTE</td>\r\n");
      out.write("                                <td>  \r\n");
      out.write("                                 <button> <img src=\"../dist/img/imagenes_OrdenPedido/vista.png\" alt=\"\" width=\"25\"/></button>\r\n");
      out.write("                                </td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>004</td>\r\n");
      out.write("                                <td>23/10/2018</td>\r\n");
      out.write("                                <td>MAX</td>\r\n");
      out.write("                                <td>PENDIENTE</td>\r\n");
      out.write("                                <td>  \r\n");
      out.write("                                 <button> <img src=\"../dist/img/imagenes_OrdenPedido/vista.png\" alt=\"\" width=\"25\"/></button>\r\n");
      out.write("                                </td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("\t\t\t\t<td>005</td>\r\n");
      out.write("                                <td>15/10/2018</td>\r\n");
      out.write("                                <td>MAX</td>\r\n");
      out.write("                                <td>OBSERVADO</td>\r\n");
      out.write("                                <td>   \r\n");
      out.write("                                    <button> <img src=\"../dist/img/imagenes_OrdenPedido/vista.png\" alt=\"\" width=\"25\"/></button>\r\n");
      out.write("                                </td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("     <footer>       \r\n");
      out.write("         ");
      out.write("<div class=\"container-footer-all\">\n");
      out.write("        \n");
      out.write("            <div class=\"container-body\">\n");
      out.write("\n");
      out.write("                <div class=\"colum1\">\n");
      out.write("                    <h1>Mas informacion de la compañia</h1>\n");
      out.write("\n");
      out.write("                    <p> DISTRIBUIDORA Y FERRETERIA PROGRESO s.a.c\n");
      out.write("                        venta de materiales de construccion  \n");
      out.write("                    en general </p>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"colum2\">\n");
      out.write("\n");
      out.write("                    <h1>Redes Sociales</h1>\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <img src=\"");
      out.print(request.getContextPath());
      out.write("/dist/img/facebook.png\">\n");
      out.write("                        <label>Siguenos en Facebook</label>\n");
      out.write("                    </div>\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"colum3\">\n");
      out.write("\n");
      out.write("                    <h1>Informacion Contactos</h1>\n");
      out.write("\n");
      out.write("                    <div class=\"row2\">\n");
      out.write("                        <img src=\"");
      out.print(request.getContextPath());
      out.write("/dist/img/house.png\">\n");
      out.write("                        <label>Av. Imperial 115 Coop.Andahuaylas-Santa Anita \n");
      out.write("                        </label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"row2\">\n");
      out.write("                        <img src=\"");
      out.print(request.getContextPath());
      out.write("/dist/img/smartphone.png\">\n");
      out.write("                        <label>362-170</label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"row2\">\n");
      out.write("                        <img src=\"");
      out.print(request.getContextPath());
      out.write("/dist/img/contact.png\">\n");
      out.write("                         <label>progresp_df@hotmail.com</label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"container-footer\">\n");
      out.write("               <div class=\"footer\">\n");
      out.write("                    <div class=\"copyright\">\n");
      out.write("                        © 2017 Todos los Derechos Reservados | <a href=\"\">MARCIAL LLACTAHUAMAN CH.</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"information\">\n");
      out.write("                        <a href=\"\">Informacion Compañia</a> | <a href=\"\">Privacion y Politica</a> | <a href=\"\">Terminos y Condiciones</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        \r\n");
      out.write("    </footer>   \r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/dist/js/jquery.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/dist/js/responsive_navbar.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/dist/js/navshrink.js\"></script>   \r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/dist/js/js_OrdenPedido.js\"></script> \r\n");
      out.write("</body>\r\n");
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
