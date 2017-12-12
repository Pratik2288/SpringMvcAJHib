<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div style="width: 800px; margin: 0 auto;">
		<h1>New User Registration</h1>
		<div style="border-bottom-color: black; border: 2">
			<f:form action="saveregistration" method="POST">
				<table>
					<tr>
						<td>User Id</td>
						<td><f:input path="userId" /></td>
					</tr>
					<tr>
						<td>First Name</td>
						<td><f:input path="firstName" /></td>
					</tr>
					<tr>
						<td>Middle Name</td>
						<td><f:input path="middleName" /></td>
					</tr>
					<tr>
						<td>Last Name</td>
						<td><f:input path="lastName" /></td>
					</tr>
					<tr>
						<td>Gender</td>
						<td>
						    <f:radiobutton path="sex" value="M" />Male 
						    <f:radiobutton path="sex" value="F" />Female
						</td>

					</tr>
					<tr>
						<td>Password</td>
						<td><f:input path="password" /></td>
					</tr>

					<tr>
						<td><input type="submit" value="Register Now" /></td>
						<td><a href=""><b>Terms and Conditions</b></a></td>
					</tr>
				</table>
			</f:form>
		</div>
	</div>
</body>
</html>