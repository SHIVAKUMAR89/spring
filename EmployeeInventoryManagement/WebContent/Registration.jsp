<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><b>Employee Inventory Management System</b></center>
	<h1>Registration Form</h1>
	<form method="post"  action="Detaile.jsp" onsubmit="return validate()">
	<script>String username = request.getParameter("username");
	System.out.println(username);
	</script>
	
	User Name :
	<input type="text" autofocus name="name" id="name" placeholder="Full Name" /><br /><br />
	<span id='nameError'></span>
	User Password:
	<input type="password" name="password" placeholder="Password" size="10" ><br /><br />

	Gender:
	<input type="radio" name="gender" value="Male" class="gender" checked/>Male
	<input type="radio" name="gender" value="Female" class="gender"/>Female
	<span id='genderError'></span>
	<br /><br />
	cities :
	<input type="checkbox" name="city" class="city" value="Bangalore"/>Bangalore
	<input type="checkbox" name="city" class="city" value="Mysore"/>Mysore
	<input type="checkbox" name="city" class="city" value="Mumbai"/>Mumbai
	<input type="checkbox" name="city" class="city" value="Pune"/>Pune
	<span id='cityError'></span>
	<br /><br />
	Address:
	<textarea name="address" ></textarea><br /><br />
	technologies :
	<select name="technology">
		<option value="PHP" selected>PHP</option>
		<option value="HTML">HTML</option>
		<option value="CSS">CSS</option>
		<option value="Javascript">Javascript</option>
	</select></br /><br />
	<input type="submit" value="Submit Form">
	
	</form>
	<script type=text/javascript>
	function validate(){
		var name=document.getElementById("name").value;
		var flagName=nameValidate(name);
		var gender=document.getElementsByClassName("gender");
		var flagGender=genderValidate(gender);
		var gender=document.getElementsByClassName("city");
		var flagCity=cityValidate(city);
		
		if(flagName && flagGender && flagCity)
			return true;
		else
			//document.getElementById("nameError").innerHtml="Name can only char";
		//document.getElementById("nameError").style.color="red";
			return false;
	}
	function nameValidate(name){
		if(name.match("^[A-Za-z]+$"))
			
		return true;
		else
			document.getElementById("nameError").innerHtml="Name can only char";
		document.getElementById("nameError").style.color="red";
			return false;
		
	}
	function genderValidate(gender){
		var flag=false;
		for(var i=0;i<gender.length;i++){
			if(gender[i].checked){
				flag=true;
				break;
				
			}
			
			}
		
	 if(!flag){
			document.getElementById("genderError").innerHtml="choose gender";
			document.getElementById("genderError").style.color="red";
		}
		return flag;
	}
	
	function cityValidate(city){
		var flag=false;
		for(var i=0;i<city.length;i++){
			if(city[i].checked){
				flag=true;
				break;
				
			}
			
			}
	
		if(!flag){
			document.getElementById("cityError").innerHtml="choose city name";
			document.getElementById("cityError").style.color="red";
		}
		return flag;
	}
	
	System.out.println(ctx.getInitParameter("context"));
	</script>
</body>
</html>