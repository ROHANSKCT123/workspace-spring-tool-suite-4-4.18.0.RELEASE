package com.EducationLoan1.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EducationLoan1.demo.model.AdminModel;

public interface AdminRepo extends JpaRepository<AdminModel,String>
{

	void deleteByPassword(String password);

}
