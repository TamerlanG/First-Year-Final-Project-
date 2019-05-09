package com.tamerlan.osama.gudabayev;

public interface Studentable {

	String getName();
	String getSurname();
	String getGender();
	Double getMathGpa();
	Double getPhysicsGpa();
	Double getComputerGpa();
	Double getAverageGpa(Double mathGpa, Double physicsGpa, Double ComputerGpa);
	int getAge();
	void setName(String name);
	void setSurname(String surname);
	void setMathGpa(Double mathGpa);
	void setPhysicsGpa(Double physicsGpa);
	void setComputerGpa(Double computerGpa);
}
