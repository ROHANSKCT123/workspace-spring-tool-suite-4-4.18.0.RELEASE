package com.EducationLoan.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EducationLoan.demo.model.UserModel;

@Repository
public interface UserRepo extends JpaRepository<UserModel,Integer> {

}
