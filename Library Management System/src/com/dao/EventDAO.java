package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.beans.BooksInfo;
import com.beans.EventsInfo;

public class EventDAO {

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

		public static void insertData(EventsInfo event,Connection con) {
			
			String sq="insert into Eventss values(?,?,?,?,?,?)";
			PreparedStatement p;
			
			try {
				p = con.prepareStatement(sq);
				p.setString(1,event.getE_Name());
				p.setString(2,event.getE_Date());
				p.setString(3,event.getE_MName());
				p.setString(4,event.getContactNo());
				p.setString(5,event.getE_Email());
				p.setString(6,event.getVenue());
				
				
				p.executeUpdate();
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		public static ArrayList<EventsInfo> displayData(Connection con){
			
			
			
			try {
				
				String sq="select * from Eventss";
				PreparedStatement p;
				p = con.prepareStatement(sq);
				ResultSet rs=p.executeQuery();
				
				ArrayList<EventsInfo> al = new ArrayList<EventsInfo>();
				
				while(rs.next()) {
					EventsInfo event=new EventsInfo();
					
					
					event.setE_Name(rs.getString(1));
					event.setE_Date(rs.getString(2));
					event.setE_MName(rs.getString(3));
					event.setContactNo(rs.getString(4));
					event.setE_Email(rs.getString(5));
					event.setVenue(rs.getString(6));
					
					
					al.add(event);
					
				}

				return al;
				
			} catch (SQLException ebook) {
				// TODO Auto-generated catch block
				ebook.printStackTrace();
				return null;
			}
			
		}
		
		
}