package com.whatsapp.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whatsapp.demo.model.Person;
import com.whatsapp.demo.repository.PersonRepository;

@Service
public class PersonService 
{
	@Autowired
	PersonRepository prepo;
	public List<Person> getPerson()
	{
		return prepo.findAll();
	}
	public Person postPerson(Person p)
	{
		return prepo.save(p);
	}

}
