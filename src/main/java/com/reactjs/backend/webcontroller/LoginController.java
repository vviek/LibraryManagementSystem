package com.reactjs.backend.webcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.reactjs.backend.Service.AppServiceData;

@Controller
public class LoginController {

	@Autowired
	private AppServiceData appServiceData;
	
	@GetMapping("/home")
	public String showHome() {
		return "home";
	}
	
	@GetMapping("/login")
	public String showLogin() {
		return "login";
	}
	
	@GetMapping("/register")
	public String showRegister() {
		return "register";
	}
	
	@GetMapping("/user-list")
	public String userListData() {
		return "user-data-view";
	}
	
	@GetMapping("/register-old")
	public String showOldRegister() {
		return "register_copy";
	}
	
	
	@GetMapping("/forgot")
	public String forgotPassword() {
		
		return "forgot";
	}
}
