package com.twitter11.demo.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwitterLoginContoller {
	@GetMapping("/login")
	public String Login()
	{
		return "Login..!!";
	}
}
