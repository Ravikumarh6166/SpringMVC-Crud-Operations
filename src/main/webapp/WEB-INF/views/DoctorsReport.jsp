<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>Insert title here</title>
</head>
<body>
	<div class="container mt-3">

		<h1>Add Doctors Form</h1>
		<a href="addDoctors" class="btn btn-primary"> Add Doctors </a>
		<div class="row">

			<table class="table table-hover">
				<thead>
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Name</th>
						<th scope="col">Department</th>
						<th scope="col">Salary</th>
						<th scope="col">Address</th>
						<th scope="col">Edit</th>
						<th scope="col">Delete</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="doc" items="${doctors}">
						<tr>
							<td class="table-plus">${doc.id}</td>
							<td>${doc.name}</td>
							<td>${doc.department}</td>
							<td>${doc.salary}</td>
							<td>${doc.address}</td>

							<td><a href="editDoctors/${doc.id}" class="btn btn-warning">
									Edit </a></td>
							<td><a href="deleteDoctors/${doc.id}" class="btn btn-danger">
									Delete </a></td>
						</tr>
					</c:forEach>

				</tbody>
				
			</table>
			
		</div>
	</div>

</body>
</html>