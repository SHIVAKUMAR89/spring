/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.92
 * Generated at: 2019-03-13 12:07:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("  <body>\r\n");
      out.write("  \r\n");
      out.write("  Hi ");
      out.print(session.getAttribute("session"));
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  ");
      out.print(application.getInitParameter("context") );
      out.write("\r\n");
      out.write("          <form action=\"RegistrationServlet\" >   \r\n");
      out.write("        \r\n");
      out.write("        \t User ID : <input type=\"text\"  id=\"name\" name=\"userId\" value=\"");
      out.print(request.getParameter("username"));
      out.write("\" />\r\n");
      out.write("           \r\n");
      out.write("            First Name : <input type=\"text\"  id=\"name\" name=\"name\"  />\r\n");
      out.write("            <span id=\"nameError\"></span> <br/>\r\n");
      out.write("            Mobile no:\r\n");
      out.write("             <input type=\"text\"  id=\"name\" name=\"phoneNo\"  />\r\n");
      out.write("            \r\n");
      out.write("            Gender : \r\n");
      out.write("            <input type=\"radio\" name=\"gender\" class=\"gender\" value=\"M\">Male</input>\r\n");
      out.write("            <input type=\"radio\" name=\"gender\" class=\"gender\" value=\"F\">Female</input>\r\n");
      out.write("            <input type=\"radio\" name=\"gender\" class=\"gender\" value=\"O\">Others</input>\r\n");
      out.write("            <span id=\"genderError\"></span>\r\n");
      out.write("            \r\n");
      out.write("            <br/>\r\n");
      out.write("            Languages known:\r\n");
      out.write("\r\n");
      out.write("            <input type=\"checkbox\" class=\"technology\" name=\"technology\" value=\"HTML\">HTML</input>\r\n");
      out.write("            <input type=\"checkbox\" class=\"technology\" name=\"technology\" value=\"CSS\">CSS</input>\r\n");
      out.write("            <input type=\"checkbox\" class=\"technology\" name=\"technology\" value=\"JS\">JS</input>\r\n");
      out.write("            <span id=\"techError\"></span>\r\n");
      out.write("            <br/>\r\n");
      out.write("            <input type=\"submit\"/>\r\n");
      out.write("\r\n");
      out.write("         </form>  \r\n");
      out.write("         \r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tfunction validate(){\r\n");
      out.write("\t\t var name = document.getElementById(\"name\").value;\r\n");
      out.write("\t\tvar gender = document.getElementsByClassName(\"gender\");\r\n");
      out.write("\t\tvar technology = document.getElementsByClassName(\"technology\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar flagName= nameValidate(name);\r\n");
      out.write("\t\tvar flagGender= genderValidate(gender);\r\n");
      out.write("\t\tvar flagTechnology= technologyValidate(technology);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif( flagName && flagGender && flagTechnology)\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\telse\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction nameValidate(name){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(name.match(\"^[A-Za-z]+$\"))\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t\telse{\r\n");
      out.write("\t\tdocument.getElementById(\"nameError\").innerHTML=\"Name can only have chars\";\t\r\n");
      out.write("\t\tdocument.getElementById(\"nameError\").style.color=\"red\";\r\n");
      out.write("\t\treturn false;\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction genderValidate(gender){\r\n");
      out.write("\t\tvar flag= false;\r\n");
      out.write("\t\tfor(var i=0;i<gender.length;i++){\r\n");
      out.write("\t\t\tif(gender[i].checked){\r\n");
      out.write("\t\t\t\tflag=true;\r\n");
      out.write("\t\t\t\tbreak;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(!flag){\r\n");
      out.write("\t\t\tdocument.getElementById(\"genderError\").innerHTML=\"One of the radio button has to selected\";\t\r\n");
      out.write("\t\t\tdocument.getElementById(\"genderError\").style.color=\"red\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn flag;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction technologyValidate(technology){\r\n");
      out.write("\t\tvar flag= false;\r\n");
      out.write("\t\tfor(var i=0;i<technology.length;i++){\r\n");
      out.write("\t\t\tif(technology[i].checked){\r\n");
      out.write("\t\t\t\tflag=true;\r\n");
      out.write("\t\t\t\tbreak;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tconsole.log(flag);\r\n");
      out.write("\t\tif(!flag){\r\n");
      out.write("\t\t\tdocument.getElementById(\"techError\").innerHTML=\"One of the checkbox has to checked\";\t\r\n");
      out.write("\t\t\tdocument.getElementById(\"techError\").style.color=\"red\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn flag;\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
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
