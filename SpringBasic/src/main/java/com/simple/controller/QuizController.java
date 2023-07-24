package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.Quiz01VO;

@Controller
@RequestMapping("/quiz")
public class QuizController {
	
	@RequestMapping("/quiz01")
	public void quiz01() {}

	@RequestMapping("/sendBirth")
	public String sendBrith(Quiz01VO vo, Model model) {
		
		System.out.println( vo.toString() );
		
		model.addAttribute("year", vo.getYear());
		model.addAttribute("month", vo.getMonth());
		model.addAttribute("day", vo.getDay());
		
		return "/quiz/quiz01_ok";
	}
	
	@RequestMapping("/quiz02")
	public void quiz02() { }
	
	@RequestMapping("/join")
	public String join(@RequestParam("id") String id,
					   @RequestParam("pw") String pw,
					   @RequestParam("name") String name,
					   @RequestParam("email") String email,
					   Model model) {
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		model.addAttribute("name", name);
		model.addAttribute("email", email);
		
		
		return "/quiz/quiz02_ok";
	}
	
	
	
	
	
	
	
	
}
