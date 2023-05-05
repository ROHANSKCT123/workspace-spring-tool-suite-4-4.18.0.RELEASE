
package com.whatsapp.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.whatsapp.demo.model.Individual;
import com.whatsapp.demo.service.IndAchieveService;



@RestController
public class IndAchieveController {
	@Autowired
	IndAchieveService ISer;
	@PostMapping("/saveIndividual")
	public Individual saveAuthor(@RequestBody Individual a)
	{
		return  ISer.saveAuthor(a);
	}
	
	@GetMapping("/getAllAuthors")
	public List<Individual> getDetails()
	{
		return ISer.getAllAuthors();
	}
}
