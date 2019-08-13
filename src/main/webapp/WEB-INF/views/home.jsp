<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Donuts</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/spacelab/bootstrap.min.css" />
</head>
<body>
	<div class="container">
		<table class= "table">
			<thead>
				<tr>
					<th>ID</th>
					<th>Donut</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ donuts}" var="donut">
					<tr>
						<td>${ donut.id }</td>
						<td><a href="/donut?id=${ donut.id }">${ donut.name }</a></td>
						
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>