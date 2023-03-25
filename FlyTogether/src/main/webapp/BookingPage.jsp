<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking</title>
</head>
<style>
h1 {
	text-align: center;
}
</style>
<body bgcolor="#">
	<h1>Welcome to the FlyTogether ticket booking portal</h1>
	
		<div style="border:5px solid black;width:25%;border-radius:20px;padding:20px">
<form action="Booking" method="get">
	
		<table border="1"
			style="border: 1px solid black; margin-left: auto; margin-right: auto;">
			<tr>
			<td>
			<label for="start">Date of traveling:</label></td>
			<td> <input type="date"
			id="start" name="date" value="2023-03-01" min="2023-01-01"
			max="2023-04-01">
			</td>
			</tr></table><br>
			<label for=name>Name :-</label> <input type=text name=name><br><br>
	<label for=emailid>EmailID :-</label> <input type=text name=emailid /><br><br>
	<label for=source>From :-</label> <input type=text name=source /><br><br>
	<label for=destination>To :-</label> <input type=text name=destination /><br><br>
	<label for=numofpass>Seats :-</label> <input type=number name=numofpass /><br><br>
	<input type=submit value=submit /> 
	</form></div>
	
	
</body>
</html>