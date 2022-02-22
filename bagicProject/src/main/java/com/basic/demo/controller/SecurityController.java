package com.basic.demo.controller;

import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/security/*")
@Controller
public class SecurityController {

	@GetMapping("/all")
	public String all() {
		return "home";
	}
	
	@GetMapping("/member")
	public String member() {
		return "security/member";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "security/admin";
	}
	
	@GetMapping("/accessError")
	public String error(AuthenticationSuccessHandler auth, Model model) {
		model.addAttribute("msg", "Access Demoed");
		return "common/LoginPage";
		
	}
}
