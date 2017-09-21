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

import com.academybank.Constants;
import com.academybank.Eligibilty;
import com.academybank.Income;
import com.academybank.dao.IncomeDAO;

@Controller
@RequestMapping("/income")
public class IncomeController{
 
	@RequestMapping(method=RequestMethod.GET)
	public String login(Map<String, Object> model, HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		System.out.println("IncomeController - GET");
		Income income=new Income();
		model.put("income",income);
		System.out.println("Opening Income Page - IncomeController GET - Successful");
		return "IncomePage";
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String viewLogin(@Valid @ModelAttribute("income") Income income,BindingResult result, Map<String, Object> model) {
		System.out.println("POST Income method");	
		if(result.hasErrors()){
			return "IncomePage";
		}
		
		ApplicationContext context =  new ClassPathXmlApplicationContext(Constants.BEAN_FILE_LOCATION);
	    IncomeDAO vDAO = (IncomeDAO) context.getBean(Constants.INCOME_DAO);
	    vDAO.insert(income);
	    
	    ((AbstractApplicationContext)context).close();
		Eligibilty coverage = new Eligibilty();
		model.put("eligibility", coverage);
        return "EligibilityPage";
    }
 
	
}
