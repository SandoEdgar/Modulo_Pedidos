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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        \r\n");
      out.write("        <link href=\"");
      out.print(request.getContextPath());
      out.write("/dist/css/css_OrdenPedido/estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <title>FrmListaOrdenCompra</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("         <center>\r\n");
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
      out.write("   \r\n");
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
