package com.tamerlan.osama.gudabayev;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Student implements Studentable {

	String name;
	String surname;
	Boolean isMale;
	int age;
	Double mathGpa;
	Double physicsGpa;
	Double computerGpa;
	Double averageGpa;
	
	Scanner reader;
	File fileStudent = new File("student.txt");
	public ArrayList<Student> studentArrayList = new ArrayList<Student>(); 
	PrintWriter studentPrintWriter;
	
	{
		try {
				studentPrintWriter = new PrintWriter(new FileWriter(fileStudent, true));
				reader = new Scanner(fileStudent);
	        } 
		catch (IOException e) {
			e.printStackTrace();
								}
	}
	
	public Student(String name, String surname, Boolean isMale, int age, Double mathGpa, Double physicsGpa,
			Double computerGpa, Double averageGpa) {
		super();
		this.name = name;
		this.surname = surname;
		this.isMale = isMale;
		this.age = age;
		this.mathGpa = mathGpa;
		this.physicsGpa = physicsGpa;
		this.computerGpa = computerGpa;
		this.averageGpa = averageGpa;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Boolean getIsMale() {
		return isMale;
	}

	public void setIsMale(Boolean isMale) {
		this.isMale = isMale;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Double getMathGpa() {
		return mathGpa;
	}

	public void setMathGpa(Double mathGpa) {
		this.mathGpa = mathGpa;
	}

	public Double getPhysicsGpa() {
		return physicsGpa;
	}

	public void setPhysicsGpa(Double physicsGpa) {
		this.physicsGpa = physicsGpa;
	}

	public Double getComputerGpa() {
		return computerGpa;
	}

	public void setComputerGpa(Double computerGpa) {
		this.computerGpa = computerGpa;
	}

	public Double getAverageGpa(Double mathGpa, Double physicsGpa, Double computerGpa) {
		return averageGpa;
	}

}

	