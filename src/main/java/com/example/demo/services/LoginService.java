package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validateUser(String name,String password) {
		
		if(name.equals("Akshay")&& password.equals("dummy")) {
		  return true;	
		}else {
			return false;
		}
	}
}
