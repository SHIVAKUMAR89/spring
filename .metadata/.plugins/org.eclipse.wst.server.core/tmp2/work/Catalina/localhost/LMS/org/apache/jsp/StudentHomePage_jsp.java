/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.92
 * Generated at: 2019-03-03 18:11:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class StudentHomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Student</title>\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"style1.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"page\">\r\n");
      out.write("    <div class=\"headerpart\">\r\n");
      out.write("\t<img src=\"images/header.jpg\" alt=\"oops\" height=\"180px\" width=\"1330px\"></div>\r\n");
      out.write("    <div class=\"linkspart\">\r\n");
      out.write("    <center>\r\n");
      out.write("    <a href = \"home.html\"><b>DigitalLibrary</b></a> &nbsp;\r\n");
      out.write("\t\r\n");
      out.write("    <a href = \"BookList.jsp\"><b>BookList</b></a> &nbsp;\r\n");
      out.write("\r\n");
      out.write("    <a href = \"home.html\"><b>BookIssued</b></a> &nbsp;\r\n");
      out.write("\t\r\n");
      out.write("    <a href = \"home.html\"><b>BookReserved</b></a> &nbsp;\r\n");
      out.write("    \r\n");
      out.write("    <a href = \"home.html\"><b>ViewReports</b></a> &nbsp;\r\n");
      out.write("    </center>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"bodypart\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"imagepart\" >\r\n");
      out.write("  <div class=\"slideshow-container\" style=\"max-height:70%\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"mySlides fade\">\r\n");
      out.write("  \r\n");
      out.write("  <img src=\"images/01.jpg\" style=\"width:100%\">\r\n");
      out.write("  \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"mySlides fade\">\r\n");
      out.write("\r\n");
      out.write("  <img src=\"images/101.jpg\" style=\"width:100%\">  \r\n");
      out.write("  \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"mySlides fade\">\r\n");
      out.write("\r\n");
      out.write("  <img src=\"images/104.jpg\" style=\"width:100%\">\r\n");
      out.write("  \r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"mySlides fade\">\r\n");
      out.write("\r\n");
      out.write("  <img src=\"images/105.jpg\" style=\"width:100%\">\r\n");
      out.write("  \r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"mySlides fade\">\r\n");
      out.write("\r\n");
      out.write("  <img src=\"images/106.jpg\" style=\"width:100%\">\r\n");
      out.write("  \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"mySlides fade\">\r\n");
      out.write("  \r\n");
      out.write("  <img src=\"images/marcustulliuscicero.jpg\" style=\"width:100%\">\r\n");
      out.write("  \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<br /><br /><br /><br /><br /><br /><br />\r\n");
      out.write("\r\n");
      out.write("<div style=\"text-align:center\">\r\n");
      out.write("  <span class=\"dot\"></span> \r\n");
      out.write("  <span class=\"dot\"></span> \r\n");
      out.write("  <span class=\"dot\"></span> \r\n");
      out.write("  <span class=\"dot\"></span>\r\n");
      out.write("   <span class=\"dot\"></span> \r\n");
      out.write("  <span class=\"dot\"></span>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"newspart\">\r\n");
      out.write("        <h2>News and Events</h2>\r\n");
      out.write("        <marquee direction =\"up\" height=\"80%\">\r\n");
      out.write("        <h4>Events in College</h4>\r\n");
      out.write("        <p> Legato training is being conducted at IIHT  </p>\r\n");
      out.write("        <br>\r\n");
      out.write("        <p>Intercollege Short movie Making</p>\r\n");
      out.write("        <br>\r\n");
      out.write("        <p>National Conference on Power Quality</p>\r\n");
      out.write("        <br>\r\n");
      out.write("       \r\n");
      out.write("        </marquee>\r\n");
      out.write("        </div>\r\n");
      out.write(" \r\n");
      out.write("<center><h3> Welcome to the world of Knowledge </h3></center>\r\n");
      out.write("\r\n");
      out.write("<p>Library management system is a project which aims in developing a computerized system to maintain all the daily work of library .\r\n");
      out.write("This project has many features which are generally not available in normal library management systems like facility of user login and a facility of teachers login .\r\n");
      out.write("It also has a facility of admin login through which the admin can monitor the whole system . </p>\r\n");
      out.write("\r\n");
      out.write("<p>It also has facility of an online notice board where teachers can student can put up information about workshops or seminars being held in our colleges. </p>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class = \"footerpart\">\r\n");
      out.write("<center>\r\n");
      out.write("<img src=\"images/facebookicon.png\" alt=\"facebook logo\" width=\"20\" height=\"20\">&nbsp;\r\n");
      out.write("    <img src=\"images/twittericon.png\" alt=\"twitter logo\" width=\"20\" height=\"20\">&nbsp;\r\n");
      out.write("    <img src=\"images/linkedinicon.png\" alt=\"linkedin logo\" width=\"20\" height=\"20\">\r\n");
      out.write("\t <br />\r\n");
      out.write("2019.All Copyrights Reserved\r\n");
      out.write("</center>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("var slideIndex = 0;\r\n");
      out.write("showSlides();\r\n");
      out.write("\r\n");
      out.write("function showSlides() {\r\n");
      out.write("  var i;\r\n");
      out.write("  var slides = document.getElementsByClassName(\"mySlides\");\r\n");
      out.write("  var dots = document.getElementsByClassName(\"dot\");\r\n");
      out.write("  for (i = 0; i < slides.length; i++) {\r\n");
      out.write("    slides[i].style.display = \"none\";  \r\n");
      out.write("  }\r\n");
      out.write("  slideIndex++;\r\n");
      out.write("  if (slideIndex > slides.length) {slideIndex = 1}    \r\n");
      out.write("  for (i = 0; i < dots.length; i++) {\r\n");
      out.write("    dots[i].className = dots[i].className.replace(\" active\", \"\");\r\n");
      out.write("  }\r\n");
      out.write("  slides[slideIndex-1].style.display = \"block\";  \r\n");
      out.write("  dots[slideIndex-1].className += \" active\";\r\n");
      out.write("  setTimeout(showSlides, 2000); // Change image every 2 seconds\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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
