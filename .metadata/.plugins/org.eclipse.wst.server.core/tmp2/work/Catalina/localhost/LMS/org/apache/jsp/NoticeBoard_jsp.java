/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.92
 * Generated at: 2019-03-03 17:41:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class NoticeBoard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>NoticeBoard</title>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("body{\r\n");
      out.write(" background:url('https://thumbs.dreamstime.com/b/library-books-background-isolated-white-33423844.jpg') no-repeat;\r\n");
      out.write("background-size:cover;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input.delete{\r\n");
      out.write("float:right;\r\n");
      out.write("background-color:red;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("input.primary{\r\n");
      out.write("background-color:yellow;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>  \r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div>\r\n");
      out.write("<h2><center>Events</center></h2>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<ol>\r\n");
      out.write("  <li><h3>Workshop</h3></li>\r\n");
      out.write("  <li><h3>Graduation Day</h3></li>\r\n");
      out.write("  <li><h3>FareWell</h3></li>\r\n");
      out.write("  <li><h3>Relish</h3></li>\r\n");
      out.write("</ol> \r\n");
      out.write(" <br></br> <br></br> <br></br> <br></br> <br></br> <br></br> <br></br> <br></br> <br></br> <br></br>\r\n");
      out.write("<div id=blahDiv>\r\n");
      out.write("<input type=\"button\" id=\"updateButton\" class=\"primary\" onclick=\"productUpdate()\" value=\"Add Event\">\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write(" <input type=\"button\" value=\"Delete\" class=\"delete\" onclick=\"destroyDiv()\">\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function productUpdate() {\r\n");
      out.write("  if ($(\"#productname\").val() != null && $(\"#productname\").val() != '') {\r\n");
      out.write("    // Add product to Table\r\n");
      out.write("    productAddToTable();\r\n");
      out.write("    // Clear form fields\r\n");
      out.write("    formClear();\r\n");
      out.write("    // Focus to product name field\r\n");
      out.write("    $(\"#productname\").focus();\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      function destroyDiv() {\r\n");
      out.write("\r\n");
      out.write("           var div = document.getElementById(\"level1\");\r\n");
      out.write("           div.parentNode.removeChild(div);\r\n");
      out.write("      \r\n");
      out.write("      }\r\n");
      out.write(" </script>\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("         \r\n");
      out.write("       \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
