package com.academybank.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.academybank.Applicant;
import com.academybank.Constants;
import com.academybank.Login;
import com.academybank.dao.LoginDAO;

@Controller
@RequestMapping("/login")
public class LoginController{
 
	private ApplicationContext context;

	@RequestMapping(method=RequestMethod.GET)
	public String login(Map<String, Object> model, HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		System.out.println("LoginController GET method");
		Login login=new Login();
		model.put("login",login);
		System.out.println("Opening Login Page - LoginController Get - Successful");
		return "LoginPage";
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView viewLogin(@Valid @ModelAttribute("login") Login login,BindingResult result, Map<String, Object> model) {				
		if (result.hasErrors()) {
			ModelAndView model1 = new ModelAndView("LoginPage","errval", " ");
			return model1;
		}
		Applicant a = new Applicant();
		model.put("applicant", a);
		
		context = new ClassPathXmlApplicationContext(Constants.BEAN_FILE_LOCATION);
		
	    LoginDAO lDAO = (LoginDAO) context.getBean("logindao");

	    String strusername = login.getUsername();
		String strpassword = login.getPassword();
	    
		
		if(!lDAO.findbyuser(strusername, strpassword)){
			System.out.println("Username or Password is not correct");
			ModelAndView model1 = new ModelAndView("LoginPage","errval", "Invalid credentials!");
			System.out.println("Back to Login Page - LoginController POST - Successful");
			return model1;
		}
		
		ModelAndView model1 = new ModelAndView("ApplicantPage");
		System.out.println("Opening ApplicantPage Page - LoginController POST - Successful");
		return model1;
    }
 
	
}
