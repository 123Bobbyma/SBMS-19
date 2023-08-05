<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error {
	color: red;
	font-style: italic;
}
</style>
</head>
<body>
	<h3>USER REGISTRATION FORM</h3>
	<form:form action="register" modelAttribute="user" method="post">
		<table>
			<tr>
				<td>Username :</td>
				<td><form:input path="userName" />
				 <form:errors path="userName" cssClass="error" /></td>

			</tr>
			<tr>
				<td>Password :</td>
				<td><form:password path="pwd" />
				<form:errors path="pwd" cssClass="error" /></td>

			</tr>
			<tr>
				<td>Email :</td>
				<td><form:input path="email" />
				<form:errors path="email" cssClass="error" /></td>

			</tr>
			<tr>
				<td>Mobile Number :</td>
				<td><form:input path="phone" />
				<form:errors path="phone" cssClass="error" /></td>

			</tr>
			<tr>
				<td>Age :</td>
				<td><form:input path="age" />
				<form:errors path="age" cssClass="error" /></td>

			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="register"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>