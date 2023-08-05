<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
t<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to Book Store</h1>

	<table>



		<thead>
			<tr>Book Id
			</tr>
			<tr>Book Name
			</tr>
			<tr>Book Price
			</tr>
		</thead>
		<tbody>
			<c:forEach items=${books } var="book">
				<tr>
					<td>${book.bookId}</td>
					<td>${book.bookId}</td>
					<td>${book.bookId}</td>


				</tr>

			</c:forEach>



		</tbody>
	</table>
</body>
</html>