<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.*,nsp.HibernateUtil"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String name1="jjjj";%>
<% HibernateUtil util = new HibernateUtil();
util.createSessionFactory();%>
<form method="post"  action="LoginServlet">
UserName
<input type="text" name="username" placeholder="please enter user name" id="id1" /><br>
<span id='error1'></span></br>
Password
<input type="password" name="password" id="id2" placeholder="please enter user password" />
<span id='error2'></span></br>
<input type="submit"/>

<span id="time"></span>
</form>
<script>

setInterval(getTime,1000);
function getTime(){
	document.getElementById("time").innerHTML=new Date();
	
}
/*
	    function validate(){
	    	
	    	var name=document.getElementById("id1").value;
	    	var password=document.getElementById("id2").value;
	    	var patternName="^[A-Za-z]+$";
            var patternPassword="^[A-Za-z0-9]+$";
            if(name.match(patternName)&& password.match(patternPassword))
            {
            	return true;
            	
        	   }
            else if(name.match(patternName)==null && password.match(patternPassword)==null)
            	{
            	document.getElementById("error1").innerHTML="Name can be char";
            	document.getElementById("error2").innerHTML="password can be alphanumeric ";
            	return false;
            	
            	}
            else if(name.match(patternName)==null)
            {
            	document.getElementById("error1").innerHTML="Name can only be char ";
            	document.getElementById("error2").innerHTML="";
            	return false;
            }
            else if(password.match(patternPassword)==null)
            {
            	document.getElementById("error1").innerHTML="";
            	document.getElementById("error2").innerHTML="password can be alphanumeric";
            	return false;
            }
	    }
   */
	/*    function validate(){
	var name=document.getElementById("id1").value;
	var password=document.getElementById("id2").value;	

	   if(name.trim().toLowerCase()=="admin" && password.trim()=="admin")
	   {
		   return true;
	   }
	   else if(name.trim()=="" && password.trim()=="")
		   {
		   document.getElementById("error1").innerHTML="name cannot be";
		   document.getElementById("error2").innerHTML="password cannot match";
		   return false;
		   }
	   else if(name.trim()=="")
       {
		   document.getElementById("error1").innerHTML="name cannot be";
		   document.getElementById("error2").innerHTML="";
       	return false;
       }
       else if(password.trim()=="")
       {
    	   document.getElementById("error1").innerHTML="";
		   document.getElementById("error2").innerHTML="password cannot match";
       	return false;
       }
       else
    	   {
    	   document.getElementById("error1").innerHTML="name cannot be";
		   document.getElementById("error2").innerHTML="password cannot";
		   return false;
    	   }
    	   }
   	  */
</script>

</body>
</html>