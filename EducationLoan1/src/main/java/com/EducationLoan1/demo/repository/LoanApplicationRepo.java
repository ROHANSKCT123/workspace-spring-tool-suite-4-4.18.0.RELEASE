package com.EducationLoan1.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EducationLoan1.demo.model.LoanApplicationModel;

public interface LoanApplicationRepo extends JpaRepository<LoanApplicationModel,Integer>
{

}
