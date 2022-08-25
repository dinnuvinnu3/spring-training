package com.example.dbsjpadinesh1.controller;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// import com.example.dbsjpadinesh1.service.BankService1;


@Controller
public class DbsJpaController {

//	@Autowired
//	BankService1 bankService1;
	
	@GetMapping("/home")
	public String homePage() {
		return "Home.jsp";
	}
	
	@GetMapping("/details")
	public String validate(String username, String password, Model model) {
		if(username.equals("Dinesh3") && password.equals("Dinesh@1")) {
			model.addAttribute("username", username);
			return "Details.jsp";
		}
		return "Details1.jsp";
	}
}
