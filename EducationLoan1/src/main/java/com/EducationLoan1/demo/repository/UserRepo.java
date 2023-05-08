package com.EducationLoan1.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EducationLoan1.demo.model.UserModel;

public interface UserRepo extends JpaRepository<UserModel,Integer>
{

}
