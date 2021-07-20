<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: powderblue;">
	<div style="display: flex; justify-content: space-around">

		<form action="/employee/editSave" method="post">
			<table>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr>
					<td>First Name</td>
					<td><input type="text" name="fastName" /></td>

				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lastName" /></td>

				</tr>

				<tr>
					<td>Email</td>
					<td><input type="text" name="Email" /></td>

				</tr>

				<tr>
					<td>Age</td>
					<td><input type="text" name="age" /></td>

				</tr>

				<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>

				</tr>

				<tr>
					<td>Telephone</td>
					<td><input type="text" name="telephone" /></td>

				</tr>

			</table>
			<button type="submit">Save</button>

		</form>
</body>
</html>