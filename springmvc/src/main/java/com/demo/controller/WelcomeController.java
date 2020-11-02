package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@RequestMapping("/welcome.do")
	public ModelAndView welcomeAll()
	{
		String message="Hi Welcome to MVC DEMO!";
		ModelAndView modelAndView =new ModelAndView("welcome","welcomeModel",message);
		
		return modelAndView;
	}

}
