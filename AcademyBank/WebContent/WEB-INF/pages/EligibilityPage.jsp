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
<title>Academy Bank Account Eligibility</title>
</head>
<body bgcolor="#8FBC8F">
<img  width=150px; height=150px; style="padding-bottom:50px" src="<%=request.getContextPath()%>/images/bank_r.png"/>
<div ALIGN="center">
	<form:form method="POST" action = "eligibility" commandName="eligibility">
	<table align="center">
		<tr>
		<td style="font:18px verdana">Eligibility Information</td>	
		</tr>
		<tr>
		<td align="right">Account Type:</td>
		<td><form:select path="accountype">
		<option value="check"> Checking Account </option>
		<option value="save">Savings Account</option>
		</form:select></td>
		<td><form:errors path="accountype" cssClass="error"/></td>
		</tr>
		<tr>
		<td align="right">Initial Deposit:</td>
		<td><form:input path="initialdeposit" />	</td>
		<td><form:errors path="initialdeposit"  cssClass="error" />	</td>
		</tr>
		<tr>
		<td align="right">Direct Deposit of $500 min monthly:</td>
		<td><form:radiobutton path="directdeposit" value="Yes" />Yes<form:radiobutton path="directdeposit" value="No" />No	</td>
		<td><form:errors path="directdeposit" cssClass="error" />	</td>
		</tr>
		<tr>
		<td align="right">DebitCard Type(VISA/Master/Amex):</td>
		<td><form:select path="cardtype" >
		<option value="visa">VISA</option>
		<option value="amex">AMEX</option>
		<option value="master">Master</option>
		</form:select>
		</td>
		<td><form:errors path="cardtype" cssClass="error"/></td>
		</tr>
		<tr>
		<td align="right">Loan Amount Required:</td>
		<td><form:input path="loanamount" />	</td>
		<td><form:errors path="loanamount" cssClass="error"/>	</td>
		</tr>
		<tr>
		<td align="right">Credit Score:</td>
		<td><form:select path="creditscore" >	
		<option value="bad">BAD </option>
		<option value="good">GOOD</option>
		<option value="excellent">EXCELLENT</option>
		</form:select>
		</td>
		<td><form:errors path="creditscore" cssClass="error"/>	</td>
		</tr>
		<tr>
		<td></td>
		<td><input type="button" value="Previous" style="width:85px" onclick="window.location='/BankProject/income'"/> 
		<input type="submit" name="Submit" style="width:85px" id="Submit" value="Next"/></td>
		</tr>
	</table>
		
	</form:form>
</div>
</body>
</html>