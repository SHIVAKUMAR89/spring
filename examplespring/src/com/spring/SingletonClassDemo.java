package com.spring;

public class SingletonClassDemo {
	
	public static void main(String[] args) {
		
		SingletonEmployee  e= SingletonEmployee.getObject("IIHT");
		
		SingletonEmployee  e1= SingletonEmployee.getObject("LEGATO");
	
			e.display();
			e1.display();
		
		System.out.println(e);
		
		System.out.println(e1);
		
	}

}
