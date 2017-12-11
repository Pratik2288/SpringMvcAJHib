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
			<f:form  action="saveregistration" method="POST">
				<table>
					<tr>
						<td>User Id</td>
						<td> <f:input path="userId" id="userId"/> </td>
					</tr>
					<tr>
						<td>First Name</td>
						<td> <f:input path="firstName"id="firstName"/></td>
					</tr>
					<tr>
						<td>Middle Name</td>
						<td><input type="text" id="middleName"></td>
					</tr>
					<tr>
						<td>Last Name</td>
						<td><f:input path="lastName" id="lastName"/></td>
					</tr>
					<tr>
						<td>Gender</td>
						<td><f:radiobuttons id="Gender" path="Gender" items="${'Male':'M','Female':'F'}" />
						<%-- <f:radiobuttons path= name="Gender" id="Gender"
							checked="checked" value="M">Male <input type="radio"
							name="Gender" id="Gender" value="F">Female</td> --%>
					</tr>
					<tr>
						<td>Password</td>
						<td><f:input path="password" id="password"/></td>
					</tr>

					<tr>
						<td><f:button >Register Now</f:button></td>
						<td><a href="#"><b>Terms & Conditions</b></a></td>
					</tr>
				</table>
			</f:form>
		</div>
	</div>
</body>
</html>