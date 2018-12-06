package org.apache.jsp.vista.formularios;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Frm_005fLista_005fOrden_005fPedido_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<title>Principal</title>\n");
      out.write("\t<!-- For Resposive Device -->\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\t\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/dist/css/bootstrap.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/dist/css/style.css\" >\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/dist/css/style_2.css\" >\n");
      out.write("        <link href=\"");
      out.print(request.getContextPath());
      out.write("/dist/css/css_OrdenPedido/estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        ");
      out.write("      \t\n");
      out.write("        <nav >\n");
      out.write("            <div class=\"logo-section\">              \n");
      out.write("                <a href=\"#\" class=\"logo\">\n");
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
      out.write("                    <li><a href=\"Frm_Lista_Orden_Pedido.jsp\">Lista Ordenes de Pedidos </a></li>\n");
      out.write("                    <li><a href=\"Frm_Ver_Orden_Pedido.jsp\"> Ver Orden Pedido</a></li>                      \n");
      out.write("                    <li><a href=\"Frm_Lista_Orden_Compra.jsp\">Lista Ordenes de Compra</a></li>                 \n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("    ");
      out.write("\n");
      out.write("    </header>\n");
      out.write("    <section class=\"banner\">    \n");
      out.write("    <center>\n");
      out.write("             <br/>\n");
      out.write("             <h1>LISTADO DE ORDEN DE PEDIDO</h1>\n");
      out.write("              </center>\n");
      out.write("           \n");
      out.write("          <div class=\"boton\">\n");
      out.write("              <img src=\"");
      out.print(request.getContextPath());
      out.write("/dist/img/imagenes_OrdenPedido/buscar.png\" alt=\"\" height=\"15\"/>\n");
      out.write("              <input type=\"tcxt\" name=\"busqueda\" size=\"18\" maxlength=\"5\" placeholder=\"Numero de compra\">\n");
      out.write("             <input type=\"button\"  style=\"background-color: #33ACFF \"    name=\"boton\" value=\"BUSCAR\" >\n");
      out.write("          </div>              \n");
      out.write("    <div id=\"main-container\">\n");
      out.write("\t\t<table>\n");
      out.write("\t\t\t<thead>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th>Numero de Pedido</th>\n");
      out.write("                                        <th>Fecha</th>\n");
      out.write("                                        <th>Responsable</th>\n");
      out.write("                                        <th>Estado</th>\n");
      out.write("                                        <th>Detalle</th>\n");
      out.write("                                        \n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</thead>\n");
      out.write("                                <tr>\n");
      out.write("\t\t\t\t<td>001</td>\n");
      out.write("                                <td>10/09/2018</td>\n");
      out.write("                                <td>MAX</td>\n");
      out.write("                                <td>OBSERVADO</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <button>      \n");
      out.write("                                        <img src=\"");
      out.print(request.getContextPath());
      out.write("/dist/img/imagenes_OrdenPedido/vista.png\" alt=\"\" width=\"25\"/>\n");
      out.write("                                    </button>\n");
      out.write("                                </td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>002</td>\n");
      out.write("                                <td>10/07/2018</td>\n");
      out.write("                                <td>MAX</td>\n");
      out.write("                                <td>PENDIENTE</td>\n");
      out.write("                                <td> \n");
      out.write("                                  <button> <img src=\"");
      out.print(request.getContextPath());
      out.write("/dist/img/imagenes_OrdenPedido/vista.png\" alt=\"\" width=\"25\"/></button>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>003</td>\n");
      out.write("                                <td>10/05/2018</td>\n");
      out.write("                                <td>MAX</td>\n");
      out.write("                                <td>PENDIENTE</td>\n");
      out.write("                                <td>  \n");
      out.write("                                 <button> <img src=\"");
      out.print(request.getContextPath());
      out.write("/dist/img/imagenes_OrdenPedido/vista.png\" alt=\"\" width=\"25\"/></button>\n");
      out.write("                                </td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>004</td>\n");
      out.write("                                <td>23/10/2018</td>\n");
      out.write("                                <td>MAX</td>\n");
      out.write("                                <td>PENDIENTE</td>\n");
      out.write("                                <td>  \n");
      out.write("                                 <button> <img src=\"");
      out.print(request.getContextPath());
      out.write("/dist/img/imagenes_OrdenPedido/vista.png\" alt=\"\" width=\"25\"/></button>\n");
      out.write("                                </td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("                        <tr>\n");
      out.write("\t\t\t\t<td>005</td>\n");
      out.write("                                <td>15/10/2018</td>\n");
      out.write("                                <td>MAX</td>\n");
      out.write("                                <td>OBSERVADO</td>\n");
      out.write("                                <td>   \n");
      out.write("                                    <a href=\"\" <img src=\"");
      out.print(request.getContextPath());
      out.write("/dist/img/imagenes_OrdenPedido/vista.png\" alt=\"\" width=\"25\"/></a>\n");
      out.write("                                </td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
      out.write("     </section>\n");
      out.write("     <footer>       \n");
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
      out.write("        \n");
      out.write("    </footer>   \n");
      out.write("    \n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/dist/js/jquery.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/dist/js/bootstrap.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/dist/js/responsive_navbar.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/dist/js/navshrink.js\"></script>   \n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/dist/js/js_OrdenPedido.js\"></script> \n");
      out.write("</body>\n");
      out.write("</html>\n");
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
