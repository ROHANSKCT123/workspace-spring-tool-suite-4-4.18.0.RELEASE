package com.ipl.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ipl {
	
	@Id
	private int id;
	private String name;
	private String age;
	
	@Override
	public String toString() {
		return "Ipl [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	public Ipl(int id, String name, String age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	

}
