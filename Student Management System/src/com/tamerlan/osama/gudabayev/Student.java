package com.tamerlan.osama.gudabayev;

import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Student implements Studentable {

	String name;
	String surname;
	String Gender;
	int age;
	Double mathGpa;
	Double physicsGpa;
	Double computerGpa;
	Double averageGpa;
	
	Scanner reader;
	static File fileStudent = new File("student.txt");
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
	
	public Student(String name, String surname, String gender, int age, Double mathGpa, Double physicsGpa,
			Double computerGpa, Double averageGPA) {
		super();
		this.name = name;
		this.surname = surname;
		this.Gender = gender;
		this.age = age;
		this.mathGpa = mathGpa;
		this.physicsGpa = physicsGpa;
		this.computerGpa = computerGpa;
		this.averageGpa = averageGPA;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
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
		Double averageGpa = (mathGpa + physicsGpa + computerGpa) / 3;
		return averageGpa;
	}
	
	public boolean searchStudent(String name, String surname) {
		int counter = 0;
		while(counter < studentArrayList.size())
		{
			if(name.equals(studentArrayList.get(counter).getName()) && (surname.equals(studentArrayList.get(counter).getSurname())))
			{
				return true;
			}
			counter++;
		}
		
		return false;
	}
	
	public void fileToArray() {
		while(reader.hasNext())
		{
			studentArrayList.add(new Student(reader.next(), reader.next(), reader.next(), reader.nextInt(), 
					reader.nextDouble(), reader.nextDouble(), reader.nextDouble(), reader.nextDouble()));
		}
		
		reader.close();
	}
	
	
	// copied from stackoverflow
	public static void clearTheFile() throws IOException {
		FileWriter fwob = new FileWriter(fileStudent, false);
        PrintWriter pwOb = new PrintWriter(fwob);
        pwOb.flush();
        pwOb.close();
        fwob.close();
    }

}

	