package com.reactjs.backend.RestController;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Backend.Service.AddressServiceData;
import com.example.Backend.model.Address;

@RestController
@RequestMapping("/user")

public class UserRestController {

	@Autowired
	 addressServiceDataObj;
	
	@GetMapping("/alladdress")
	public ResponseEntity<List<Address>> getAllAddress(){
		
		List<Address> addressList= new ArrayList<>();
		addressList= addressServiceDataObj.GetAllAddress();
		return ResponseEntity.ok(addressList);
		
	}

}
