/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.92
 * Generated at: 2019-03-02 05:25:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.school.admin.profile.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import common.Common_Things;
import admin_table.Admin_Profile_Model;

public final class Edit_005fProfile_005fController_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      common_use_bean.Admin_Use_Bean obj_Admin_Use_Bean = null;
      obj_Admin_Use_Bean = (common_use_bean.Admin_Use_Bean) _jspx_page_context.getAttribute("obj_Admin_Use_Bean", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (obj_Admin_Use_Bean == null){
        obj_Admin_Use_Bean = new common_use_bean.Admin_Use_Bean();
        _jspx_page_context.setAttribute("obj_Admin_Use_Bean", obj_Admin_Use_Bean, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("obj_Admin_Use_Bean"), request);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");

			
	 
	  
	  
	   
	Admin_Profile_Model obj_Admin_Profile_Model=new Admin_Profile_Model();
	     
	   int flag=obj_Admin_Profile_Model.edit_profile(obj_Admin_Use_Bean);
	   
	   if(flag==1){
		   
			
			session.setAttribute("edit_profle_message","Edit Successfull");
		
			
			
	   }else{

			 session.setAttribute("edit_profle_message","Old Password Mismatch");
		 
	   } 
	   
	    
	   
		
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  \t\t <script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\t\twindow.location.href=\"");
      out.print(Common_Things.url);
      out.write("/edit-profile-admin/\";\r\n");
      out.write("\t\t\t\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t  \r\n");
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
