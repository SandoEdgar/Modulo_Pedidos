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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<title>Nav Bar</title>\n");
      out.write("\t<!-- For Resposive Device -->\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\t\n");
      out.write("\t<!-- <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\"> -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/dist/css/bootstrap.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/dist/css/style.css\" >\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<header>       \t\n");
      out.write("        <nav >\n");
      out.write("            <div class=\"logo-section\">\n");
      out.write("                <!-- <a class=\"logo\">DERPAGE</a> -->\n");
      out.write("                <a href=\"index.html\" class=\"logo\">\n");
      out.write("                        <div class=\"row logo-caja float-left\">\n");
      out.write("                            <div class=\"col-sm-4 logo-caja__image\">\n");
      out.write("                                <img class=\"logo__img\" src=\"img/logo.png\" alt=\"Logo\">       \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-8 logo-caja__text\">\n");
      out.write("                                <h4 class=\"logo__text\">PROGRESO S.A.C</h4>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </a>\n");
      out.write("                <button class=\"hb-button\"><i class=\"fa fa-bars\"></i></button>\n");
      out.write("            </div>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"#\">Nosotros</a></li>\n");
      out.write("                <li><a href=\"#\">Servicios</a></li>\n");
      out.write("                <li><a href=\"#\">Blog</a></li>\n");
      out.write("                <li><a href=\"#\">Contacto</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("    <section class=\"banner\">\n");
      out.write("    \t<img src=\"image/BannerWithText.png\" alt=\"\">\n");
      out.write("    </section>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
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
      out.write("/dist/js/navshrink.js\"></script>\t\n");
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
