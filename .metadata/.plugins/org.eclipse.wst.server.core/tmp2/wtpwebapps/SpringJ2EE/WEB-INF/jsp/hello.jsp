<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>  Hello </p>  

<!-- <form action ="submit" method="POST"> -->
<form name="helloform" action ="hello" method="POST" onsubmit="return validate()">
Name:
<input type = "text" placeholder="Enter Name" name = "username" id="user"/>
<span id = "id1"></span>
<span></span>

Password:
<input type = "text" placeholder="Enter password" name = "pwd" id="pass"/>
<span id = "id2"></span>
<span></span>

<input type = "submit" formaction="registration.jsp" /><br /><br />

</form>


User Name is:  ${name}<br /><br />

Password is:  ${pwd}

<script>
function validate(){
	var flagName=validateName(document.getElementById("user").value);
	var flagPassword=validatePassword(document.getElementById("pass").value);
	console.log(flagName && flagPassword);
	if(flagName && flagPassword){
		return true;
	}	
	else{
		return false;
	}
}

function validateName(username){
	if(username.trim()!="")
		return true;
	else{
		document.getElementById("id1").innerHTML="Enter your username."
		document.getElementById("id1").style.color='red';
		return false;
	}
}

function validatePassword(pwd){
	if(pwd.trim()!="")
		return true;
	else{
		document.getElementById("id2").innerHTML="Enter password."
		document.getElementById("id2").style.color='red';
		return false;
	}
}


	
	

</script>
</body>
</html>