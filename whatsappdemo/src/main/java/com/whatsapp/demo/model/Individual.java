package com.whatsapp.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
@Entity
public class Individual {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int StudentId;
	private String Name;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="IndividualId")
	private List<Achievement> AchievementInfo;
	public List<Achievement> getAchievementInfo() {
		return AchievementInfo;
	}
	public void setAchievementsInfo(List<Achievement> achievementInfo) {
		AchievementInfo = achievementInfo;
	}
	@Override
	public String toString() {
		return "Individual [StudentId=" + StudentId + ", Name=" + Name + ", age=" + age + "]";
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int age;
}
