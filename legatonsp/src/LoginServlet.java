import java.sql.*;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.login.UsersDAO;

import nsp.Login;
//import com.sun.corba.se.pept.transport.Connection;
import java.sql.*;
//import com.login.SimpleDateFormat;

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
    	//System.out.println("inside servlet");
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//System.out.println("inside servlet");
		
		String username= request.getParameter("username");
		String password= request.getParameter("password");
		
		
		UsersDAO usersdao = new UsersDAO();
		
		usersdao.addUsers(username,password);
		
		
		/*HttpSession session = request.getSession();
		session.setAttribute("session",username);
		session.setAttribute("session",password);
		System.out.println("session id"+session.getId());
		
		Connection con= Login.getConnection();
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		pw.print("<b>you have entered wrong user name and pwd</b>");
		
		if(Login.validate(username,password,con)) {
			RequestDispatcher rd=request.getRequestDispatcher("registration.jsp");
			rd.forward(request,response);
			//response.sendRedirect("registration.jsp");
			
			
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			//response.setContentType("text/html");
			rd.include(request,response);
			
		}
		*/
		//PrintWriter pw=response.getWriter();
		
		//response.setContentType("text/html");
		//pw.print("<b>you have entered wrong user name and pwd</b>");
		
		
/*		if(username.toLowerCase().equals("admin") && password.toLowerCase().equals("admin")) {
		//RequestDispatcher rd=request.getRequestDispatcher("SuccessServlet");
		//rd.forward(request,response);
			response.sendRedirect("registration.jsp");
	}
	else
	{
		RequestDispatcher rd=request.getRequestDispatcher("index.html");
		//response.setContentType("text/html");
		//pw.print("you have entered wrong user name and pwd");
		rd.include(request,response);
	}
		
		pw.print("<html>");
		pw.print("<body>");
		pw.print("<span id=time></span>");
		//pw.print("<form action=NextServlet>");
		//pw.print("<h1>Hello</h1>");
		
		//pw.print("<input type=text value="+username+"><br>");
		//pw.print("<input type = submit>");
		//pw.print("</form>");
		pw.print("<script>");
		
		pw.print("setInterval(getTime,1000);");
		pw.print("function getTime() {document.getElementById('time').innerHTML=new Date()};");
				pw.print("</script>");
				pw.print("</body>");
				pw.print("</html>");
			
		System.out.println("inside doGet"+request);
*/		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
