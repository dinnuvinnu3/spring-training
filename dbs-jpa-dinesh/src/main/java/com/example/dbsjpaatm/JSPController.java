package com.example.dbsjpaatm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JSPController {

	@GetMapping("/home")
	public String showHome() {
		
		return "Home.jsp";
	}
	
	@GetMapping("/details")
	public String details() {
		return "Details.jsp";
	}
	
	@GetMapping("/result")
	public String result(int id, String name, Model model) {
		model.addAttribute("id",id);
		model.addAttribute("name", name);
		return "Result.jsp";
	}
}
