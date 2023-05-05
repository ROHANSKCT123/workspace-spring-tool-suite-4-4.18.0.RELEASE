package com.whatsapp.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.whatsapp.demo.model.Student;

import com.whatsapp.demo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studService;
	
	@GetMapping(value="/fetchStudents")
	public List<Student> getAllStudent()
	{
		List<Student>studList=studService.getAllStudents();
	    return studList;
	} 
	//http://localhost:9080/saveStudent
	
	@PostMapping(value="/saveStudent")
	 public Student saveStudent(@RequestBody Student s)
	{
		return studService.saveStudent(s);
	} 

	@PutMapping(value="/updateStudent")
	public Student updateStudent(@RequestBody Student s)
	{
		return studService.saveStudent(s);
	}
	@DeleteMapping("/deleteStudent/{rno}")
	public void deleteStudent(@PathVariable("rno") int regno)
	{
		 studService.deleteStudent(regno);
	}
	@GetMapping("/sortStudents/{field}")
	public List<Student> sortStudents(@PathVariable String field)
	
	{
	     return studService.sortStudents(field);	
	}
	
	@GetMapping("/descsortStudents/{field}")
	public List<Student> sortdscStudent(@PathVariable String field)
	{
		return studService.sortdscStudent(field);

	}
	
	@GetMapping("/pagingStudents/{offset}/{pageSize}")
	public Page<Student> pagingStudent(@PathVariable("offset") int offset,@PathVariable("pageSize") int pageSize)
	{
		return studService.pagingStudent(offset, pageSize);

	}
	
	@GetMapping("/pagingAndSortingStudents/{offset}/{pageSize}/{field}")

	public List<Student> pagingAndSortingEmployees(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field) 
	{
		return studService.pagingAndSortingEmployees(offset, pageSize, field);
	}
	@GetMapping("/fetchStudentsByNamePrefix/{prefix}")
	public List<Student> fetchStudentsByNamePrefix(@PathVariable String prefix)
	{
		  return studService.fetchStudentsByNamePrefix(prefix);
	}
	@GetMapping("/saveStudentByNameSufix/{Sufix}")
	public List<Student> saveStudentByNameName(@PathVariable String Sufix)
	{
		return studService.saveStudentByNameSufix(Sufix);
	}
	@GetMapping("/getStudentsByDepartment/{dept}/{name}")
	public List<Student>fetchStudentsByDepartment(@PathVariable String dept,@PathVariable String name)
	{
		return studService.getStudentsByDepartment(dept,name);
	}
	@DeleteMapping("/deleteStudentByName/{name}")
	public String deleteStudentByName(@PathVariable String name)
	{
	int result=studService.deleteStudentByName(name)	;
	if(result >0)
		return "Student record deleted";
	else
		return "Problem occured while deleting";
	}
	@PutMapping("/update/{dept}/{name}")
	public String  updateStudentByName(@PathVariable("dept") String department,@PathVariable("name") String name)
	{
		int res=studService.updateStudentByName(department,name);
		if(res>1)
			return "not updated";
		else
			return "updated";
	}
	@GetMapping("/fetchTeamByLoses/{email}")
	public List<Student> fetchTeamByLoses(@PathVariable String  email)
	{
		return studService.fetchTeamByLoses(email);
	}
}