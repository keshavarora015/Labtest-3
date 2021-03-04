<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Traniee</title>
</head>
<body>

	<form action="TranieeController.do" method="POST">
		<table>

			<tr>
				<td>Enter Trainee Name:</td>
				<td><input type="text" name="name" /></td>
			</tr>

			<tr>
				<td>Enter Branch:</td>
				<td><input type="text" name="branch" /></td>
			</tr>

			<tr>
				<td>Enter Percentage:</td>
				<td><input type="text" name="percentage" /></td>
			</tr>
		</table>

		<input type="submit" />
	</form>
	<a href="home.jsp">Want to go to HomePage? Click Here!</a>

</body>
</html>