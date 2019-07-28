package com.rahul.demo.controler;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	@RequestMapping(value = "/abc", method = RequestMethod.GET)
	public String welcomeM(Map<String, Object> model){
		System.out.println("inside controleler");
		return "welcome";
	}
	@RequestMapping(value = "/abcd", method = RequestMethod.GET)
	public String welcomeM2(){
		System.out.println("inside controleler");
		return null;
	}
	@RequestMapping(value = "/abcf", method = RequestMethod.GET)
	public String welcomeM3(){
		System.out.println("inside controleler");
		 int i = 5 / 0;
		return "welcome";
	}
}
