<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Academy Bank Welcome</title>
</head>
<body bgcolor="#8FBC8F">
<img  width=150px; height=150px; style="padding-bottom:50px" src="<%=request.getContextPath()%>/images/bank_r.png"/>
<div ALIGN="center">
	<form>
	<table align="center">
		<tr>
		</tr>
		<tr>
		<td><h2>Welcome to Academy Bank Application</h2></td>
		</tr>
		<tr>
		<td align="center">Click <a href='<c:url value="/login" />'>here</a> to login.</td>
		</tr>
	</table>
		
	</form>
</div>
</body>
</html>