package com.whatsapp.demo.repository;

import com.whatsapp.demo.model.*;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> 
{
 
	//positional parameter
	@Query("select s from Student s where s.dept=?1 and s.name=?2")
	public List<Student>getStudentsByDepartment(String dept,String name);
	
	//named parameter
		@Query("select s from Student s where s.dept=?1 and s.name=?2")
		public List<Student>getStudentsByDepartment(String dept);
		
		//DML
		@Modifying
				@Query("delete from Student s where s.name=?1")
				public int deleteStudentByName(String name);
		
		@Modifying
		@Query("update  Student s set s.dept=?1 where s.name=?2")
		public int updateStudentByName(String dept, String name);

		@Query(value="select * from student  s where  s.email= ?1", nativeQuery=true)
		public List<Student> fetchTeamByLoses(String  email);
		
		
	List<Student> findByNameStartingWith(String prefix);
	List<Student> findByNameEndingWith(String suffix);
	List<Student> findByDept(String dept);
}
