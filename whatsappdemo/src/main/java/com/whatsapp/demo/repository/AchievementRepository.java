package com.whatsapp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.whatsapp.demo.model.Achievement;

public interface AchievementRepository extends JpaRepository<Achievement,Integer> {

}
