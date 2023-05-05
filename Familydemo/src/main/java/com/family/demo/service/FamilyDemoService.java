package com.family.demo.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.family.demo.model.FamilyDemoRepository;

import com.family.demo.model.FamilyDemo;

@Service
public class FamilyDemoService {
	
    @Autowired
	FamilyDemoRepository studRepository;
    
    public List<FamilyDemo> getAllStudents()
    {
    	List<FamilyDemo> studList=studRepository.
    	return studList;
    }
    public FamilyDemo saveFamilyDemo(FamilyDemo s) {
    	
    	FamilyDemo obj=studRepository.save(s);
    
    return obj;
    //return studRepository.save(s);
    }
    public Student updateStudent(Student s) {
    	
        Student obj=studRepository.save(s);
        
        return obj;
        //return studRepository.save(s);
        }
    public void deleteStudent(int regno) {
    	studRepository.deleteById(regno);    }
	public List<Student> sortStudents(String field) {
         return studRepository.findAll(Sort.by(field));
	}  
}