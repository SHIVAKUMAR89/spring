package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class TestEmployee {
	 public static void main(String[] args) {
	//	 BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		 
		       ApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring.xml");
				 
				 Employee e=(Employee)  beanFactory.getBean("employee");
		         
		         Employee e1=(Employee)  beanFactory.getBean("employee");
		        
		         Employee e2=(Employee)  beanFactory.getBean("employee");
		         e2.display();
		         
		         e.setName("iiht");
		         e.setAge(10);
		         
		         e1.setName("legato");
		         e1.setAge(20);
		         e.display();
		         e1.display();
		         
		         System.out.println(Employee.getCounter());
	 }

}
