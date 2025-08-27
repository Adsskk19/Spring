package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/getch")
public class ByeController {
	
	@RequestMapping("/bye")
	@ResponseBody
	public String bye() {
		return "Bye Bye Dude..";
		
	}
//	@RequestMapping("/data")
//	public String hi3(Model model) {
//		model.addAttribute("name", "Kiran Kumar");
//		return "home";
//	}
//	
	@PostMapping("/signup")
	public String signUp(Model model,HttpServletRequest http) {
		String email = (String) http.getParameter("email");
		String password = (String) http.getParameter("password");
		model.addAttribute("email", email);
		model.addAttribute("password", password);
		return "data";
	}

}
