package org.apache.jsp.vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Frm_005fVer_005fOrden_005fPedido_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<header>       \t\r\n");
      out.write("        <nav >\r\n");
      out.write("            <div class=\"logo-section\">              \r\n");
      out.write("                <a href=\"index.html\" class=\"logo\">\r\n");
      out.write("                        <div class=\"row logo-caja float-left\">\r\n");
      out.write("                            <div class=\"col-sm-8 logo-caja__text\">                        \r\n");
      out.write("                                <h4 class=\"logo__text\">PROGRESO S.A.C</h4>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                    </a>\r\n");
      out.write("                <button class=\"hb-button\"><i class=\"fa fa-bars\"></i></button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <ul>  \r\n");
      out.write("                 <li><a href=\"#\"> Ver Orden Pedido</a></li>  \r\n");
      out.write("                 <li><a href=\"#\">Lista Ordenes de Pedidos </a></li>   \r\n");
      out.write("                 <li><a href=\"#\">Lista Ordenes de Compra</a></li>                 \r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </header>\r\n");
      out.write("    <section class=\"banner\">\r\n");
      out.write("    \t<img src=\"");
      out.print(request.getContextPath());
      out.write("/dist/img/fondo1.jpg\" alt=\"\">\r\n");
      out.write("       \r\n");
      out.write("    </section>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
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
      out.write("/dist/js/navshrink.js\"></script>\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("     <footer>\r\n");
      out.write("       \r\n");
      out.write("       <div class=\"container-footer-all\">\r\n");
      out.write("        \r\n");
      out.write("            <div class=\"container-body\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"colum1\">\r\n");
      out.write("                    <h1>Mas informacion de la compañia</h1>\r\n");
      out.write("\r\n");
      out.write("                    <p> DISTRIBUIDORA Y FERRETERIA PROGRESO s.a.c\r\n");
      out.write("                        venta de materiales de construccion  \r\n");
      out.write("                    en general </p>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"colum2\">\r\n");
      out.write("\r\n");
      out.write("                    <h1>Redes Sociales</h1>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <img src=\"");
      out.print(request.getContextPath());
      out.write("/dist/img/facebook.png\">\r\n");
      out.write("                        <label>Siguenos en Facebook</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  \r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"colum3\">\r\n");
      out.write("\r\n");
      out.write("                    <h1>Informacion Contactos</h1>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row2\">\r\n");
      out.write("                        <img src=\"");
      out.print(request.getContextPath());
      out.write("/dist/img/house.png\">\r\n");
      out.write("                        <label>Av. Imperial 115 Coop.Andahuaylas-Santa Anita \r\n");
      out.write("                        </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row2\">\r\n");
      out.write("                        <img src=\"");
      out.print(request.getContextPath());
      out.write("/dist/img/smartphone.png\">\r\n");
      out.write("                        <label>362-170</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row2\">\r\n");
      out.write("                        <img src=\"");
      out.print(request.getContextPath());
      out.write("/dist/img/contact.png\">\r\n");
      out.write("                         <label>progresp_df@hotmail.com</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        \r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"container-footer\">\r\n");
      out.write("               <div class=\"footer\">\r\n");
      out.write("                    <div class=\"copyright\">\r\n");
      out.write("                        © 2017 Todos los Derechos Reservados | <a href=\"\">MARCIAL LLACTAHUAMAN CH.</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"information\">\r\n");
      out.write("                        <a href=\"\">Informacion Compañia</a> | <a href=\"\">Privacion y Politica</a> | <a href=\"\">Terminos y Condiciones</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        \r\n");
      out.write("    </footer>\r\n");
      out.write("    \r\n");
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
