package com.academybank;

import org.hibernate.validator.constraints.NotEmpty;

public class Eligibilty {
	
	@NotEmpty(message = "This is a mandatory field.")
	String accountype;
	
	@NotEmpty(message = "This is a mandatory field.")
	String initialdeposit;
	
	@NotEmpty(message = "This is a mandatory field.")
	String directdeposit;
	
	@NotEmpty(message = "This is a mandatory field.")
	String cardtype;
	
	@NotEmpty(message = "This is a mandatory field.")
	String loanamount;
	
	@NotEmpty(message = "This is a mandatory field.")
	String creditscore;
	
	
	
	public String getAccountype() {
		return accountype;
	}
	public void setAccountype(String accountype) {
		this.accountype = accountype;
	}
	public String getInitialdeposit() {
		return initialdeposit;
	}
	public void setInitialdeposit(String initialdeposit) {
		this.initialdeposit = initialdeposit;
	}
	public String getDirectdeposit() {
		return directdeposit;
	}
	public void setDirectdeposit(String directdeposit) {
		this.directdeposit = directdeposit;
	}
	public String getCardtype() {
		return cardtype;
	}
	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}
	public String getLoanamount() {
		return loanamount;
	}
	public void setLoanamount(String loanamount) {
		this.loanamount = loanamount;
	}
	public String getCreditscore() {
		return creditscore;
	}
	public void setCreditscore(String creditscore) {
		this.creditscore = creditscore;
	}
	
	
	

}
