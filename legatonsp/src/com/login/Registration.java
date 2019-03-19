package com.login;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nsp.Login;
//import nsp.UserDetail;
//import nsp.detail;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		Connection con=Login.getConnection();
		String uname=request.getParameter("uname");
		String gender= request.getParameter("gender");
		String[] cities=request.getParameterValues("cities");
		
		UserDetail detail=new UserDetail();
		//UserDetail detail=new UserDetail();
		detail.setName(uname);
		detail.setGender(gender);
		detail.setCities(cities);
		Login.insertData(detail,con);
		ArrayList<UserDetail> al=Login.displayData(con);
		request.setAttribute("Userlist", al);
		RequestDispatcher rd=request.getRequestDispatcher("displayData");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
