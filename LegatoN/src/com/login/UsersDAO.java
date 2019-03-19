package com.login;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UsersDAO {

	public void addUsers(int name,String passw) {
		
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		LoginDetails Login  = new LoginDetails();
		Login.setUsername(name);
		Login.setPassword(passw);
		
		System.out.println("object "+Login);

		session.save(Login);
		
		tx.commit();
		session.close(); 
	}
}
