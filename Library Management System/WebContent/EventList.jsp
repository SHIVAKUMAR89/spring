<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.*,com.beans.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Event List</title>
</head>
<body>

<form>

<table border=1>
<tr>
<th>Event Name</th><th>Date</th><th>Event_MName</th><th>Event ContactNo</th><th>Event Mail</th><th>Venue</th>

</tr>

<%
	ArrayList<EventsInfo> al=(ArrayList)request.getAttribute("event");

	Iterator<EventsInfo> it=al.iterator();
	while(it.hasNext()){		
		EventsInfo d= (EventsInfo)it.next();
%>


		
		<tr>
		<td><%=d.getE_Name() %></td>
		<td><%=d.getE_Date() %></td>
		<td><%=d.getE_MName() %></td>
		<td><%=d.getContactNo() %></td>
		<td><%=d.getE_Email() %></td>
		<td><%=d.getVenue() %></td>
		
		</tr>
			
<% 	}	%>



</table>
</form>
</body>
</html>