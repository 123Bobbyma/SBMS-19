<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
table, th, td {
	border: 1px solid black;
}
</style>
<body>
	<h1>BOOK DATA</h1>
	<br>
	<table>
		<tr> 
			<th>Sr.no</th>
			<th>Book Id</th>
			<th>Book Name</th>
			<th>Book Price</th>

		</tr>
		<tr>
			<td>1</td>
			<td>${book.bookId}</td>
			<td>${book.bookName}</td>
			<td>${book.bookPrice}</td>
		</tr>

	</table>

</body>
</html>