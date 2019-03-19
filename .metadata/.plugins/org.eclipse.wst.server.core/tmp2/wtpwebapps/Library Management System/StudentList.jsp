<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.* ,com.beans.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<div class="page">
    <div class="headerpart">
	<img src="images/header.jpg" alt="oops" height="180px" width="1330px"></div>
    <div class="linkspart">
   
    <a href = "DigitalLib.jsp"><b>DigitalLibrary</b></a> &nbsp;
	
   
     <div class="dropdown">
             
	<a href = "BookList.jsp"><b>Books</b></a>

  	<div class="dropdown-content">
   	 	<a href="DisplayBooksServlet">DisplayBooks</a>
    	<a href="AddBook.jsp">AddBooks</a>
    </div>
	</div>

    <a href = "BookIssue.jsp"><b>Issued Books</b></a> &nbsp;
	
    <a href = "DisplayReservedBooks"><b>Reserved Books</b></a> &nbsp;
    
    <a href = "home.html"><b>ViewReports</b></a> &nbsp;
    
    <div class="dropdown">
             
		<a href = "home.html"><b>GenerateReports</b></a>

  		<div class="dropdown-content">
   			 <a href="StudentListServlet">StudentList</a>
    		<a href="FacultyListServlet">FacultyList</a>
  			  <a href="#">BookList</a>
 		    <a href="AddEvents.jsp">EventList</a>
 		 </div>
	</div>
	
	<a href = "LogoutServlet"><b>LOGOUT</b></a> &nbsp;
  
    </div>
  <div class="bodypart">
<form align="center">
<table border=1 >
<tr>
<th>User Name</th><th>Password</th><th>Lib Id</th><th>Reg No.</th><th>Branch</th><th>Section</th><th>Semester</th><th>Year of Admission</th>

</tr>

<%
	ArrayList<StudentsInfo> al=(ArrayList)request.getAttribute("students");

	Iterator<StudentsInfo> it=al.iterator();
	while(it.hasNext()){		
		StudentsInfo d= (StudentsInfo)it.next();
%>


		
		<tr>
		<td><%=d.getUsername() %></td>
		<td><%=d.getPassword() %></td>
		<td><%=d.getLibId() %></td>
		<td><%=d.getRegNo() %></td>
		<td><%=d.getBranch() %></td>
		<td><%=d.getSection() %></td>
		<td><%=d.getSemester() %></td>
		<td><%=d.getYearOfAdm() %></td>
		
		</tr>
			
<% 	}	%>



</table>
</form>
</div>
<br><br><br><br><br><br><br><br><br><br><br><br>
<div class = "footerpart">
<center>
<img src="images/facebookicon.png" alt="facebook logo" width="20" height="20">&nbsp;
    <img src="images/twittericon.png" alt="twitter logo" width="20" height="20">&nbsp;
    <img src="images/linkedinicon.png" alt="linkedin logo" width="20" height="20">
	 <br />
2019.All Copyrights Reserved
</center>
</div>


</body>
</html>