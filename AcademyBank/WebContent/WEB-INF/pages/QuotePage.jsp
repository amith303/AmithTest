<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Academy Bank Account Quote</title>
</head>
<body bgcolor="#8FBC8F">
<img  width=150px; height=150px; style="padding-bottom:50px" src="<%=request.getContextPath()%>/images/bank_r.png"/>
<div ALIGN="center">
	<form>
	
	<table align="center">
		<tr>
			<td style="font:18px verdana">Loan Interest  Information</td>		
		</tr>
		<tr>
			<td>Congratulations. Your Application for Academy Bank Account is successfully submitted Kindly note the application number is: ${eligibility['appno']}</td>
		</tr>
		<tr>
			<td> Additionally, your are eligible for loan amount selected with Interest rate of: ${eligibility['quotevalue']} %</td>
		</tr>
		<tr>
			<td align="center">
			<input type="button" value="Close" onclick="window.location='/AcademyBank/welcome'"/>
			</td>
		</tr>
	</table>		
	</form>
</div>
</body>
</html>