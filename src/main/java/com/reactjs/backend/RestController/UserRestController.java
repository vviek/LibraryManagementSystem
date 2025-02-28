package com.reactjs.backend.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reactjs.backend.Service.AppServiceData;
import com.reactjs.backend.model.ResponseData;
import com.reactjs.backend.model.User;

@RestController
@RequestMapping("/test")
public class UserRestController {
	@Autowired
	AppServiceData appServiceData;

	@GetMapping("/alladdress/{emailId}")
	public ResponseEntity<ResponseData> getAllAddress(@PathVariable("emailId") String emailId) {
		
		
		
		if(appServiceData.findByEmailId(emailId).size()>0) {
			
			ResponseData obj=new ResponseData(true, "", "Email Address already exist");
			return ResponseEntity.ok(obj);	
			
		}else {
			ResponseData obj=new ResponseData(false, "Email Addreess not found", "");
			return ResponseEntity.ok(obj);	
		}
		
		

	}

}
