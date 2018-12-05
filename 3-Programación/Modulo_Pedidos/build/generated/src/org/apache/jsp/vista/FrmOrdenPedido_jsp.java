package org.apache.jsp.vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FrmOrdenPedido_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("        <link href=\"");
      out.print(request.getContextPath());
      out.write("/dist/css/css_OrdenPedido/estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>FrmListaOrdenCompra</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <center>\n");
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
      out.write("          </div>\n");
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
      out.write("                                        <img src=\"../dist/img/imagenes_OrdenPedido/vista.png\" alt=\"\" width=\"25\"/>\n");
      out.write("                                    </button>\n");
      out.write("                                </td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>002</td>\n");
      out.write("                                <td>10/07/2018</td>\n");
      out.write("                                <td>MAX</td>\n");
      out.write("                                <td>PENDIENTE</td>\n");
      out.write("                                <td> \n");
      out.write("                                  <button> <img src=\"../dist/img/imagenes_OrdenPedido/vista.png\" alt=\"\" width=\"25\"/></button>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>003</td>\n");
      out.write("                                <td>10/05/2018</td>\n");
      out.write("                                <td>MAX</td>\n");
      out.write("                                <td>PENDIENTE</td>\n");
      out.write("                                <td>  \n");
      out.write("                                 <button> <img src=\"../dist/img/imagenes_OrdenPedido/vista.png\" alt=\"\" width=\"25\"/></button>\n");
      out.write("                                </td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>004</td>\n");
      out.write("                                <td>23/10/2018</td>\n");
      out.write("                                <td>MAX</td>\n");
      out.write("                                <td>PENDIENTE</td>\n");
      out.write("                                <td>  \n");
      out.write("                                 <button> <img src=\"../dist/img/imagenes_OrdenPedido/vista.png\" alt=\"\" width=\"25\"/></button>\n");
      out.write("                                </td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("                        <tr>\n");
      out.write("\t\t\t\t<td>005</td>\n");
      out.write("                                <td>15/10/2018</td>\n");
      out.write("                                <td>MAX</td>\n");
      out.write("                                <td>OBSERVADO</td>\n");
      out.write("                                <td>   \n");
      out.write("                                    <button> <img src=\"../dist/img/imagenes_OrdenPedido/vista.png\" alt=\"\" width=\"25\"/></button>\n");
      out.write("                                </td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
      out.write("   \n");
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
