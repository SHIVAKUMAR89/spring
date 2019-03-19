
package com.login;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import nsp.HibernateUtil;

public class UsersDAO {

	public void addUsers(String username,String passw) {
		
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		LoginDetails Login  = new LoginDetails();
		Login.setUsername(username);
		Login.setPassword(passw);
		
		System.out.println("object "+Login);

		session.save(Login);
		
		tx.commit();
		session.close(); 
	}
}

