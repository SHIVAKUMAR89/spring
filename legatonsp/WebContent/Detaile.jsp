<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*,com.login.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
ArrayList al =(ArrayList)request.getAttribute("Userlist");
Iterator<UserDetail> itr = al.iterator();
while(itr.hasNext()){
	UserDetail cst=itr.next();
	//System.out.println(itr.next());
%>
<tr>
<td><%=cst.getName() %></td>
<td><%=cst.getGender() %></td>
<td><%String city="";
for(int i=0;i<cst.getCities().length;i++){
	city=city+cst.getCities()[i];
}%>
<%=city%></td>
</tr>
<%}%>

<table border=2>
<tr>
<th>Name</th><th>Password</th><th>Gender</th><th>Cities</th><th>address</th><<th>technologies</th>\
</tr>
<tr>
<td><%= request.getParameter("name")%></td>
<td><%= request.getParameter("password")%></td>
<td><%= request.getParameter("gender")%></td>
<td><%= request.getParameter("city")%></td>
<td><%= request.getParameter("address")%></td>
<td><%= request.getParameter("technology")%></td>
</tr>

</table>
</body>
</html>