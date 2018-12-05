package org.apache.jsp.vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Frm_005fOrden_005fde_005fcompra_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"");
      out.print(request.getContextPath());
      out.write("/dist/css/style_orden_de_compra1.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Orden de Compra</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("        \n");
      out.write("        <div class=\"head\">\n");
      out.write("            <div class=\"pt1\">\n");
      out.write("                <h1>DISTRIBUIDORA Y FERRETERIA<BR>\n");
      out.write("                PROGRESO S.A.C</h1>\n");
      out.write("                <h3>Av Los Jazminez Universales #520<br>\n");
      out.write("                Santa Anita</h3>\n");
      out.write("                <h3>Telefono: 987654321</h3>\n");
      out.write("                <h3>Sitio web: <a href=\"#\">www.nuestraferreteria.com</a></h3>\n");
      out.write("                <table class=\"table\" style=\"background:  wheat;\">\n");
      out.write("                    <tr><td><h3>Proveedor:</h3>\n");
      out.write("                    <h3>Nombre Empresa: Universal S.A.C</h3>\n");
      out.write("                    <h3>Contacto o Departamento: Alexandra Rodrigez</h3>\n");
      out.write("                    <h3>Direccion: Av. Los Girasoles MzU Lt2</h3>\n");
      out.write("                    <h3>Ciudad: Santa Anita</h3>\n");
      out.write("                    <h3>Telefono: 987654321</h3>\n");
      out.write("                    <h3>Email: suministros@contacto.com</h3></td></tr>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"pt2\">\n");
      out.write("                <h1 >ORDEN DE COMPRA</h1>\n");
      out.write("                <h4>#000012</h4>\n");
      out.write("                <h3>Fecha: 04/11/2018</h3>\n");
      out.write("                <h3>RUC: 101234569874</h3>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <table class=\"table1\" style=\"border:3px solid black;background:  wheat;\">\n");
      out.write("                    <tr style=\"border:hidden\"><td><h3>ENVIE A: </h3>\n");
      out.write("                    <h3>Departamento/Area: Almacén</h3>\n");
      out.write("                    <h3>Nombre Empresa: Distribuidora Ferretería y Progreso S.A.C</h3>\n");
      out.write("                    <h3>Direccion: Av. Los Algarrobos #698</h3>\n");
      out.write("                    <h3>Ciudad: Santa Anita</h3>\n");
      out.write("                    <h3>Telefono: 987654321</h3></td></tr>\n");
      out.write("                </table>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("                \n");
      out.write("        </div>\n");
      out.write("    <br>\n");
      out.write("                \n");
      out.write("    <center>     \n");
      out.write("       <div id=\"main-container\">\n");
      out.write("           <br>\n");
      out.write("           <br>\n");
      out.write("\t\t<table>\n");
      out.write("\t\t\t<thead>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th>Item</th>\n");
      out.write("                                        <th>Producto</th>\n");
      out.write("                                        <th>Descripcion</th>\n");
      out.write("                                        <th>Cantidad</th>\n");
      out.write("                                        <th>Precio unitario</th>\n");
      out.write("                                        <th>Prec total</th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("                                <tr>\n");
      out.write("\t\t\t\t\t<th>1</th>\n");
      out.write("                                        <th>Martillos</th>\n");
      out.write("                                        <th>-------</th>\n");
      out.write("                                        <th>5</th>\n");
      out.write("                                        <th>7.00</th>\n");
      out.write("                                        <th>35.00</th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("                                 <tr>\n");
      out.write("\t\t\t\t\t<th>2</th>\n");
      out.write("                                        <th>Candados</th>\n");
      out.write("                                        <th>-------</th>\n");
      out.write("                                        <th>20</th>\n");
      out.write("                                        <th>5.00</th>\n");
      out.write("                                        <th>100.00</th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("                                 <tr>\n");
      out.write("\t\t\t\t\t<th>3</th>\n");
      out.write("                                        <th>Cementos sol</th>\n");
      out.write("                                        <th>-------</th>\n");
      out.write("                                        <th>500</th>\n");
      out.write("                                        <th>20.00</th>\n");
      out.write("                                        <th>1000.00</th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</thead>\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
      out.write("    </center>\n");
      out.write(" <div class=\"head1\" style=\"padding-left:11em; text-align: center;\">\n");
      out.write("        <div class=\"pt3\" style=\"float: left;font-size: 15px;\" >\n");
      out.write("                <h1>Observaciones</h1>\n");
      out.write("                <textarea style=\"width: 30em;  height: 100px; border-color: black;\"></textarea><br><br>\n");
      out.write("                <input type=\"button\" value=\"Imprimir\" style=\" text-align: center; width: 8em; height: 3em;\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"pt4\" style=\"float: rigth;font-size: 15px;\">\n");
      out.write("                <h3>Total a pagar:           s/ 10135</h3>\n");
      out.write("                <h3>Tiempo de entrega:         3 días</h3>\n");
      out.write("                <h3>Modo de pago:             Contado</h3>\n");
      out.write("                <h3>Fecha de entrega:          07/11/2018</h3><br><br>\n");
      out.write("                <input type=\"button\" value=\"Cerrar\" style=\" text-align: center; width: 8em;height: 3em;\">\n");
      out.write("                <input type=\"button\" value=\"Exportar\" style=\" text-align: center; width: 8em;height: 3em;\">\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("    </body>\n");
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
