package com.sjl.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

@Controller
public class Home {
	
	@Value("${string.test}")
	private String helloMessage;

	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/show-hello")
	@ResponseBody
	public String showHelloMessage() {
		return helloMessage;
	}
	
}
