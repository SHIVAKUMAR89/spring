<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body background="images/1111.jpg">
<center><h2>Library Management System</h2></center>
<!--Once the form is submitted, all the form data is forwarded to InsertBooks.php -->

<form >

 
<table bgcolor="lightblue" border="2" align="center" cellpadding="5" cellspacing="5">

<tr>
<td> Enter Event Name:</td>
<td> <input type="text" id="eventName" name="e_Name" size="48"> </td>
</tr>
<tr><td></td><td><span id="ena"></span></td></tr>
<tr>
<td> Enter Event Date :</td>
<td> <input type="text" id="eventDate" name="e_Date" size="48" placeholder="DD/MM/YYYY"  > </td>
</tr><tr><td></td><td><span id="eda"></span></td></tr>
<tr>
<td> Enter Event Manager :</td>
<td> <input type="text" id="eventMng" name="e_MName" size="48"> </td>
</tr><tr><td></td><td><span id="mng"></span></td></tr>
<tr>
<td> Enter Contact Number: </td>
<td> <input type="text" id="contactNo" name="ContactNo" size="48"> </td>
</tr><tr><td></td><td><span id="cnt"></span></td></tr>
<tr>
<td> Enter Email : </td>
<td> <input type="text" id="eMail" name="e_EMail" size="48" placeholder="abc@fgh.aa" > </td>
</tr><tr><td></td><td><span id="em"></span></td></tr>
<tr>
<td> Enter Venue : </td>
<td> <input type="text" id="eventVenue" name="Venue" size="48"> </td>
</tr><tr><td></td><td><span id="ve"></span></td></tr>
<tr>
<td></td>
<td>
<input type="button" value="Add" onclick= "validation()">
<input type="reset" value="Reset">
</td>
</tr>
</table>

</form>



<script>
function validation(){
	flagEventName= validateEventName(document.getElementById("eventName").value);
	flagEventDate= validateEventDate(document.getElementById("eventDate").value);
	flagEventMng= validateEventMng(document.getElementById("eventMng").value);
	flagContactNo= validateContactNo(document.getElementById("contactNo").value);
	flagEMail= validateEMail(document.getElementById("eMail").value);
	flagEventVenue= validateEventVenue(document.getElementById("eventVenue").value);
	
	if(flagEventName && flagEventDate && flagEventMng && flagContactNo && flagEMail && flagEventVenue){
		return true;
	}
	else{
		return false;
	}
}

function validateEventName(eventName){
	if(eventName.trim()!=""){
		namepattern="^[A-Z a-z0-9]+$";
		if(eventName.match(namepattern)){
			
			return true;
		}
		document.getElementById("ena").innerHTML="Event name can contain only characters and numbers."
			document.getElementById("ena").style.color='red';
	return false;
		
	}
		
	else{
		document.getElementById("ena").innerHTML="Enter the event name."
		document.getElementById("ena").style.color='red';
		return false;
	}
}
function validateEventDate(eventDate){
	if(eventDate.trim()!=""){
		datepattern="(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)";
		if(eventDate.match(datepattern)){
			return true;
		}
		document.getElementById("eda").innerHTML="Event date can contain only  numbers."
			document.getElementById("eda").style.color='red';
		return false;
	}
		
	else{
		document.getElementById("eda").innerHTML="Enter the event date."
		document.getElementById("eda").style.color='red';
		return false;
	}
}
function validateEventMng(eventMng){
	if(eventMng.trim()!=""){
		mngpattern="^[A-Z a-z]+$";
		if(eventMng.match(mngpattern)){
			return true;	
	}
		document.getElementById("mng").innerHTML="Event manager can contain only  character."
			document.getElementById("mng").style.color='red';
		return false;
	}
	
		
	else{
		document.getElementById("mng").innerHTML="Enter the event manager name."
		document.getElementById("mng").style.color='red';
		return false;
	}
}
function validateContactNo(contactNo){
	if(contactNo.trim()!=""){
	nopattern="^[0-9]{10}$";
		if(contactNo.match(nopattern)){
			return true;
	}
		document.getElementById("cnt").innerHTML="user should provided 10 digits."
			document.getElementById("cnt").style.color='red';
		return false;	
	}
	
		
	else{
		document.getElementById("cnt").innerHTML="Enter the contact number."
		document.getElementById("cnt").style.color='red';
		return false;
	}
}
function validateEMail(eMail){
	if(eMail.trim()!=""){
		emailpattern="[a-z0-9]+[@]{1}[a-z]+[.]{1}[a-z]+";
		if(eMail.match(emailpattern)){
			return true;
	}
		document.getElementById("em").innerHTML="EMail can contain only  number,character,@."
			document.getElementById("em").style.color='red';
		return false;	
	}
	
	
	else{
		document.getElementById("em").innerHTML="Enter the e-mail ID."
		document.getElementById("em").style.color='red';
		return false;
	}
}
function validateEventVenue(eventVenue){
	if(eventVenue.trim()!="")
		return true;
	else{
		document.getElementById("ve").innerHTML="Enter the event venue."
		document.getElementById("ve").style.color='red';
		return false;
	}
}

</script>
</body>
</html>
