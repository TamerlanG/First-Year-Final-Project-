package com.tamerlan.osama.gudabayev;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Teacher implements Teacherable{

	String name;
	String password;
	public ArrayList<Teacher> Teachers = new ArrayList<Teacher>();
	public File fileTeacher = new File("teacherInfo.txt");
	PrintWriter teacherPrinter;
	Scanner reader;
	
	{
		try {
				teacherPrinter = new PrintWriter(new FileWriter(fileTeacher, true));
				reader = new Scanner(fileTeacher);
	        } 
		catch (IOException e) {
			e.printStackTrace();
								}
	}
	
	
	public Teacher(String name, String password) {
		this.name = name;
		this.password = password;
	}

	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Teacher findTeacher(String name) {
		
		return null;
	}

	public boolean verifyLogin(String name, String password) 
	{
		for(int i = 0; i < Teachers.size(); i++) 
		{
			if(name.equals(Teachers.get(i).getName()) && password.equals(Teachers.get(i).getPassword()))
			{
				return true;
				
			}
			else {

			}
			
		}
		return false;
		
		
		 
	}
	
}
