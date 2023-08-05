<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
 .error{
    color: red;
  }
</style>
</head>
<body>
	<h1>WELCOME TO STUDENT FORM REGISTRATION</h1>


	<c:form action="register" modelAttribute="student" method="post">
		<table>
			<tr>
			<td>Student Name :</td>
			 <td><c:input path="sName" />
			  <c:errors path="sName" cssClass="error"></c:errors> </td>
			</tr>
			<tr>
			<td>Student Course :</td>
			 <td><c:input path="sCourse" /></td>
			</tr>
			<tr>
			<td>Student Age :</td>
			 <td><c:input path="sAge" /></td>
			</tr>
			<tr>
			<td>Student Email :</td>
			 <td><c:input path="sEmail" /></td>
			</tr>
			<tr>
			<td>Student Phone No :</td>
			 <td><c:input path="sPhone" /></td>
			</tr>
			<tr>
			<td></td>
			<td> <input type="submit" value="Submit"> </td>
			</tr>
		</table>
	</c:form>

</body>
</html>