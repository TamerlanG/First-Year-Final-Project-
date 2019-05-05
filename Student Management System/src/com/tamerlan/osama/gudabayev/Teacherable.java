package com.tamerlan.osama.gudabayev;

import javax.swing.JFrame;

public interface Teacherable {
	
	
	String getName();
	String getPassword();
	void setName(String name);
	void setPassword(String password);
	Teacher findTeacher(String name);
	boolean verifyLogin(String name, String password);
}
