package com.example.placement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Place")


//Entity class
public class Placement {
	//primary key attribute
	@Id
	private long Pid;
	private String Pname;
	private String Pcollege;
	private int Pdate;
	private String Pqualification;
	private int Pyear;
	private int age;
	public long getId() {
		return Pid;
	}
	public void setId(long id) {
		this.Pid = id;
	}
	public String getName() {
		return Pname;
	}
	public void setName(String name) {
		this.Pname = name;
	}
	public String getCollege() {
		return Pcollege;
	}
	public void setCollege(String college) {
		this.Pcollege = college;
	}
	public int getDate() {
		return Pdate;
	}
	public void setDate(int date) {
		this.Pdate = date;
	}
	public String getQualification() {
		return Pqualification;
	}
	public void setQualification(String qualification) {
		this.Pqualification = qualification;
	}
	public int getYear() {
		return Pyear;
	}
	public void setYear(int year) {
		this.Pyear = year;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
