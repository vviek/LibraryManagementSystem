package com.reactjs.backend.webcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.reactjs.backend.Service.CustomUserService;
import com.reactjs.backend.model.User;

@Controller
@RequestMapping("/register/view/")
public class RegisterController {

	@Autowired
	private CustomUserService userServiceData;

	@GetMapping("/save-register")
	public String showHome(User userData, Model modelobj) {

		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode(userData.getPassword());
		System.out.println(hashedPassword);
		userData.setPassword(hashedPassword);

		boolean isDataSaved;
		isDataSaved = userServiceData.SaveUserData(userData);

		if (isDataSaved) {
			modelobj.addAttribute("message", "Registered successfully, Please Login in");
			return "login";
		}else {
			modelobj.addAttribute("message", "Failed to register , try later .");
			return "register";
		}

	}


}
