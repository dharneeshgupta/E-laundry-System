package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

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

 response.setHeader("Cache-Control","no-cache");
  response.setHeader("Cache-Control","no-store");
  response.setHeader("Pragma","no-cache");
  response.setDateHeader ("Expires", 0);
    if ((session.getAttribute("roll_no.") == null) || (session.getAttribute("roll_no.") == "")) {

      out.write("\r\n");
      out.write("                   \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"index.css\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Abril+Fatface\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,700\" rel=\"stylesheet\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap/bootstrap.css\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\t<title>E-laundry Login</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"main\">\r\n");
      out.write("\t<div class=\"main_container\">\r\n");
      out.write("\t\t<div class=\"top_head_style\">\r\n");
      out.write("\t\t\t<p class=\"main_heading\">\r\n");
      out.write("                <span>\r\n");
      out.write("                    <img src=\"index/thaparlogo.png\" alt=\"\" class=\"main_heading_image\">\r\n");
      out.write("                </span>\r\n");
      out.write("\r\n");
      out.write("                <span>\r\n");
      out.write("                    R.S Dry Cleaners\r\n");
      out.write("                </span>\r\n");
      out.write("            </p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"middle\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-6\">\r\n");
      out.write("                        <img src=\"index/mainlogo.png\" class=\"page_photo1\" alt=\"\">\r\n");
      out.write("                        <p class=\"small_line\">Your one Stop Destination for laundry Service In TU</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-6\">\r\n");
      out.write("\r\n");
      out.write("                        <form class=\"contain_form form_font\" action=\"checklogin.jsp\" method=\"post\">\r\n");
      out.write("                            <h3 class=\"login_heading\">Login</h3>\r\n");
      out.write("\r\n");
      out.write("                            <hr>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"rollNum\" class=\"form-labels\">Roll Number</label>\r\n");
      out.write("                                <input type=\"text\" name=\"roll_no.\" class=\"form-control form-group-members\" id=\"rollNume\" placeholder=\"Roll Number\" required=\"\" pattern=\"[0-9]{9}\" maxlength=\"9\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"exampleInputPassword1\" class=\"form-labels\">Password</label>\r\n");
      out.write("                                <input type=\"password\" name=\"password\" class=\"form-control form-group-members\" id=\"exampleInputPassword1\" placeholder=\"Password\" required=\"\" pattern=\"[0-9a-zA-Z]{6,50}\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"checkbox\">\r\n");
      out.write("                                <label>\r\n");
      out.write("                                    <input type=\"checkbox\" id=\"remeberme\" name=\"remme\">Remember Me\r\n");
      out.write("                                </label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <p class=\"\"><a href=\"register.jsp\" class=\"btn btn-danger\">Sign Up</a></p>\r\n");
      out.write("\r\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-success btn-lg\">Login</button>\r\n");
      out.write("                        </form>\r\n");
      out.write("      \r\n");
      out.write("                 \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"Bottom\">\r\n");
      out.write("\t\t\t<p>All Rights Reserved  R.S Dry Clean</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
}
  else
      {
      response.sendRedirect("mainpage.jsp");
      }
  
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
