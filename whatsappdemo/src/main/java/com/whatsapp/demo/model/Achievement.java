
package com.whatsapp.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Achievement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Override
	public String toString() {
		return "Achievement [id=" + id + ", StudentAcievement=" + StudentAcievement + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentAcievement() {
		return StudentAcievement;
	}
	public void setStudentAcievement(String studentAcievement) {
		StudentAcievement = studentAcievement;
	}
	private String StudentAcievement;
}
