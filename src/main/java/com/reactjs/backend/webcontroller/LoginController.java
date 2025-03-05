package com.reactjs.backend.webcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.reactjs.backend.Service.AppServiceData;

// To redirect the page to html page through urls
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
	
	@GetMapping("/userhome")
	public String userHomePage() {
		return "index";
	}
	
	
	//This code is used when we are using a file under certain folder
		/*@GetMapping("/demo")
		public String demo() {
			return "demo1/demo";
		}*/
	//Difference between the controller and rest controller
	//Controller is used to redirect the the page to html page through the urls and rest controller is used to check api through api and take the data in json format
}
