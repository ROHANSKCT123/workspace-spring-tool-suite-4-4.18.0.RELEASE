package com.whatsapp.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whatsapp.demo.model.StudentRepository;

import com.whatsapp.demo.model.Student;

@Service
public class StudentService {
	
    @Autowired
	StudentRepository studRepository;
    
    public List<Student> getAllStudents()
    {
    	List<Student> studList=studRepository.findAll();
    	return studList;
    }
    public Student saveStudent(Student s) {
    	
    Student obj=studRepository.save(s);
    
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
	
    
    
}


