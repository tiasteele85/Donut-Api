<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/spacelab/bootstrap.min.css" />
</head>
<body>
	<div class="container">
		<table class="table">
			<tr>

				<th>Donut</th>
				<td>${ donut.name }</td>
			</tr>

			<tr>
				<th>Calories</th>
				<td>${ donut.calories }</td>
			</tr>
			<tr>
				<th>Extras</th>
				<td><c:forEach items="${ donut.extras }" var="extra">
						<tr>
							<td>${extra }</td>
						</tr>
					</c:forEach></td>
			</tr>
			
		</table>
		<a href="/">Home</a>
	</div>
</body>
</html>