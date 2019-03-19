package Jdbc;

import java.sql.*;
import java.util.Scanner;

public class JDBCProgram {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db10","root","admin");
					System.out.println("connected successfully");
					Scanner scr=new Scanner(System.in);
					System.out.println("Enter the empid");
					int empid=scr.nextInt();
					System.out.println("Enter the name");
					String empname=scr.next();
					System.out.println("Enter the salary");
					int salary=scr.nextInt();
					System.out.println("Enter the age");
					int age=scr.nextInt();
	
				/*create the statement
					Statement pstmt=con.createStatement();
				    PreparedStatement pstmt=con.preparedStatement(sql);
					String sql="insert into employee values(?,?,?,?)";
					pstmt=setInt(1,empid);
					pstmt=setString(2,empname);
					pstmt=setInt(3,salary);
					pstmt=setInt(4,age);
					int i=pstmt.executeUpdate();
					pstmt.close();
					con.close();
				*/	
					
					
					Statement stmt=con.createStatement();
					//String sql="insert into db10.employee values(107,'arpita sj',40000,26)";
					//String sql="delete from db10.employee where empid=101";
					//String sql="select empname from db10.employee";
					String sql="insert into db10.employee values("+empid+",'"+empname+"',"+salary+","+age+")";
					//exicute sql queries
					int i=stmt.executeUpdate(sql);
					System.out.println("the value of inserted rows are"+i); 
					
					ResultSet rs=stmt.executeQuery(sql);
					while(rs.next()) {
						System.out.println("empid"+rs.getInt(1)+"empname"+rs.getString(10)+"salary"+rs.getInt(3)+"age"+rs.getInt(3));
						//System.out.println("empname"+rs.getString(1));
					}
					
					//close connection and statement
					stmt.close();
					con.close();
		}catch(ClassNotFoundException | SQLException e) {
	e.printStackTrace();
	}

}
}
