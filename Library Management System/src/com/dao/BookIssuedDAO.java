package com.dao;

import java.sql.*;
import java.util.ArrayList;

import com.beans.BookIssuedInfo;
import com.beans.BooksInfo;

public class BookIssuedDAO {
	public static Connection getConnection() {
		
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create the connection
			Connection con = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/db_lib","root","admin");
			System.out.println("Connected");
			return con;
		
		
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null;
		}
			
	}

	public static void insertData(BookIssuedInfo bi, Connection con) {
		String sq="insert into BooksIssued values(?,?,?,?,?)";
		PreparedStatement p;
		
		try {
			p = con.prepareStatement(sq);
			p.setLong(1,bi.getCode());
			p.setLong(2,bi.getUserId());
			p.setDate(3,bi.getIssueDatee());
			p.setDate(4,bi.getReturnDatee());
			p.setBoolean(5,bi.getReserveStatus());
			
			p.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void deleteData(long bookCode,long userId, Connection con) {
		String sq="delete from BooksIssued where BookId= ? AND LibId=?";
		PreparedStatement p;
		
		try {
			p = con.prepareStatement(sq);
			p.setLong(1,bookCode);
			p.setLong(2,userId);
			p.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public static ArrayList<BookIssuedInfo> displayReserved(Connection con){
				
		try {
			
			String sq="select * from BooksIssued where reserved=?";
			PreparedStatement p;
			p = con.prepareStatement(sq);
			p.setBoolean(1,true);
			ResultSet rs=p.executeQuery();
			
			ArrayList<BookIssuedInfo> al = new ArrayList<BookIssuedInfo>();
			
			while(rs.next()) {
				BookIssuedInfo book=new BookIssuedInfo();
				book.setCode(rs.getLong(1));
				book.setUserId(rs.getLong(2));
				book.setIssueDate(rs.getDate(3));
				book.setReturnDate(rs.getDate(4));
			
				al.add(book);
				
			}

			return al;
			
		} catch (SQLException ebook) {
			// TODO Auto-generated catch block
			ebook.printStackTrace();
			return null;
		}
		
	}

	public static ArrayList<BookIssuedInfo> displayIssued(Connection con){
		
		try {
			
			String sq="select * from BooksIssued where reserved=?";
			PreparedStatement p;
			p = con.prepareStatement(sq);
			p.setBoolean(1,false);
			ResultSet rs=p.executeQuery();
			
			ArrayList<BookIssuedInfo> al = new ArrayList<BookIssuedInfo>();
			
			while(rs.next()) {
				BookIssuedInfo book=new BookIssuedInfo();
				book.setCode(rs.getLong(1));
				book.setUserId(rs.getLong(2));
				book.setIssueDate(rs.getDate(3));
				book.setReturnDate(rs.getDate(4));
			
				al.add(book);
				
			}

			return al;
			
		} catch (SQLException ebook) {
			// TODO Auto-generated catch block
			ebook.printStackTrace();
			return null;
		}
		
	}
	
	
	
	
	public static void updateIssue(long bookCode,long userId, Connection con) {
		String sq="update BooksIssued set reserved=? where BookId= ? AND LibId=?";
		PreparedStatement p;
		
		try {
			p = con.prepareStatement(sq);
			p.setBoolean(1,false);
			p.setLong(2,bookCode);
			p.setLong(3,userId);
			p.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
