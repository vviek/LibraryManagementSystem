package com.reactjs.backend.webcontroller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.reactjs.backend.Service.AppServiceData;
import com.reactjs.backend.Service.CustomUserService;
import com.reactjs.backend.model.User;

@Controller
@RequestMapping("/register/view/")
public class RegisterController {

	@Autowired
	private CustomUserService userServiceData;
	@Autowired
	AppServiceData appServiceData;
	@GetMapping("/save-register")
	
	//Request part is used to take the image from html file
	public String showHome(@RequestPart("userImagefile") MultipartFile file,User userData, Model modelobj) {
		
		String fileName = file.getOriginalFilename();

		try {
			file.transferTo(new File("D:\\uploads\\" + fileName));

		} catch (Exception e1) {
		
			e1.printStackTrace();
		}


		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode(userData.getPassword());
		System.out.println(hashedPassword);
		userData.setPassword(hashedPassword);
		userData.setUserImageName(fileName);
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
	@GetMapping("/allusers")
	public String getAllEmployee(Model modelObj){
		
		List<User> userList=new ArrayList<>();
		userList = appServiceData.GetAllusers();
		modelObj.addAttribute("userData",userList );
		return "user-view/user-list-view";
	}


}
