package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.beans.BookIssuedInfo;
import com.dao.BookIssuedDAO;
import com.dao.StudentDAO;
import com.dao.TeacherDAO;

/**
 * Servlet implementation class IssueBookServlet
 */
@WebServlet("/IssueBookServlet")
public class IssueBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IssueBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		long bookCode=Long.parseLong( request.getParameter("code"));
		HttpSession login = request.getSession();
		String username= (String)login.getAttribute("username");
		String ui=username.trim();
		
		Connection con = BookIssuedDAO.getConnection(); 

		Connection con2=StudentDAO.getConnection();
    	Connection con3=TeacherDAO.getConnection();
    	long userId=StudentDAO.fetchId(ui.toLowerCase(), con2);
    	long userId1=TeacherDAO.fetchId(ui.toLowerCase(), con3);
		System.out.println("User" +userId);
    	if(userId!=0) {
    		BookIssuedDAO.updateIssue(bookCode,userId , con);
    	}
    	else if(userId1!=0) {
    		BookIssuedDAO.updateIssue(bookCode,userId1 , con);
    	}
    	else {}
    		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
