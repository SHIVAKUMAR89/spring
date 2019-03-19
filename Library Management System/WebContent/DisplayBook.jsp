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


<table border=1>
<tr>
<th>Book Code</th><th>Book Name</th><th>Author</th><th>Publication</th><th>Subject</th><th>No. of Copies</th><th>
</tr>

<%
	ArrayList<BooksInfo> al=(ArrayList)request.getAttribute("books");

	Iterator<BooksInfo> it=al.iterator();
	while(it.hasNext()){		
		BooksInfo d= (BooksInfo)it.next();%>
		
		<tr>
		<td><%=d.getCode() %></td>
		<td><%=d.getBookName() %></td>
		<td><%=d.getAuthor() %></td>
		<td><%=d.getPublication() %></td>
		<td><%=d.getSubject() %></td>
		<td><%=d.getNoOfCopies() %></td>
		<td><a href="ReserveBookServlet?code=<%=d.getCode()  %>">Reserve</a>
		<a href="CancelBookServlet?code=<%=d.getCode() %>">Cancel</a></td>
		</tr>
			
<% 	}	%>



</table>

</body>
</html>