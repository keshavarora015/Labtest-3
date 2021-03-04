<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./styles/login.css">

</head>
<body>
${param.error}<br>
${param.message }<br>

<div>
<form id = "login-form" action="LoginController" method="POST" onsubmit="return validateForm()">
<table>
<tr>
<td>Enter Name:</td>
<td><input type="text" name="username"/></td>
</tr>

<tr>
<td>Enter Password:</td>
<td><input type="password" name="password"/></td>
</tr>
</table>

<input type="submit"/>
</form>

</div>

<script type="text/javascript" src="WEB-INF/views/validation.js"></script>
</body>
</html>