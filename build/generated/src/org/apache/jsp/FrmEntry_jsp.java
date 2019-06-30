package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FrmEntry_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("         <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"fulltable/jquery.fulltable.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"fulltable/jquery.fulltable.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    <script src=\"appjs/FrmEntry.js\"></script>    \n");
      out.write("        <title>Contractor-Employee</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <img src=\"images/logo.jpg\" width=\"90\" height=\"90\" class=\"center\">\n");
      out.write("        <h1 class=\"jumbotron\"><strong>CONTRACTOR-EMPLOYEE ENTRY</strong></h1>\n");
      out.write("        <form>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <table align=\"center\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <strong>Ward No :</strong>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <select class=\"form-control\" id=\"wardno\"> \n");
      out.write("                                <option>Select The option</option>\n");
      out.write("                                <option value=\"supply\">100-Supply</option>\n");
      out.write("                                <option value=\"gAdministration\">700-General Administration</option>\n");
      out.write("                                <option value=\"traffic\">200-Traffic</option>\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <strong>Contractor ID :</strong>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <select class=\"form-control\"  id=\"contraid\" required />\n");
      out.write("                            </select>\n");
      out.write("                        </td>    \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <strong>Job Date :</strong>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("\n");
      out.write("                            <input type=\"date\" class=\"form-control\" id=\"jobdate\"  required />\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                        <strong>Zone :</strong>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <select id=\"zone\" class=\"form-control\" required >\n");
      out.write("                                <option>Select Your Zone</option>\n");
      out.write("                                <option>North</option>\n");
      out.write("                                <option>South</option>\n");
      out.write("                                <option>East</option>\n");
      out.write("                                <option>West</option>\n");
      out.write("                                \n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <strong>Nature Of Work</strong>\n");
      out.write("                        </td>\n");
      out.write("                        <td colspan=\"3\">\n");
      out.write("                    <input type=\"text\" id=\"nofwork\" class=\"form-control\" placeholder=\"Describe the Work Nature\" required />\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </table>\n");
      out.write("                <br>\n");
      out.write("                <div style=\"text-align: center\"><strong>Enter the Employees Working for the Contractor:</strong></div>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"table table-bordered\">\n");
      out.write("        <table class=\"fulltable fulltable-editable\" style=\"border:1px solid black\" id=\"test-table\">\n");
      out.write("  <thead>\n");
      out.write("    <tr>\n");
      out.write("      <th fulltable-field-name=\"empid\">Employee ID</th>\n");
      out.write("      <th fulltable-field-name=\"jdays\">Working Days</th>\n");
      out.write("      <th fulltable-field-name=\"salary\">Salary</th>\n");
      out.write("      <th fulltable-field-name=\"service\">In Service</th>\n");
      out.write("      </tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("      \n");
      out.write("\n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            <div class=\"text-center\">\n");
      out.write("                <input type=\"submit\" value=\"Save\" id=\"entrysubmit\" class=\"btn btn-primary\" onsubmit=\"return confirmform()\"  />\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("    </div>\n");
      out.write("            \n");
      out.write("        </form> \n");
      out.write("        \n");
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
