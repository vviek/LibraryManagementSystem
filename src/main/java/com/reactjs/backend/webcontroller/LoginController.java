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
}
