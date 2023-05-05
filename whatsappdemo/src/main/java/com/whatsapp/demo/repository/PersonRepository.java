package com.whatsapp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.whatsapp.demo.model.Person;

public interface PersonRepository extends JpaRepository<Person,Integer> 
{
      
}
