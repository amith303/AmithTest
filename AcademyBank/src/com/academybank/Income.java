package com.academybank;



import org.hibernate.validator.constraints.NotEmpty;

public class Income {
	
	@NotEmpty(message = "Please enter your SSN number.")
	String ssnum;
	
	@NotEmpty(message = "Please enter your incomemmode.")
	
	String incomemode;
	
	@NotEmpty(message = "Please enter your Annualincome.")
	String annualincome;
	
	@NotEmpty(message = "Please enter your houseinfo.")
	String houseinfo;
	
	@NotEmpty(message = "Please enter your lease amount")
	
	String leaseamount;
	
	public String getSsnum() {
		return ssnum;
	}
	public void setSsnum(String ssnum) {
		this.ssnum = ssnum;
	
	}
	public String getIncomemode() {
		return incomemode;
	}
	public void setIncomemode(String incomemode) {
		this.incomemode = incomemode;
	}
	public String getAnnualincome() {
		return annualincome;
	}
	public void setAnnualincome(String annualincome) {
		this.annualincome = annualincome;
	}
	public String getHouseinfo() {
		return houseinfo;
	}
	public void setHouseinfo(String houseinfo) {
		this.houseinfo = houseinfo;
	}
	public String getLeaseamount() {
		return leaseamount;
	}
	public void setLeaseamount(String leaseamount) {
		this.leaseamount = leaseamount;
	}

}
