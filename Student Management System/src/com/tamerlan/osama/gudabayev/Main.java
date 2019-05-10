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
import javax.swing.JCheckBox;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Main extends Teacher {

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
		frame.setBounds(100, 100, 546, 376);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTeachersUsername = new JLabel("Teacher's Username");
		lblTeachersUsername.setBounds(35, 129, 155, 15);
		frame.getContentPane().add(lblTeachersUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(102, 150, 135, 15);
		frame.getContentPane().add(lblPassword);
		
		userText = new JTextField();
		userText.setBounds(182, 127, 238, 19);
		frame.getContentPane().add(userText);
		userText.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(182, 148, 125, 19);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBackground(new Color(0, 204, 0));
		btnLogin.setBounds(164, 174, 73, 25);
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
		btnCreateAccount.setForeground(Color.WHITE);
		btnCreateAccount.setBackground(new Color(30, 144, 255));
		btnCreateAccount.setBounds(249, 174, 142, 25);
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Make new register frame 
				RegisterFrame register = new RegisterFrame();
				register.createRegisterScreen();
			}
		});
		frame.getContentPane().add(btnCreateAccount);
		
		JButton btnForgetPassword = new JButton("Forget Password");
		btnForgetPassword.setForeground(Color.WHITE);
		btnForgetPassword.setBackground(new Color(178, 34, 34));
		btnForgetPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ForgetPasswordFrame passwordForgetFrame = new ForgetPasswordFrame();
				passwordForgetFrame.createForgetPasswordScreeen();
			}
		});
		btnForgetPassword.setBounds(164, 203, 227, 25);
		frame.getContentPane().add(btnForgetPassword);
		
		JCheckBox chckbxShowPassword = new JCheckBox("Show Password");
		chckbxShowPassword.setBackground(Color.WHITE);
		chckbxShowPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxShowPassword.isSelected())
				{
					passwordField.setEchoChar((char) 0);
				}
				else {
					passwordField.setEchoChar('*');
				}
			}
		});
		chckbxShowPassword.setBounds(306, 146, 138, 23);
		frame.getContentPane().add(chckbxShowPassword);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/home/tamerlan/eclipse-workspace/Student Management System/aydin-logo.jpg"));
		label.setBounds(219, 12, 125, 96);
		frame.getContentPane().add(label);
		
		JLabel lblOsamaAbualhyajaa = new JLabel("Osama Abualhyajaa");
		lblOsamaAbualhyajaa.setFont(new Font("Lohit Devanagari", Font.BOLD, 12));
		lblOsamaAbualhyajaa.setBounds(207, 281, 168, 15);
		frame.getContentPane().add(lblOsamaAbualhyajaa);
		
		JLabel lblTamerlanGudabayev = new JLabel("Tamerlan Gudabayev");
		lblTamerlanGudabayev.setFont(new Font("Lohit Devanagari", Font.BOLD, 12));
		lblTamerlanGudabayev.setBounds(207, 296, 168, 15);
		frame.getContentPane().add(lblTamerlanGudabayev);
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
