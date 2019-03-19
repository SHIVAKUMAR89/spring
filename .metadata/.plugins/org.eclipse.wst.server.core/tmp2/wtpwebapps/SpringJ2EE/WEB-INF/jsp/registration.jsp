<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
  <body>
  
  Hi <%=session.getAttribute("session")%>
  
  <%=application.getInitParameter("context") %>
          <form action="RegistrationServlet" >   
        
        	 User ID : <input type="text"  id="name" name="userId" value="<%=request.getParameter("username")%>" />
           
            First Name : <input type="text"  id="name" name="name"  />
            <span id="nameError"></span> <br/>
            Mobile no:
             <input type="text"  id="name" name="phoneNo"  />
            
            Gender : 
            <input type="radio" name="gender" class="gender" value="M">Male</input>
            <input type="radio" name="gender" class="gender" value="F">Female</input>
            <input type="radio" name="gender" class="gender" value="O">Others</input>
            <span id="genderError"></span>
            
            <br/>
            Languages known:

            <input type="checkbox" class="technology" name="technology" value="HTML">HTML</input>
            <input type="checkbox" class="technology" name="technology" value="CSS">CSS</input>
            <input type="checkbox" class="technology" name="technology" value="JS">JS</input>
            <span id="techError"></span>
            <br/>
            <input type="submit"/>
<a href
         </form>  
         
<script type="text/javascript">



	function validate(){
		 var name = document.getElementById("name").value;
		var gender = document.getElementsByClassName("gender");
		var technology = document.getElementsByClassName("technology");
		
		var flagName= nameValidate(name);
		var flagGender= genderValidate(gender);
		var flagTechnology= technologyValidate(technology);
		
		if( flagName && flagGender && flagTechnology)
			return true;
		else
			return false;
		
	}
	
	function nameValidate(name){
		
		if(name.match("^[A-Za-z]+$"))
		return true;
		else{
		document.getElementById("nameError").innerHTML="Name can only have chars";	
		document.getElementById("nameError").style.color="red";
		return false;	
		}
	}
	
	function genderValidate(gender){
		var flag= false;
		for(var i=0;i<gender.length;i++){
			if(gender[i].checked){
				flag=true;
				break;
			}
				
		}
		if(!flag){
			document.getElementById("genderError").innerHTML="One of the radio button has to selected";	
			document.getElementById("genderError").style.color="red";
		}
		return flag;
	}
	
	function technologyValidate(technology){
		var flag= false;
		for(var i=0;i<technology.length;i++){
			if(technology[i].checked){
				flag=true;
				break;
			}
				
		}
		console.log(flag);
		if(!flag){
			document.getElementById("techError").innerHTML="One of the checkbox has to checked";	
			document.getElementById("techError").style.color="red";
		}
		return flag;
	}
</script>
    </body>

</html>