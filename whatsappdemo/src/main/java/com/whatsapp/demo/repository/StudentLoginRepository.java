package com.whatsapp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.whatsapp.demo.model.StudentLogin;

public interface StudentLoginRepository extends JpaRepository<StudentLogin, Integer>
{
	StudentLogin findByusername(String username);
}



