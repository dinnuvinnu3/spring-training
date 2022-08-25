package com.example.jbsjpaatm.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JspController {

	@GetMapping("/home")
	public String homePage() {
		return "home.jsp";
	}
}
