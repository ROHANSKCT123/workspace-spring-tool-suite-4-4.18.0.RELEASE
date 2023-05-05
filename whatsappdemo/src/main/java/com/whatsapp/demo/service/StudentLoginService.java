package com.whatsapp.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whatsapp.demo.repository.StudentLoginRepository;
import com.whatsapp.demo.model.StudentLogin;
@Service
public class StudentLoginService {

	@Autowired
	private StudentLoginRepository objrepo;
	public String checkLogin(String username,String password)
	{
		StudentLogin user= objrepo.findByusername(username);
		if(user==null)
		{
			return "No user found";
		}
		else
		{
			if(user.getPassword().equals(password))
			{
				return "Login Succesfull";
			}
			else
			{
				return "Login Failed";
			}
		}
	} 
	public StudentLogin addUser(StudentLogin cl)
	{
		return objrepo.save(cl);
	}
	public List<StudentLogin> getUser()
	{
		return objrepo.findAll();
	}
	public StudentLogin putUser(StudentLogin cl)
	{
		return objrepo.save(cl);
	}
}
