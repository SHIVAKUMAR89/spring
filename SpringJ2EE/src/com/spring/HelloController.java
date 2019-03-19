package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class HelloController {

	
	@RequestMapping("/")
	
	public String display()
	{
		HibernateUtil util=new HibernateUtil();
		util.createSessionFactory();
		return "index";
	}
	
	
	@RequestMapping("/hello")
	
	public String displayhello()
	{
		
		return "hello";
		
	}
	
	//@RequestMapping(value="/submit", method=RequestMethod.POST)
	@RequestMapping(value="/hello", method=RequestMethod.POST)
	public String displayName(@RequestParam("username") String username,@RequestParam("pwd")String pwd, Model m)
	{
		System.out.println(username); 
		System.out.println(pwd); 
		m.addAttribute("name", username);
		m.addAttribute("pwd", pwd);
		EmployeeDAO empdao = new EmployeeDAO();
		empdao.insertdata(username,pwd);
		 
		return "hello";
		
	}
	
	
	
	
}
