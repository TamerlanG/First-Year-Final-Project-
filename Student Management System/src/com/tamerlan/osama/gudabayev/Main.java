package com.tamerlan.osama.gudabayev;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Main extends Methods {

	private JFrame frame;
	private JTextField userText;
	private JPasswordField passwordField;
	String username;
	String password;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		//Main instance =  new Main();
		//instance.fileToArray();
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Student Management System");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JLabel lblTeachersUsername = new JLabel("Teacher's Username");
		springLayout.putConstraint(SpringLayout.WEST, lblTeachersUsername, 38, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(lblTeachersUsername);
		
		JLabel lblPassword = new JLabel("Password");
		springLayout.putConstraint(SpringLayout.NORTH, lblPassword, 75, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblPassword, 112, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblPassword, -257, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblTeachersUsername, -6, SpringLayout.NORTH, lblPassword);
		springLayout.putConstraint(SpringLayout.EAST, lblTeachersUsername, 0, SpringLayout.EAST, lblPassword);
		frame.getContentPane().add(lblPassword);
		
		userText = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, userText, -2, SpringLayout.NORTH, lblTeachersUsername);
		springLayout.putConstraint(SpringLayout.WEST, userText, 6, SpringLayout.EAST, lblTeachersUsername);
		frame.getContentPane().add(userText);
		userText.setColumns(10);
		
		passwordField = new JPasswordField();
		springLayout.putConstraint(SpringLayout.NORTH, passwordField, 73, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, passwordField, 193, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, passwordField, -120, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		springLayout.putConstraint(SpringLayout.NORTH, btnLogin, 10, SpringLayout.SOUTH, passwordField);
		springLayout.putConstraint(SpringLayout.WEST, btnLogin, 193, SpringLayout.WEST, frame.getContentPane());
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				fileToArray();
				username = userText.getText();
				password = passwordField.getText();
				boolean verification = verifyLogin(username, password);
				
				if(verification) {
					JOptionPane.showMessageDialog(frame, "Welcome " + username );
					InformationFrame information = new InformationFrame();
					frame.dispose();
					information.createInformationScreen();
				}
				else {
					JOptionPane.showMessageDialog(frame, "Wrong username/password");
				}
				
				
				
			}
		});
		frame.getContentPane().add(btnLogin);
		
		JButton btnCreateAccount = new JButton("Create Account");
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Make new register frame 
				RegisterFrame register = new RegisterFrame();
				register.createRegisterScreen();
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnCreateAccount, 6, SpringLayout.SOUTH, btnLogin);
		springLayout.putConstraint(SpringLayout.EAST, btnCreateAccount, -135, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(btnCreateAccount);
	}
	
	public void fileToArray() {
		while(reader.hasNext())
		{
			Teachers.add(new Teacher(reader.next(), reader.next()));
		}
		
		//for(int i = 0; i < Teachers.size(); i++ ) {
			//System.out.println("Username: " + Teachers.get(i).getName() + " Password: " + Teachers.get(i).getPassword());
		//}
	}
}
