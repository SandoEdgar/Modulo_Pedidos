package org.apache.jsp.vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("  <title>Login</title>\r\n");
      out.write("  <!-- Tell the browser to be responsive to screen width -->\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <!-- Pace -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/Complementos/plugins/pace/pace-theme-minimal.css\">\r\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath());
      out.write("/Complementos/plugins/pace/pace.min.js\"></script>\r\n");
      out.write("  <!-- Font Awesome -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\">\r\n");
      out.write("  <!-- Ionicons -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css\">\r\n");
      out.write("  <!-- Theme style -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/Complementos/dist/css/adminlte.min.css\">\r\n");
      out.write("  <!-- iCheck -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/Complementos/plugins/iCheck/square/blue.css\">\r\n");
      out.write("  <!-- Google Font: Source Sans Pro -->\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700\" rel=\"stylesheet\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/Complementos/dist/css/estilos-login.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"hold-transition\">\r\n");
      out.write("<div class=\"login-box contenedor-login\">\r\n");
      out.write("  <!-- /.login-logo -->\r\n");
      out.write("  <div class=\"card contenedor-login\">\r\n");
      out.write("   <div class=\"login-logo\">\r\n");
      out.write("    <img src=\"");
      out.print(request.getContextPath());
      out.write("/Complementos/dist/img/usuario-login.png\" alt=\"\" width=150>\r\n");
      out.write("  </div>\r\n");
      out.write("    <div class=\"card-body login-card-body\">\r\n");
      out.write("      <p class=\"login-box-msg\">Ingresa  tus credenciales</p>\r\n");
      out.write("      <form name=\"form\">\r\n");
      out.write("        <div class=\"form-group has-feedback\">\r\n");
      out.write("            <input type=\"email\" class=\"form-control\" placeholder=\"Correo Institucional\" id=\"loginEmail\" name=\"loginEmail\">\r\n");
      out.write("          <i class=\"fa fa-envelope form-control-feedback\"></i>\r\n");
      out.write("        </div>\r\n");
      out.write("        <br>\r\n");
      out.write("        <div class=\"form-group has-feedback\">\r\n");
      out.write("            <input type=\"password\" class=\"form-control\" placeholder=\"Contraseña\" id=\"loginPassword\" name=\"loginPassword\">\r\n");
      out.write("          <i class=\"fa fa-lock form-control-feedback\"></i>\r\n");
      out.write("        </div>\r\n");
      out.write("        <br>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"col-8\">\r\n");
      out.write("            <div class=\"checkbox icheck\">\r\n");
      out.write("              <label>\r\n");
      out.write("                <input type=\"checkbox\"> Recordarme\r\n");
      out.write("              </label>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- /.col -->\r\n");
      out.write("          <div class=\"col-4\">\r\n");
      out.write("              <button class=\"btn btn-block btn-flat btn-ingresar\" id=\"btn-ingresar\">Ingresar</button>\r\n");
      out.write("          </div>\r\n");
      out.write("          <br>\r\n");
      out.write("          <!-- /.col -->\r\n");
      out.write("        </div>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.login-card-body -->\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- /.login-box -->\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery -->\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/Complementos/plugins/jquery/jquery.min.js\"></script>\r\n");
      out.write("<!-- Bootstrap 4 -->\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/Complementos/plugins/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<!-- iCheck -->\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/Complementos/plugins/iCheck/icheck.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
