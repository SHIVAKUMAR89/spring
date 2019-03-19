<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import= page "java.util*,ligin" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">
<tr>
<%
ArrayList<User> al = (ArrayList<User>)request.getAttribute("userId");
if(al.size()==0){
	%>
	<tr><td colspan="2">No Data found</td>td></tr>te>
	<%}
else{
Iterator<User> ite=al.iterator();
while(itr.hasNext()){
User cst=itr.next();
%>
<tr>
<td><%= getUserId() %></td>
<td><%= getPassword() %></td>
</tr>
<%}} %>



</table>
</body>
</html>