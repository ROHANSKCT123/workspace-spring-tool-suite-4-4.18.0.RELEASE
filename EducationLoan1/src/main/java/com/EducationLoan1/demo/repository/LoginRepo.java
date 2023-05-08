package com.EducationLoan1.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EducationLoan1.demo.model.LoginModel;

public interface LoginRepo extends JpaRepository<LoginModel,String>
{

	void deleteByPassword(String password);

}
