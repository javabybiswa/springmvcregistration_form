package com.naresh.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
//@RequestMapping("/user")
public class UserController {
	@GetMapping("/login")
	public String loadLoginPage() {
		return "login";
	}

	

	@PostMapping("/logincheck")
	public String validationOfUserDetails(Model model, HttpServletRequest request) {

		String name = request.getParameter("name");
		String pwd = request.getParameter("pwd");

		// JPA Module
		// Find

		if ("abc".equalsIgnoreCase(name) && "abc".equalsIgnoreCase(pwd)) {
			model.addAttribute("validationMessage", "Welcome to Spring Training");
		} else {
			model.addAttribute("validationMessage", "Invalid Crdentials");
		}
		return "success";
	}

}