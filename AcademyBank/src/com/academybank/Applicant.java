package com.academybank;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Applicant {
	@NotEmpty(message = "Please enter your First Name.")
	String applfirstname;
	
	String applmidname;
	
	@NotEmpty(message = "Please enter your Last Name.")
	String appllastname;
	
	@NotEmpty(message = "Please enter your Address.")
	String appaddrline1;
	String appaddrline2;
	
	@NotEmpty(message = "Please enter your City.")
	String city;
	
	@NotEmpty(message = "Please enter your Zip Code.")
	@Size(min = 5, max = 5, message = "Your Zip Code must be 5 characters")
	String zipcode;
	
	@NotEmpty(message = "Please enter your State.")
	String state;
	
	public String getApplfirstname() {
		return applfirstname;
	}
	public void setApplfirstname(String applfirstname) {
		this.applfirstname = applfirstname;
	}
	public String getApplmidname() {
		return applmidname;
	}
	public void setApplmidname(String applmidname) {
		this.applmidname = applmidname;
	}
	public String getAppllastname() {
		return appllastname;
	}
	public void setAppllastname(String appllastname) {
		this.appllastname = appllastname;
	}
	public String getAppaddrline1() {
		return appaddrline1;
	}
	public void setAppaddrline1(String appaddrline1) {
		this.appaddrline1 = appaddrline1;
	}
	public String getAppaddrline2() {
		return appaddrline2;
	}
	public void setAppaddrline2(String appaddrline2) {
		this.appaddrline2 = appaddrline2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

}
