<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>
	<h1>Admin Login Page</h1>
	<div style="border:3px solid black;width:25%;border-radius:20px;padding:20px">
<form action="AdminLogin" method="get">
	<label for=username>Username :-</label> <input type="text" name=username /><br><br>
	<label for=pass>Password :-</label> <input type="password" name=password /><br><br>
	<input type=submit value=Login /> 
</form>
</div>


	
</body>
</html>