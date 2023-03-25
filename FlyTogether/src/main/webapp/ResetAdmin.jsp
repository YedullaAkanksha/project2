<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reset Admin</title>
</head>
<body bgcolor="#FFE87C">
<h1>Reset Admin Password</h1>
<div style="border:3px solid black;width:25%;border-radius:20px;padding:20px">
<form action="ResetAdmin" method="Get">
	<label for=email>Username:-</label> <input type="text" name=username  /><br><br>
	<label for=pass>New Password :-</label> <input type="password" name=password  /><br><br>
	<input type=submit value=Reset /> 
</form>
</div>

	
	
</body>
</html>