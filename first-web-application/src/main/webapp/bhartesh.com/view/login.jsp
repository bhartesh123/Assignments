<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bhartesh's Server</title>
<%
System.out.println("This is called Scriplet");
%>
</head>
<body>
<p><font color="red">${Error}</font></p>
Click The below link to display HelloWorld

<form action="/login.do" method="post">
Enter Name to Display Welcome Message<input type="text" name="name">
Password: <input type="password" name="password">
<input type="submit" value="Click This ">
</form>
</body>
</html>