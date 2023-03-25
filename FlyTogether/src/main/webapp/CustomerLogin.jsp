<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Customer Login</title>
</head>
<body bgcolor="#FFE87C">
<h1>Customer Login Page</h1>
	
<div style="border:2px solid black;width:25%;border-radius:20px;padding:20px">
<form action="CustomerLogin" method="get">
    <table >
    <tr>
    <td><label for=username>Username</label><br></td>
    <td><input type="text" name=username /></td>
    </tr>
    <tr>
    <td><label for=password>Password</label><br></td>
    <td><input type="password" name=password /></td>
    </tr>
    
    <tr>
    <td><input type=submit value=Login /></td>
 
    </tr>
    </table>
	

	</form></div>
</body>
</html>