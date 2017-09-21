package com.academybank.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.academybank.Applicant;
import com.academybank.Constants;
import com.academybank.Income;
import com.academybank.dao.ApplicantDAO;


@Controller
@RequestMapping("/applicant")
public class ApplicantController{
 
	@RequestMapping(method=RequestMethod.GET)
	public String applicantform(Map<String, Object> model, HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		Applicant a=new Applicant();
		model.put("applicant",a);
		System.out.println("Opening Applicant Page - ApplicantController GET - Successful");
		return "ApplicantPage";
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String applicantview(@Valid @ModelAttribute("applicant") Applicant applicant,BindingResult result, Map<String, Object> model) {
		 
		
		if(result.hasErrors()){
			System.out.println("Back to Applicant Page - ApplicantController POST - Successful");
			return "ApplicantPage";
		}
		
		ApplicationContext context;
	    context =  new ClassPathXmlApplicationContext(Constants.BEAN_FILE_LOCATION);
	    ApplicantDAO aDAO = (ApplicantDAO) context.getBean(Constants.APPLICANTS_DAO);
	    aDAO.insert(applicant);
	    System.out.println("Adding Applicant Details - ApplicantController POST - Successful");	    
	    ((AbstractApplicationContext)context).close();
		Income income = new Income();
		model.put("income", income);
		System.out.println("Going to IncomePage - ApplicantController POST - Successful");
        return "IncomePage";
    }
 
	
}
