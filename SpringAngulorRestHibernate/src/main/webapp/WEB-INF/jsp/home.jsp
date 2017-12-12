<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<f:form action="dashboard" method="get">
		<table>

			<tr>
				<td>User Id</td>
				<td><f:input path="userId" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><f:input path="password" /></td>
			</tr>

			<tr>
				<td><f:button>Login</f:button></td>
				<td><a href="userregistrationform"> New User click here</a></td>
			</tr>
		</table>

		<table>
			<tr>
				<td>userId</td>
				<td>${userId}</td>
			</tr>
		</table>

	</f:form>

	<!-- <a href="/userregistrationform"> New User click here</a>  -->
</body>
</html>