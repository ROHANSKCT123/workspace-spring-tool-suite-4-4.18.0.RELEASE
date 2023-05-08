package com.EducationLoan.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.EducationLoan.demo.repository.LoanApplicationRepo;
import com.EducationLoan.demo.model.LoanApplicationModel;
@SpringBootApplication
public class EducationLoanApplication implements CommandLineRunner {

	public static void main(String[] args)
	{
		SpringApplication.run(EducationLoanApplication.class, args);
	}

	    @Autowired
	    private LoanApplicationRepo lrepo;
	    
		@Override
		public void run(String... args) throws Exception
		{
			LoanApplicationModel wrst=new LoanApplicationModel();
			wrst.setLoanId(1);
			wrst.setLoantype("House");
			wrst.setApplicantName("Rohan");
			wrst.setApplicantAddress("Gandhi Nagar");
			wrst.setApplicantMobile("123456789");
			wrst.setApplicantEmail("rohan09@gmail.com");
			wrst.setApplicantAadhaar("3676808990");
			wrst.setApplicantPan("45678");
			wrst.setApplicantSalary("800000");
			wrst.setLoanAmountRequired("10lks");
			wrst.setLoanRepaymentMonths("5months");
			lrepo.save(wrst);
		}
	

}
