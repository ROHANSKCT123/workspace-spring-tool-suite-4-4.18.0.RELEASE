
package com.whatsapp.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whatsapp.demo.model.Individual;
import com.whatsapp.demo.repository.IndividualRepository;



@Service
public class IndAchieveService {
	
	@Autowired
	IndividualRepository indrepo;
	public Individual saveAuthor(Individual ind)
	{
		return indrepo.save(ind);
	}
	public List<Individual> getAllAuthors()
	{
		return indrepo.findAll();
	}

}
