package com.tamerlan.osama.gudabayev;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.ButtonGroup;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.Color;
import javax.swing.ImageIcon;

public class InformationFrame extends Student{

	private JFrame frame;
	private JTextField firstNameTextField;
	private JTextField surnameTextField;
	private JTextField ageTextField;
	private JTextField mathGpaTextField;
	private JTextField physicsGpaTextField;
	private JTextField computerGpaTextField;
	private JTable table;
	
	String col[] = {"Name","Surname","Age", "Gender", "Math", "Physics", "Computer", "Average"};
	DefaultTableModel tableModel = new DefaultTableModel(col, 0);
	
	
	/**
	 * Launch the application.
	 */
	public void createInformationScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InformationFrame window = new InformationFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InformationFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Student Database");
		frame.getContentPane().setBackground(UIManager.getColor("Button.background"));
		frame.getContentPane().setForeground(UIManager.getColor("Button.background"));
		frame.setBounds(100, 100, 802, 464);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JLabel lblName = new JLabel("Name:");
		frame.getContentPane().add(lblName);
		
		JLabel lblSurname = new JLabel("Surname:");
		springLayout.putConstraint(SpringLayout.NORTH, lblSurname, 32, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblName, -6, SpringLayout.NORTH, lblSurname);
		frame.getContentPane().add(lblSurname);
		
		JLabel lblAge = new JLabel("Age:\n");
		springLayout.putConstraint(SpringLayout.NORTH, lblAge, 6, SpringLayout.SOUTH, lblSurname);
		springLayout.putConstraint(SpringLayout.EAST, lblAge, 0, SpringLayout.EAST, lblName);
		frame.getContentPane().add(lblAge);
		
		JLabel lblMathGpa = new JLabel("Math GPA:");
		springLayout.putConstraint(SpringLayout.NORTH, lblMathGpa, 6, SpringLayout.SOUTH, lblAge);
		springLayout.putConstraint(SpringLayout.EAST, lblMathGpa, 0, SpringLayout.EAST, lblName);
		frame.getContentPane().add(lblMathGpa);
		
		JLabel lblPhysicsGpa = new JLabel("Physics GPA:");
		springLayout.putConstraint(SpringLayout.NORTH, lblPhysicsGpa, 6, SpringLayout.SOUTH, lblMathGpa);
		springLayout.putConstraint(SpringLayout.EAST, lblPhysicsGpa, 0, SpringLayout.EAST, lblSurname);
		frame.getContentPane().add(lblPhysicsGpa);
		
		JLabel lblComputerGpa = new JLabel("ComputerGPA");
		springLayout.putConstraint(SpringLayout.NORTH, lblComputerGpa, 6, SpringLayout.SOUTH, lblPhysicsGpa);
		springLayout.putConstraint(SpringLayout.WEST, lblComputerGpa, 0, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(lblComputerGpa);
		
		firstNameTextField = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, firstNameTextField, 100, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblName, -6, SpringLayout.WEST, firstNameTextField);
		frame.getContentPane().add(firstNameTextField);
		firstNameTextField.setColumns(10);
		
		surnameTextField = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, surnameTextField, 100, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, firstNameTextField, -25, SpringLayout.NORTH, surnameTextField);
		springLayout.putConstraint(SpringLayout.SOUTH, firstNameTextField, -10, SpringLayout.NORTH, surnameTextField);
		springLayout.putConstraint(SpringLayout.EAST, lblSurname, -1, SpringLayout.WEST, surnameTextField);
		springLayout.putConstraint(SpringLayout.SOUTH, surnameTextField, 49, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, surnameTextField, 34, SpringLayout.NORTH, frame.getContentPane());
		frame.getContentPane().add(surnameTextField);
		surnameTextField.setColumns(10);
		
		ageTextField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, ageTextField, -2, SpringLayout.NORTH, lblAge);
		springLayout.putConstraint(SpringLayout.WEST, ageTextField, 6, SpringLayout.EAST, lblAge);
		springLayout.putConstraint(SpringLayout.EAST, ageTextField, 0, SpringLayout.EAST, firstNameTextField);
		frame.getContentPane().add(ageTextField);
		ageTextField.setColumns(10);
		
		mathGpaTextField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, mathGpaTextField, 6, SpringLayout.SOUTH, ageTextField);
		springLayout.putConstraint(SpringLayout.SOUTH, mathGpaTextField, -345, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, mathGpaTextField, 0, SpringLayout.EAST, firstNameTextField);
		frame.getContentPane().add(mathGpaTextField);
		mathGpaTextField.setColumns(10);
		
		physicsGpaTextField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, physicsGpaTextField, 6, SpringLayout.SOUTH, mathGpaTextField);
		springLayout.putConstraint(SpringLayout.WEST, physicsGpaTextField, 0, SpringLayout.WEST, firstNameTextField);
		springLayout.putConstraint(SpringLayout.SOUTH, physicsGpaTextField, -324, SpringLayout.SOUTH, frame.getContentPane());
		frame.getContentPane().add(physicsGpaTextField);
		physicsGpaTextField.setColumns(10);
		
		computerGpaTextField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, computerGpaTextField, 6, SpringLayout.SOUTH, physicsGpaTextField);
		springLayout.putConstraint(SpringLayout.WEST, computerGpaTextField, 0, SpringLayout.WEST, firstNameTextField);
		springLayout.putConstraint(SpringLayout.SOUTH, computerGpaTextField, -303, SpringLayout.SOUTH, frame.getContentPane());
		frame.getContentPane().add(computerGpaTextField);
		computerGpaTextField.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender:");
		springLayout.putConstraint(SpringLayout.NORTH, lblGender, 24, SpringLayout.SOUTH, lblComputerGpa);
		springLayout.putConstraint(SpringLayout.EAST, lblGender, 0, SpringLayout.EAST, lblSurname);
		frame.getContentPane().add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnMale, 6, SpringLayout.SOUTH, computerGpaTextField);
		springLayout.putConstraint(SpringLayout.WEST, rdbtnMale, 0, SpringLayout.WEST, firstNameTextField);
		springLayout.putConstraint(SpringLayout.EAST, rdbtnMale, 59, SpringLayout.WEST, firstNameTextField);
		frame.getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnFemale, 6, SpringLayout.SOUTH, rdbtnMale);
		springLayout.putConstraint(SpringLayout.WEST, rdbtnFemale, 0, SpringLayout.WEST, firstNameTextField);
		springLayout.putConstraint(SpringLayout.EAST, rdbtnFemale, 76, SpringLayout.WEST, firstNameTextField);
		frame.getContentPane().add(rdbtnFemale);
		
		ButtonGroup genderGroup = new ButtonGroup();
		rdbtnMale.setSelected(true);
		genderGroup.add(rdbtnMale);
		genderGroup.add(rdbtnFemale);
		
		JButton btnAddStudent = new JButton("Add Student");
		springLayout.putConstraint(SpringLayout.NORTH, btnAddStudent, 41, SpringLayout.SOUTH, rdbtnFemale);
		springLayout.putConstraint(SpringLayout.WEST, btnAddStudent, 54, SpringLayout.WEST, frame.getContentPane());
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = firstNameTextField.getText();
				String surname = surnameTextField.getText();
				Integer age = Integer.parseInt(ageTextField.getText());
				Double mathGPA = Double.parseDouble(mathGpaTextField.getText());
				Double physicsGPA = Double.parseDouble(physicsGpaTextField.getText());
				Double computerGPA = Double.parseDouble(computerGpaTextField.getText());
				Boolean isMale;
				Double averageGPA = getAverageGpa(mathGPA, physicsGPA, computerGPA);
				String gender;
				if(rdbtnMale.isSelected()) {
					isMale = true;
					gender = "male";
				}
				else {
					isMale = false;
					gender = "female";
				}
				
				if(searchStudent(username, surname))
				{
					JOptionPane.showMessageDialog(frame, "Don't input same students");
				}
				else {
					studentArrayList.add(new Student(username, surname, gender, age, mathGPA, physicsGPA,
						computerGPA, averageGPA));
				
					studentPrintWriter.append(username + " " + surname + " " + gender + " "  +
							age + " " + mathGPA + " " + physicsGPA + " " + computerGPA + " " + averageGPA  + "\n");
				
					JOptionPane.showMessageDialog(frame, "Student Added");
				
					studentPrintWriter.flush();
				
					updateTable();
					
					firstNameTextField.setText("");
					surnameTextField.setText("");
					ageTextField.setText("");
					mathGpaTextField.setText("");
					physicsGpaTextField.setText("");
					computerGpaTextField.setText("");
					
					
				}
				
				
			}
		});
		frame.getContentPane().add(btnAddStudent);
		
		table = new JTable(tableModel);
		springLayout.putConstraint(SpringLayout.NORTH, table, 0, SpringLayout.NORTH, lblName);
		springLayout.putConstraint(SpringLayout.WEST, table, -28, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, table, -416, SpringLayout.EAST, frame.getContentPane());
		JScrollPane scrollPane = new JScrollPane(table);
		springLayout.putConstraint(SpringLayout.EAST, btnAddStudent, -47, SpringLayout.WEST, scrollPane);
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 242, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, -10, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, -4, SpringLayout.SOUTH, frame.getContentPane());
		frame.getContentPane().add(scrollPane);
		table.setEnabled(false);
		
		JButton btnLogOut = new JButton("Log Out");
		springLayout.putConstraint(SpringLayout.WEST, btnLogOut, 0, SpringLayout.WEST, lblPhysicsGpa);
		springLayout.putConstraint(SpringLayout.SOUTH, btnLogOut, -10, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnLogOut, -6, SpringLayout.WEST, scrollPane);
		btnLogOut.setForeground(Color.WHITE);
		btnLogOut.setBackground(new Color(220, 20, 60));
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "See you later!!");
				frame.dispose();
				Main.main(null);
			}
		});
		frame.getContentPane().add(btnLogOut);
		
		JButton btnDeleteStudent = new JButton("Delete Student");
		springLayout.putConstraint(SpringLayout.NORTH, btnDeleteStudent, 6, SpringLayout.SOUTH, btnAddStudent);
		springLayout.putConstraint(SpringLayout.EAST, btnDeleteStudent, -48, SpringLayout.WEST, scrollPane);
		btnDeleteStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String String_firstNumber = JOptionPane.showInputDialog("Input Student/Row to Delete");
				int Int_firstNumber = Integer.parseInt(String_firstNumber);
				
				if(Int_firstNumber > 0 && Int_firstNumber < tableModel.getRowCount());
				{
					int ArrayListCount = Int_firstNumber - 1;
					studentArrayList.remove(ArrayListCount);
					
					
					try {
						clearTheFile();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					arrayListToFile();
					updateTable();
					
					
				}
				
				
			}
		});
		frame.getContentPane().add(btnDeleteStudent);
		
		JButton btnRefresh = new JButton("Refresh");
		springLayout.putConstraint(SpringLayout.WEST, btnRefresh, 54, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnRefresh, 0, SpringLayout.EAST, btnAddStudent);
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateTable();
				JOptionPane.showMessageDialog(frame, "Refresh Complete");
			}
		});
		frame.getContentPane().add(btnRefresh);
		
		JButton btnEditStudent = new JButton("Edit Student");
		springLayout.putConstraint(SpringLayout.WEST, btnEditStudent, 54, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, btnRefresh, 7, SpringLayout.SOUTH, btnEditStudent);
		springLayout.putConstraint(SpringLayout.NORTH, btnEditStudent, 6, SpringLayout.SOUTH, btnDeleteStudent);
		springLayout.putConstraint(SpringLayout.EAST, btnEditStudent, 0, SpringLayout.EAST, btnAddStudent);
		btnEditStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String studentRowNumberString = JOptionPane.showInputDialog("Input Student/Row to Edit");
				int studentRowNumberInt = Integer.parseInt(studentRowNumberString);
				int studentElementID = studentRowNumberInt - 1;
				
				if(studentRowNumberInt > 0 && studentRowNumberInt <=  tableModel.getRowCount()) {
					String username = JOptionPane.showInputDialog("Input Name of Student");
					String surname = JOptionPane.showInputDialog("Input Surname of Student");
					String ageString = JOptionPane.showInputDialog("Input Age of Student");
					String gender = "male";
					
					String[] values = {"male", "female"};

					Object selected = JOptionPane.showInputDialog(null, "What is the Students Gender?", "Selection", JOptionPane.DEFAULT_OPTION, null, values, "0");
					if (selected != null ){//null if the user cancels. 
					    gender = selected.toString();
					    //do something
					}else{
					    System.out.println("User cancelled");
					}
					String mathGpaString = JOptionPane.showInputDialog("Input Maths GPA of Student");
					String physicsGpaString = JOptionPane.showInputDialog("Input Physics GPA of Student");
					String computerGpaString = JOptionPane.showInputDialog("Input  Computer GPA of Student");
					int age = Integer.parseInt(ageString);
					Double mathGPA = Double.parseDouble(mathGpaString);
					Double physicsGPA = Double.parseDouble(physicsGpaString);
					Double computerGPA = Double.parseDouble(computerGpaString);
					Double averageGpa = getAverageGpa(mathGPA, physicsGPA, computerGPA);
					
					studentArrayList.set(studentElementID, new Student(username, surname, gender, age, mathGPA, physicsGPA, computerGPA, averageGpa));
					
					try {
						clearTheFile();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					arrayListToFile();
					updateTable();
					
					
					
				}
				else {
					JOptionPane.showMessageDialog(frame, "No Student in this Row");
				}
			}
		});
		frame.getContentPane().add(btnEditStudent);
		
		fileToArray();
		updateTable();
		
	}
	

	public void updateTable() {
		tableModel.setRowCount(0);
		for(int i = 0; i < studentArrayList.size(); i++)
		{
			String modelName = studentArrayList.get(i).getName();
			String modelSurname = studentArrayList.get(i).getSurname();
			int modelAge = studentArrayList.get(i).getAge();
			String modelGender = studentArrayList.get(i).getGender();
			Double modelMathGPA = studentArrayList.get(i).getMathGpa();
			Double modelPhysicsGPA = studentArrayList.get(i).getPhysicsGpa();
			Double modelComputerGPA = studentArrayList.get(i).getComputerGpa();
			Double modelAverageGPA = studentArrayList.get(i).getAverageGpa(modelMathGPA, modelPhysicsGPA, modelComputerGPA);
			
			Object[] data = {modelName, modelSurname, modelAge, modelGender, modelMathGPA, modelPhysicsGPA, modelComputerGPA, 
					modelAverageGPA};
			
			
			tableModel.addRow(data);
			
			
		}
	}
	
	public void arrayListToFile()
	{
		
		for(int i = 0; i < studentArrayList.size(); i++)
		{
			String modelName = studentArrayList.get(i).getName();
			String modelSurname = studentArrayList.get(i).getSurname();
			int modelAge = studentArrayList.get(i).getAge();
			String modelGender = studentArrayList.get(i).getGender();
			Double modelMathGPA = studentArrayList.get(i).getMathGpa();
			Double modelPhysicsGPA = studentArrayList.get(i).getPhysicsGpa();
			Double modelComputerGPA = studentArrayList.get(i).getComputerGpa();
			Double modelAverageGPA = studentArrayList.get(i).getAverageGpa(modelMathGPA, modelPhysicsGPA, modelComputerGPA);
			
			
			studentPrintWriter.append(modelName + " " + modelSurname + " " + modelGender + " "  +
					modelAge + " " + modelMathGPA + " " + modelPhysicsGPA + " " + modelComputerGPA + " " + modelAverageGPA  + "\n");
			
		}
		
		JOptionPane.showMessageDialog(frame, "File Updated");
		studentPrintWriter.flush();
		studentPrintWriter.close();
	}
}
