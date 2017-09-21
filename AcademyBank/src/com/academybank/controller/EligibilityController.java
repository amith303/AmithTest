package com.academybank.controller;

import java.util.HashMap;
import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;

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
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.academybank.Constants;
import com.academybank.Eligibilty;
import com.academybank.dao.EligibilityDAO;

@Controller
@RequestMapping("/eligibility")
public class EligibilityController{	
	
	@RequestMapping(method=RequestMethod.GET)
	public String login(Map<String, Object> model, HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		Eligibilty eligb=new Eligibilty();
		model.put("eligibility", eligb);	
		System.out.println("Opening Eligibility Page - EligibilityController GET - Successful");
		return "EligibilityPage";		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView viewLogin(@Valid @ModelAttribute("eligibility") Eligibilty eligb, BindingResult result) {
		System.out.println("EligibilityController - POST method");
		if(result.hasErrors())
		{
			ModelAndView model = new ModelAndView("EligibilityPage");
			System.out.println("Back to Eligibility Page - EligibilityController POST - Successful");
			return model;
		}

		ApplicationContext context;
	    context =  new ClassPathXmlApplicationContext(Constants.BEAN_FILE_LOCATION);
	    EligibilityDAO cDAO = (EligibilityDAO) context.getBean(Constants.Eligibility_DAO);
	    cDAO.insert(eligb);
	    System.out.println("Adding Eligibility Details Page - EligibilityController POST - Successful");
	    String interest_rate=calculate_Interest(eligb.getCreditscore());
	    String appno=getappno();
	    Map<String, String> vars = new HashMap<String, String>();
	    vars.put("quotevalue", interest_rate);
	    vars.put("appno", appno);
	    ((AbstractApplicationContext)context).close();
	    ModelAndView model = new ModelAndView("QuotePage","eligibility",vars);	
        return model;
    }
	public static String getappno(){
		//System.out.println("Calling Web Service to get application number - Successful");
		//String uri = "http://localhost:8080/XXXX/restapi/genappno?random=12345";
		//RestTemplate restTemplate = new RestTemplate();
	   // String result = restTemplate.getForObject(uri, String.class);
		 String result = "123456";
		return result;
	}
 public static String calculate_Interest(String credscore){
	 if (credscore.equals("good"))
	 {
		 return "8";
	 }
	 else if (credscore.equals("bad"))
	 {
		 return "16";
	 }
	 else if (credscore.equals("excellent"))
	 {
		 return "4";
	 }
	 else{
		  return "100";
	 }
	
 }
	
}
