package com.login;


import java.io.IOException;
import java.sql.*;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class detailServlet
 */
@WebServlet("/detailServlet")
public class detailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public detailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		pw.print("<html>");
		pw.print("<body>");
		//pw.print("welcome"+request.getParameter("username"));
		//pw.print("<script>");
	
		pw.print("Employee name:"+request.getParameter("name"));
		pw.print("<br>");
		pw.print("Employee password:"+request.getParameter("password"));
		pw.print("<br>");
		pw.print("Employee gender:"+request.getParameter("gender"));
		pw.print("<br>");
		pw.print("Employee city:"+request.getParameter("cities"));
		pw.print("<br>");
		pw.print("Employee address:"+request.getParameter("address"));
		//pw.print("</script>");
		
		pw.print("</html>");
		pw.print("</body>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
   /*   Connection conn;
    Statement st;
    ResultSet rs;
    PrintWriter pw = response.getWriter();
        String userName = request.getParameter("usrname");
    String password = request.getParameter("pwd");
        HttpSession session = request.getSession(true);
        response.setContentType("text/html");
            try 
            {
            	Class.forName("com.mysql.cj.jdbc.Driver");
                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db26","root","admin");
                st=conn.createStatement();
                rs=st.executeQuery("select usrname,pwd from db26.User where usrname='"+userName+"' and pwd='"+password+"'");
                while(rs.next())
                {
                    session.setAttribute("usrname",userName);
                    RequestDispatcher dispatch=request.getRequestDispatcher("/Login");
                    dispatch.forward(request, response);
                }
            st.close();
            rs.close();
            conn.close();
            } 
            catch (SQLException ex) 
            {
                  pw.println(ex);  
            } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }*/
	}
}

