<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*,com.beans.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form>
<table border=1>
<tr>
<th>Book Code</th><th>User Id</th><th>Issue Date </th><th>Return Date</th>
</tr>

<%
	ArrayList<BookIssuedInfo> al=(ArrayList)request.getAttribute("books");

	Iterator<BookIssuedInfo> it=al.iterator();
	while(it.hasNext()){		
		BookIssuedInfo rb= (BookIssuedInfo)it.next();%>
		
		<tr>
		<td><%=rb.getCode() %></td>
		<td><%=rb.getUserId() %></td>
		<td><%=rb.getIssueDatee() %></td>
		<td><%=rb.getReturnDatee()%></td>
					
<% 	}	%>


</table>
</form>
</body>
</html>