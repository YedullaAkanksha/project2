<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirm Booking</title>
</head>
<body bgcolor="#FFE87C">
	<h1>Welcome to the booking portal</h1>
	<h2>To confirm the flight tickets</h2>
	<h3>Proceed for payment</h3>
	
		<div style="border:5px solid black;width:25%;border-radius:20px;padding:20px">
<form action="Payment" method="get">
	
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
	<label for=phoneno>Dialno :-</label> <input type=number name=phoneno /><br><br>
	<label for=Bankname>Holding Bank :-</label> <input type=text name=Bankname /><br><br>
	<label for=cardno>Cardno :-</label> <input type=text name=cardno /><br><br>
	<input type=submit value=Pay /> 
	</form></div>
</body>
</html>