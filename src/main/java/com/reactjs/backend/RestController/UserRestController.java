package com.reactjs.backend.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reactjs.backend.Service.AppServiceData;
import com.reactjs.backend.model.ResponseData;
import com.reactjs.backend.model.User;


//We can see the data of rest controller in json format
@RestController
@RequestMapping("/test")
public class UserRestController {
	
	//Autowired is short form of creating object without using new keyboard
	@Autowired
	AppServiceData appServiceData;

	
	//In this we see which url shows the data of it's corresponding data
	@GetMapping("/alladdress/{emailId}")
	
	//We use path variable annotation to see the specific data which is given in url
	public ResponseEntity<ResponseData> getAllAddress(@PathVariable("emailId") String emailId) {
		
		
		
		if(appServiceData.findByEmailId(emailId).size()>0) {
			
			ResponseData obj=new ResponseData(true, "", "Email Address already exist");
			return ResponseEntity.ok(obj);	
			
		}else {
			ResponseData obj=new ResponseData(false, "Email Addreess not found", "");
			return ResponseEntity.ok(obj);
		}
	}

	@GetMapping("/allusers")
	public ResponseEntity<List<User>> getAllEmployee(){
		
		List<User> UserList=new ArrayList<>();
		UserList = appServiceData.GetAllusers();
		return ResponseEntity.ok(UserList);
	}
	
	@GetMapping("/userid/{userId}")
	public ResponseEntity<Optional<User>> getEmployeeById(@PathVariable("userId") Long userId) {
		
		Optional<User> userData;
		
	    userData= appServiceData.findByUserId(userId);
	    
		return ResponseEntity.ok(userData);
	}
	
	
	//Request body is used to take large input in json format
	@PostMapping("/saveemployee")
	public Boolean saveemployeeData(@RequestBody User UserNew) 
	{
	 Boolean isDataSaved;
	 
	 isDataSaved= appServiceData.SaveUserData(UserNew);
	
	 return isDataSaved;
	}
	
	@GetMapping("/delete/{userId}")
	public  ResponseEntity<Boolean> deleteUserById(@PathVariable("userId") Long userId){
		
		Boolean isUserDataDeleted;
		
		isUserDataDeleted= appServiceData.deleteUserId(userId);
		
		return  ResponseEntity.ok(isUserDataDeleted);
	}
}
