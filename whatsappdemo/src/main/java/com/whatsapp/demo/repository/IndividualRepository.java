package com.whatsapp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.whatsapp.demo.model.Individual;

public interface IndividualRepository extends JpaRepository<Individual,Integer> {

}
