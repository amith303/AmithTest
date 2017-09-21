package com.academybank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/welcome")
public class WelcomeController{

	@RequestMapping(method=RequestMethod.GET)
	protected ModelAndView Welcome(){
		ModelAndView model = new ModelAndView("Welcome","command", "value");
		System.out.println("Opening Welcome Page - WelcomeController GET - Successful");
		return model;
	}

}
