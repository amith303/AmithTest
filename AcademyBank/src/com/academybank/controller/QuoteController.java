package com.academybank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/quote")
public class QuoteController{

	public ModelAndView viewLogin() {
		
		ModelAndView model = new ModelAndView("QuotePage");
		System.out.println("Opening Quote Page - QuoteController - Successful");
		
        return model;
    }
 
	
}
