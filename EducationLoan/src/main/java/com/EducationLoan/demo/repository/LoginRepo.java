package com.EducationLoan.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EducationLoan.demo.model.LoginModel;

@Repository
public interface LoginRepo extends JpaRepository<LoginModel,String> {

}
