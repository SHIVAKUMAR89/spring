package login;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
//import login.LoginServlet;


public class Login {
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//create the connection
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db26","root","admin");
			System.out.println("connected successfully");
			return con;
		} catch(ClassNotFoundException e)
		{
			e.printStackTrace();
			return null;
			
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
				}
		
	}
	public static boolean validate(String username, String password,Connection con) {
		Boolean flag=false;
		try {
		String sql="select * from db26.users where UserId=? and pwd=?";
		PreparedStatement pstmst=con.prepareStatement(sql);
		pstmst.setString(1,username.toLowerCase());
		pstmst.setString(2,password);
		ResultSet rs=pstmst.executeQuery();
		while(rs.next()) {
			flag=true;
			break;
		}
		return flag;
		}catch(SQLException e) {
			e.printStackTrace();
			return flag;
				}
		//return true;
	}

		
	/*
		if(result.next()) {
			Object response;
			response.sendRedirect("registration.jsp");
		}
		else {
			request.setAttribute("errmsg","username and password are incorrect");
					RequestDispatcher rd=request.getRequestDispatcher("/Login.java");
			rd.forward(request, reponse);
		}
		
	}*/


	public static  ArrayList<User> DisplayAll(Connection con) {
		String sql="select * from db26.UserDetail";
		PreparedStatement pstmst;
		try {
		pstmst = con.prepareStatement(sql);
		ArrayList<User> al=new ArrayList<User>();
		ResultSet rs=pstmst.executeQuery();
		while(rs.next());{
			User detail=new User();
			detail.setUserId(rs.getString(1));
			detail.setpwd(rs.getString(2));
			//String[] arr= {rs.getString(3)};
			//detail.setCities(arr);
			al.add(detail);
		}
		pstmst.close();
		rs.close();
		con.close();
		return al;
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
/*	public static void insertData(UserDetail detail, Connection con) {
		// TODO Auto-generated method stub
		String city="";
		String[] cities=detail.getCities();
		if(cities!=null) {
		for(int i=0;i<cities.length;i++) {
			city=city+","+cities[i];
		
		}
	}
	
	*/
	public static  ArrayList<User> SearchServlet(Connection con)
		
		String sql= "inser into db26.UserDetail values(?,?,?)";
		
		try {
			PreparedStatement p= con.prepareStatement(sql);
			p.setString(1, detail.getName());
			p.setString(2, detail.getGender());
			p.setString(3, city);
			p.executeUpdate();
			p.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
			
			
		}
	*/
	}
