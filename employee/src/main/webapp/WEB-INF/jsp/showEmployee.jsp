<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee List</title>
</head>
<body>
	<h1>Employees List</h1>
	<div style="display: flex; justify-content: space-around">

		<div>
			<h1>
				<a href="index.jsp">back</a>
			</h1>
		</div>



		<div>
			<table border="1" style="background-color: rgb(153, 204, 0);">
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>password</th>
					<th>age</th>
					<th>email</th>
					<th>telephone</th>
					<th>Delete</th>
					<th>Edit</th>
				</tr>


				<c:forEach var="emp" items="${list}">
					<tr>
						<td>${emp.fastName}</td>
						<td>${emp.lastName}</td>
						<td>${emp.password}</td>
						<td>${emp.age}</td>
						<td>${emp.email}</td>
						<td>${emp.telephone}</td>
						<td><a href="/employee/delete/${emp.email}">Delete</a></td>
						<td><a href="/employee/edit/${emp.email}">Edit</a></td>

					</tr>
				</c:forEach>

			</table>
		</div>
</body>
</html>