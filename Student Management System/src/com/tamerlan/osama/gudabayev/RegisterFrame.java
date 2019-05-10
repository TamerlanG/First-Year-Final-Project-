package com.tamerlan.osama.gudabayev;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;

public class RegisterFrame extends Teacher {

	private JFrame frame;
	private JTextField userTextField;
	private JTextField passwordTextField;
	private JButton btnSignUp;
	Main instance = new Main();
	
	
		
	/**
	 * Launch the application.
	 */
	public void createRegisterScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterFrame window = new RegisterFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		instance.fileToArray();
	}

	/**
	 * Create the application.
	 */
	public RegisterFrame() {
		super();
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Create Account");
		frame.setBounds(100, 100, 342, 224);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		
		
		JLabel lblInputUsername = new JLabel("Input Username\n");
		springLayout.putConstraint(SpringLayout.NORTH, lblInputUsername, 24, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblInputUsername, -166, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(lblInputUsername);
		
		JLabel lblInputPassword = new JLabel("Input Password");
		springLayout.putConstraint(SpringLayout.NORTH, lblInputPassword, 31, SpringLayout.SOUTH, lblInputUsername);
		springLayout.putConstraint(SpringLayout.WEST, lblInputPassword, 0, SpringLayout.WEST, lblInputUsername);
		springLayout.putConstraint(SpringLayout.EAST, lblInputPassword, -168, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(lblInputPassword);
		
		userTextField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, userTextField, 0, SpringLayout.NORTH, lblInputUsername);
		springLayout.putConstraint(SpringLayout.WEST, userTextField, 6, SpringLayout.EAST, lblInputUsername);
		springLayout.putConstraint(SpringLayout.EAST, userTextField, -46, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(userTextField);
		userTextField.setColumns(10);
		
		passwordTextField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, passwordTextField, 0, SpringLayout.NORTH, lblInputPassword);
		springLayout.putConstraint(SpringLayout.WEST, passwordTextField, 6, SpringLayout.EAST, lblInputPassword);
		springLayout.putConstraint(SpringLayout.EAST, passwordTextField, -48, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(passwordTextField);
		passwordTextField.setColumns(10);
		
		btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			@SuppressWarnings("null")
			public void actionPerformed(ActionEvent e) {
				String username = userTextField.getText();
				String password = passwordTextField.getText();
				
				
			if(teacherExists(username)) {
				JOptionPane.showMessageDialog(frame, "ACCOUNT NAME ALREADY EXISTS");
			}
			else
			{
				Teachers.clear();
				Teachers.add(new Teacher(username, password));
				Student instance = new Student();
				try {
					instance.clearTheFile();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				for(int i = 0;i < Teachers.size(); i++)
				{
					
					teacherPrinter.append(Teachers.get(i).getName() + " " + Teachers.get(i).getPassword() + "\n");
					
				}
				
				
				
				
				
				teacherPrinter.flush();
				JOptionPane.showMessageDialog(frame, "Account Created");
				frame.dispose();
				
			}
				

				
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnSignUp, 31, SpringLayout.SOUTH, passwordTextField);
		springLayout.putConstraint(SpringLayout.WEST, btnSignUp, 115, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(btnSignUp);
	}
	
}
