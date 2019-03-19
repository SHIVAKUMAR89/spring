package com.spring;

import java.util.*;

import org.hibernate.*;
import org.hibernate.SessionFactory;

public class EmployeeDAO {
	

	public boolean addUsers(int userId, String pwd) {

		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		LoginDetails checkObject = session.get(LoginDetails.class, userId);

		if (checkObject == null) {
			LoginDetails login = new LoginDetails();
			login.setUserId(userId);
			login.setPassword(pwd);

			session.save(login);
			tx.commit();
			session.close();
			return true;
		} else {
			return false;
		}

	}
	
	
	public void addCustomer(Customer  customer) {

		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

			session.save(customer);
			tx.commit();
			session.close();
			}
	
	public List<LoginDetails>  getUserIds() {
		
		List<LoginDetails>  userIds = new ArrayList<LoginDetails> ();
		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = factory.openSession();
		
		userIds=session.createQuery("select userId from LoginDetails").list();
		session.close();
			
		return userIds;
		
	}
	
	
public List<Customer>  getCustomers() {
		
		List<Customer>  customers = new ArrayList<Customer> ();
		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = factory.openSession();
		
		customers=session.createQuery("from Customer").list();
		session.close();
			
		return customers;
		
	}


public List<Customer>  getCustomers(int userId) {
	
	List<Customer>  customers = new ArrayList<Customer> ();
	SessionFactory factory = HibernateUtil.getSessionFactory();

	Session session = factory.openSession();
	
	customers=session.createQuery("from Customer where userId='"+userId+"'").list();
	session.close();
		
	return customers;
	
}

public boolean insertdata(String username, String pwd) {

	SessionFactory factory = HibernateUtil.getSessionFactory();
	
	Session session = factory.openSession();
	Transaction tx = session.beginTransaction();
	
	LoginDetails Login  = new LoginDetails();
	Login.setUserId(Integer.parseInt(username));
	Login.setPassword(pwd);

	session.save(Login);
	
	tx.commit();
	session.close(); 
	return true;
}
}
