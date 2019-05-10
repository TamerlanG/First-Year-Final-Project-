package com.tamerlan.osama.gudabayev;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ForgetPasswordFrame extends Teacher {

	private JFrame frame;
	private JTextField usernameTextField;
	private JTextField passwordTextField;
	String username;
	String password;
	Main instance = new Main();
	
	/**
	 * Launch the application.
	 */
	public void createForgetPasswordScreeen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgetPasswordFrame window = new ForgetPasswordFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		Teachers.clear();
		instance.fileToArray();
	}

	/**
	 * Create the application.
	 */
	public ForgetPasswordFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Forget Password");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnShowMePassword = new JButton("Show Me Password");
		btnShowMePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				username = usernameTextField.getText();
				
				for(int i = 0; i < Teachers.size(); i++) 
				{
					System.out.println(Teachers.get(i).getName());
					if(Teachers.get(i).getName().equals(username))
					{
						password = Teachers.get(i).getPassword();
						passwordTextField.setText(password);
						break;
					}
					else
					{
	
					}
					
				}
				
			}
		});
		btnShowMePassword.setBounds(100, 76, 225, 25);
		frame.getContentPane().add(btnShowMePassword);
		
		usernameTextField = new JTextField();
		usernameTextField.setBounds(211, 45, 114, 19);
		frame.getContentPane().add(usernameTextField);
		usernameTextField.setColumns(10);
		
		JLabel lblInputUsername = new JLabel("Input Username");
		lblInputUsername.setBounds(90, 47, 114, 15);
		frame.getContentPane().add(lblInputUsername);
		
		JLabel lblYourPasswordIs = new JLabel("YOUR PASSWORD IS:");
		lblYourPasswordIs.setBounds(134, 130, 178, 15);
		frame.getContentPane().add(lblYourPasswordIs);
		
		passwordTextField = new JTextField();
		passwordTextField.setFont(new Font("Dialog", Font.PLAIN, 20));
		passwordTextField.setBounds(123, 149, 171, 39);
		frame.getContentPane().add(passwordTextField);
		passwordTextField.setColumns(10);
		passwordTextField.setEditable(false);
		frame.setResizable(false);
	}
}
