package com.whatsapp.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhatsappController {
	
	@GetMapping("/Signinpage")
	public String Signinpage()
	{
		return "Signin page is Sucessfull";
	}
	
	@GetMapping("/Landingpage/{username}")
	public String Landingpage(@PathVariable("username") String username)
	{
		return "The Landing page of the "+username;
	}
	

}
