package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FrmEmpReg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"appjs/frmEmpReg.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">\n");
      out.write("        \n");
      out.write("\n");
      out.write("        \n");
      out.write("        <title>Employee Registration</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <img src=\"images/logo.jpg\" width=\"90\" height=\"90\" class=\"center\">\n");
      out.write("        <h1 class=\"jumbotron\"><strong>EMPLOYEE REGISTRATION</strong></h1>\n");
      out.write("        <form id=\"employee\" class=\"form-group\" name=\"employeeform\" method=\"post\" action=\"\" >\n");
      out.write("            <div id=\"one\">\n");
      out.write("                <table align=\"center\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <strong>Employee Insurance No :</strong>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"insurance\" type=\"number\" name=\"insno\" class=\"form-control\" oninput=\"javascript: if (this.value.length > this.maxLength) this.value = this.value.slice(0, this.maxLength); \" placeholder=\"10 digit Insurance Number\" autofocus  maxlength = \"10\" required />\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <strong>Check No :</strong>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"Checkno\" type=\"number\" name=\"checkno\" class=\"form-control\" maxlength = \"6\" oninput=\"javascript: if (this.value.length > this.maxLength) this.value = this.value.slice(0, this.maxLength);\" placeholder=\"6 digit check No\" autofocus/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <strong>Employee's Name :</strong>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input id=\"empname\" type=\"text\" name=\"empname\" class=\"form-control\" onkeyup=\"upper()\" placeholder=\"Enter the Name\" autofocus  required />\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <strong>Birth Date :</strong>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"date\" class=\"form-control\" name=\"bdate\" id=\"birthdate\" autofocus required />\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <strong>Join Date :</strong>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"date\" class=\"form-control \"id=\"joindate\" name=\"jdate\" autofocus required />\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <strong>Leave Date :</strong>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"date\" class=\"form-control\" id=\"leavedate\" name=\"ldate\" autofocus/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                </table>\n");
      out.write("            <br><input type=\"submit\" id=\"registerEmp\" value=\"Register\"  class=\"btn btn-primary\" autofocus style=\"position:absolute; left:50%;\">\n");
      out.write("            </div>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("            </div>\n");
      out.write("            <footer style=\"position:absolute;bottom:0px;left:30%\">\n");
      out.write("                <div style=\"background-color:lightgray\">\n");
      out.write("                <p>Copyright © 2018 - All Rights Reserved - BEST IT DEPT. Site best view on CHROME.</p>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
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
