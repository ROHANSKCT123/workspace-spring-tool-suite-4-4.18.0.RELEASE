package com.whatsapp.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.whatsapp.demo.repository.StudentRepository;

import jakarta.transaction.Transactional;

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
	public List<Student> sortStudents(String field) {
         return studRepository.findAll(Sort.by(field));
	}  
	
	public List<Student> sortdscStudent(String field) {
		return studRepository.findAll(Sort.by(Direction.DESC,field));
		
	}
	public Page<Student> pagingStudent( int offset, int pageSize)
	{
		Pageable paging=PageRequest.of(offset, pageSize);
		 Page<Student> studData=studRepository.findAll(paging);
		 //List<Student>studList=studData.getContent();
		 return studData;

	}

	public List<Student> pagingAndSortingEmployees(int offset,
			int pageSize,String field) {
		Pageable paging = PageRequest.of(offset, pageSize).withSort(Sort.by(field));
			Page<Student> stud=studRepository.findAll(paging);
			return stud.getContent();
		}

	 public List<Student> fetchStudentsByNamePrefix(String prefix)
	  {
		  return studRepository.findByNameStartingWith(prefix);
	  }
	
	 public List<Student> saveStudentByNameSufix(String Sufix)
	 {
	 	return studRepository.findByNameEndingWith(Sufix);
	 }
	 
	 public List<Student>getStudentsByDepartment(String dept,String name)
	 {
		 return studRepository.getStudentsByDepartment(dept,name);
	 }
	@Transactional
	public int deleteStudentByName(String name)
	{
		return studRepository.deleteStudentByName(name);
	} 
	@Transactional
	public int updateStudentByName(String dept,String name)
	{
		return studRepository.updateStudentByName(dept, name);
	}
	@Transactional
	public List<Student> fetchTeamByLoses(String email)
	{
		return studRepository.fetchTeamByLoses(email);
	}
	
    }



