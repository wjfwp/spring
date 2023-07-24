package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping("/test/aaa")
	public ModelAndView main() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("xxx");
		mv.addObject("data", "hello월드ㅎㅎㅎ");
		
		return mv;
	}
}
