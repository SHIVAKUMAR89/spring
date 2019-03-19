<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddBook</title>
</head>
<body bgcolor="87ceeb">
<center><h2>Library Management System</h2></center>
<!--Once the form is submitted, all the form data is forwarded to InsertBooks.php -->
<form method="post">
 
<table border="2" align="center" cellpadding="5" cellspacing="5">
<tr>
<td> Enter BookId :</td>
<td> <input type="text" name="isbn" size="48"> </td>
</tr>
<tr>
<td> Enter BookName :</td>
<td> <input type="text" name="title" size="48"> </td>
</tr>
<tr>
<td> Enter Author :</td>
<td> <input type="text" name="author" size="48"> </td>
</tr>
<tr>
<td> Enter Publication :</td>
<td> <input type="text" name="edition" size="48"> </td>
</tr>
<tr>
<td> Enter Branch: </td>
<td> <input type="text" name="publication" size="48"> </td>
</tr>
<tr>
<td> Enter No of Copies: </td>
<td> <input type="text" name="publication" size="48"> </td>
</tr>
<tr>
<td></td>
<td>
<input type="submit" value="Add">
<input type="reset" value="Reset">
</td>
</tr>
</table>
</form>


</body>
</html>