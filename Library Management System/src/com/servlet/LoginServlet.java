package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.AdminDAO;
import com.dao.StudentDAO;
import com.dao.TeacherDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		String username = request.getParameter("username");
    	String password = request.getParameter("password");
    	String ui=username.trim();
    	
    	HttpSession login = request.getSession();
		login.setAttribute("username",username);
    	
    	PrintWriter pw= response.getWriter();
    	
    	
    	Connection con1=AdminDAO.getConnection();
    	Connection con2=StudentDAO.getConnection();
    	Connection con3=TeacherDAO.getConnection();
    	boolean flag1=AdminDAO.validateUser(ui.toLowerCase(), password, con1);
    	boolean flag2=StudentDAO.validateUser(ui.toLowerCase(), password, con2);
    	boolean flag3=TeacherDAO.validateUser(ui.toLowerCase(), password, con3);
    	
    	
    	 if(flag1 || flag2 || flag3){
        	 
    	  if(flag1){
        		 
        		 RequestDispatcher rd= request.getRequestDispatcher("AdminHomePage.jsp");
                   	rd.include(request, response);
                   	
        	 }
        	 else if(flag2){
 
        	   RequestDispatcher rd= request.getRequestDispatcher("StudentsHomePage.jsp");
        	   rd.include(request, response);
              	
        	 }
        	 else if(flag3){
        		
          	   RequestDispatcher rd= request.getRequestDispatcher("TeacherHomePage.jsp");
          	   rd.include(request, response);
                	
          	 }
    	 }
           else{
           	
           	response.setContentType("text/html");
           	pw.println("<h3 style='color:red'>You have entered wrong username and password</h3>"); 	
           	RequestDispatcher rd= request.getRequestDispatcher("index.html");
           	rd.include(request, response);
           }
}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
