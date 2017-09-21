<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
.error {
color: #ff1000;
font-style: italic;
}
</style>
<title>Academy Bank Account Home</title>
</head>
<body bgcolor="#8FBC8F">
<img  width=150px; height=150px; style="padding-bottom:50px" src="<%=request.getContextPath()%>/images/bank_r.png"/>
<div ALIGN="center">
	<form:form method="POST" action="login" commandName="login">
	<table align="center">
		<tr><td align="center"><font size="3" color="red">${errval}</font></td>
		</tr>
		<tr>
		<td>Username:</td>
		<td><form:input path="username"/></td>
		<td><form:errors path="username" cssClass="error"/></td>
		</tr>
		<tr>
		<td>Password:</td>
		<td><form:input path="password" type="password" />
		<td><form:errors path="password" cssClass="error"></form:errors></td>
		<tr>
		<td></td>
		<td align="right"><input type="submit" name="Submit" id="Submit" value="Login" />
		</td>
		</tr>
	</table>
		
	</form:form>
</div>
</body>
</html>