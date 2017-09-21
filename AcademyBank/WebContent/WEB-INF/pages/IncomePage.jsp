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
color: #ff0000;
font-style: italic;
}
</style>
<title>Academy Bank Account Income Details</title>
</head>
<body bgcolor="#8FBC8F">
<img  width=150px; height=150px; style="padding-bottom:50px" src="<%=request.getContextPath()%>/images/bank_r.png"/>
<div ALIGN="center">
	<form:form  method="POST" action = "income" commandName="income">
	<table align="center">
		<tr>
		<td style="font:18px verdana">Income Information</td>	
		</tr>
		<tr>
		<td align="right">SSN Number:</td>
		<td><form:input path="ssnum"/></td>
		<td><form:errors path="ssnum" cssClass="error"/></td>
		</tr>
		<tr>
		<td align="right">Mode of Income</td>
		<td><form:select path="incomemode" >	
		
		<option value="sal">salaried</option>
		<option value="bus">Business</option>
		<option value="self">SelfEmployment</option>
		<option value="other">Other</option>
		</form:select>
		</td>
		<td><form:errors path="incomemode" cssClass="error"/>	</td>
		</tr>
		<tr>
		<td align="right">Annual Income:</td>
		<td><form:input path="annualincome" />	</td>
		<td><form:errors path="annualincome" cssClass="error" />	</td>
		</tr>
		<tr>
		<td align="right">House Rent/Own:</td>
		<td><form:select path="houseinfo" >
		
		<option value="rent">Rent</option>
		<option value="own">Own</option>	
		
		</form:select>
		</td>
		<td><form:errors path="houseinfo" cssClass="error"/>	</td>
		</tr>
		<tr>
		<td align="right">Rent/Lease Amount:</td>
		<td><form:input path="leaseamount" />	</td>
		<td><form:errors path="leaseamount" cssClass="error" />	</td>
		</tr>
		<tr>
		<td></td>
		<td><input type="button" value="Previous" style="width:85px" onclick="window.location='/BankProject/applicant'" /> 
		<input type="submit" name="Submit" style="width:85px" id="Submit" value="Next"/></td>
		</tr>
	</table>
		
	</form:form>
</div>
</body>
</html>