package com.EducationLoan.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EducationLoan.demo.model.LoanApplicationModel;
import com.EducationLoan.demo.repository.LoanApplicationRepo;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/applicants")
public class LoanController 
{
	@Autowired
     
	  
	public LoanApplicationRepo lrepo;
	
	@GetMapping
	public List<LoanApplicationModel> getAllApplicants(){
		return lrepo.findAll();
	}
}