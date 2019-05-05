package com.tamerlan.osama.gudabayev;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.AbstractListModel;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InformationFrame extends Student{

	private JFrame frame;
	private JTextField firstNameTextField;
	private JTextField surnameTextField;
	private JTextField ageTextField;
	private JTextField mathGpaTextField;
	private JTextField physicsGpaTextField;
	private JTextField computerGpaTextField;
	private JTable studentTable;
	
	String username = firstNameTextField.getText();
	String surname = surnameTextField.getText();
	Integer age = Integer.parseInt(surnameTextField.getText());
	Double mathGPA = Double.parseDouble(mathGpaTextField.getText());
	Double physicsGPA = Double.parseDouble(physicsGpaTextField.getText());
	Double computerGPA = Double.parseDouble(computerGpaTextField.getText());
	
	
	
	

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
		frame.setBounds(100, 100, 731, 464);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JLabel lblName = new JLabel("Name:");
		springLayout.putConstraint(SpringLayout.NORTH, lblName, 56, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblName, 22, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(lblName);
		
		JLabel lblSurname = new JLabel("Surname:");
		springLayout.putConstraint(SpringLayout.WEST, lblSurname, 10, SpringLayout.WEST, lblName);
		frame.getContentPane().add(lblSurname);
		
		JLabel lblAge = new JLabel("Age:\n");
		springLayout.putConstraint(SpringLayout.NORTH, lblAge, 134, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblAge, 21, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(lblAge);
		
		JLabel lblMathGpa = new JLabel("Math GPA:");
		springLayout.putConstraint(SpringLayout.NORTH, lblMathGpa, 18, SpringLayout.SOUTH, lblAge);
		springLayout.putConstraint(SpringLayout.WEST, lblMathGpa, 21, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(lblMathGpa);
		
		JLabel lblPhysicsGpa = new JLabel("Physics GPA:");
		springLayout.putConstraint(SpringLayout.NORTH, lblPhysicsGpa, 21, SpringLayout.SOUTH, lblMathGpa);
		springLayout.putConstraint(SpringLayout.WEST, lblPhysicsGpa, 21, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(lblPhysicsGpa);
		
		JLabel lblComputerGpa = new JLabel("Computer GPA");
		springLayout.putConstraint(SpringLayout.NORTH, lblComputerGpa, 19, SpringLayout.SOUTH, lblPhysicsGpa);
		springLayout.putConstraint(SpringLayout.WEST, lblComputerGpa, 21, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(lblComputerGpa);
		
		JLabel lblAverageGpa = new JLabel("Average GPA");
		springLayout.putConstraint(SpringLayout.NORTH, lblAverageGpa, 18, SpringLayout.SOUTH, lblComputerGpa);
		springLayout.putConstraint(SpringLayout.WEST, lblAverageGpa, 21, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(lblAverageGpa);
		
		firstNameTextField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, firstNameTextField, 0, SpringLayout.NORTH, lblName);
		springLayout.putConstraint(SpringLayout.WEST, firstNameTextField, 6, SpringLayout.EAST, lblName);
		frame.getContentPane().add(firstNameTextField);
		firstNameTextField.setColumns(10);
		
		surnameTextField = new JTextField();
		springLayout.putConstraint(SpringLayout.SOUTH, surnameTextField, -337, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, lblSurname, 2, SpringLayout.NORTH, surnameTextField);
		frame.getContentPane().add(surnameTextField);
		surnameTextField.setColumns(10);
		
		ageTextField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, ageTextField, 134, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, ageTextField, 1, SpringLayout.EAST, lblAge);
		frame.getContentPane().add(ageTextField);
		ageTextField.setColumns(10);
		
		mathGpaTextField = new JTextField();
		springLayout.putConstraint(SpringLayout.EAST, surnameTextField, 0, SpringLayout.EAST, mathGpaTextField);
		springLayout.putConstraint(SpringLayout.NORTH, mathGpaTextField, 10, SpringLayout.SOUTH, ageTextField);
		springLayout.putConstraint(SpringLayout.WEST, mathGpaTextField, 6, SpringLayout.EAST, lblMathGpa);
		frame.getContentPane().add(mathGpaTextField);
		mathGpaTextField.setColumns(10);
		
		physicsGpaTextField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, physicsGpaTextField, 201, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, mathGpaTextField, -17, SpringLayout.NORTH, physicsGpaTextField);
		springLayout.putConstraint(SpringLayout.WEST, physicsGpaTextField, 4, SpringLayout.EAST, lblPhysicsGpa);
		frame.getContentPane().add(physicsGpaTextField);
		physicsGpaTextField.setColumns(10);
		
		computerGpaTextField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, computerGpaTextField, 235, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, physicsGpaTextField, -15, SpringLayout.NORTH, computerGpaTextField);
		springLayout.putConstraint(SpringLayout.WEST, computerGpaTextField, 6, SpringLayout.EAST, lblComputerGpa);
		frame.getContentPane().add(computerGpaTextField);
		computerGpaTextField.setColumns(10);
		
		JButton btnAddStudent = new JButton("Add Student");
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//studentArrayList.add(new Student(username, surname,));
			}
		});
		springLayout.putConstraint(SpringLayout.SOUTH, computerGpaTextField, -62, SpringLayout.NORTH, btnAddStudent);
		springLayout.putConstraint(SpringLayout.NORTH, btnAddStudent, 29, SpringLayout.SOUTH, lblAverageGpa);
		springLayout.putConstraint(SpringLayout.WEST, btnAddStudent, 72, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(btnAddStudent);
		
		JTextArea ageTextArea = new JTextArea();
		springLayout.putConstraint(SpringLayout.NORTH, ageTextArea, 19, SpringLayout.SOUTH, physicsGpaTextField);
		springLayout.putConstraint(SpringLayout.WEST, ageTextArea, 0, SpringLayout.WEST, computerGpaTextField);
		ageTextArea.setText("n/a");
		frame.getContentPane().add(ageTextArea);
		
		JLabel lblGender = new JLabel("Gender:");
		springLayout.putConstraint(SpringLayout.NORTH, lblGender, 108, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblGender, 0, SpringLayout.WEST, lblName);
		frame.getContentPane().add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		springLayout.putConstraint(SpringLayout.SOUTH, rdbtnMale, -308, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, rdbtnMale, 0, SpringLayout.EAST, ageTextArea);
		frame.getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		springLayout.putConstraint(SpringLayout.SOUTH, rdbtnFemale, -6, SpringLayout.NORTH, ageTextField);
		springLayout.putConstraint(SpringLayout.EAST, rdbtnFemale, 0, SpringLayout.EAST, physicsGpaTextField);
		frame.getContentPane().add(rdbtnFemale);
		
		studentTable = new JTable();
		springLayout.putConstraint(SpringLayout.SOUTH, studentTable, -24, SpringLayout.SOUTH, lblPhysicsGpa);
		studentTable.setForeground(UIManager.getColor("Button.background"));
		springLayout.putConstraint(SpringLayout.NORTH, studentTable, 0, SpringLayout.NORTH, lblName);
		springLayout.putConstraint(SpringLayout.WEST, studentTable, 8, SpringLayout.EAST, physicsGpaTextField);
		springLayout.putConstraint(SpringLayout.EAST, studentTable, -24, SpringLayout.EAST, frame.getContentPane());
		studentTable.setBackground(Color.RED);
		studentTable.setModel(new DefaultTableModel(
			new Object[][] {
				{"", null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		frame.getContentPane().add(studentTable);
		
	}
}
