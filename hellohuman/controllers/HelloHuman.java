package com.javastack.spring.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHuman {

	
	public HelloHuman() {
		
	}
	
	@RequestMapping("/")
	public String helloHuman(
			@RequestParam(value="firstName", required=false) String firstName,
			@RequestParam(value="lastName", required=false) String lastName,
			@RequestParam(value="amount", required=false) Integer amount){
		if(amount != null && amount > 0) {
			String result = "";
			for(int i = 0; i < amount; i++) {
				if(firstName != null && lastName != null) {
					result += "Hello " + firstName + " " + lastName + " ";
				}
				else if( firstName != null) {
					result += "Hello " + firstName + " ";
				}
				else if( lastName != null) {
					result += "Hello " + lastName + " ";
				}
				else {
					result += "Hello Human ";
				}
			}
			return result;
		}
		if(firstName != null && lastName != null) {
			return "Hello " + firstName + " " + lastName;
		}
		else if(firstName != null) {
			return  "Hello " + firstName;
		}
		else if(lastName != null) {
			return  "Hello " + lastName;
		}
		return "Hello Human";
	}
}
