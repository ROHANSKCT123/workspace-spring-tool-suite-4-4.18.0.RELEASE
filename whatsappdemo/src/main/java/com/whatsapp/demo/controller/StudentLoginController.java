package com.whatsapp.demo.controller;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whatsapp.demo.model.StudentLogin;
import com.whatsapp.demo.service.StudentLoginService;
@RestController
@RequestMapping("/user")
public class StudentLoginController {
	
	@Autowired
	StudentLoginService objser;
	@PostMapping("/log")
	public String login(@RequestBody Map<String,String>loginData)
	{
		String usrname=loginData.get("username");
		String psword=loginData.get("password");
		String result=objser.checkLogin(usrname,psword);
		return result;
	}
	@PutMapping("/put")
	public StudentLogin putUser(@RequestBody StudentLogin cl)
	{
		return objser.putUser(cl);
	}
	@PostMapping("/add")
	public StudentLogin AddUser(@RequestBody StudentLogin cl)
	{
		return objser.addUser(cl);
	}

	@GetMapping("/")
	public List<StudentLogin> listAll()
	{
		return objser.getUser();
	}

}