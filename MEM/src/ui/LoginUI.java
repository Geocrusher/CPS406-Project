package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.border.EtchedBorder;

public class LoginUI {

	private JFrame loginViewer;
	private JTextField usrField;
	private JPasswordField passField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUI window = new LoginUI();
					window.loginViewer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		loginViewer = new JFrame();
		loginViewer.setTitle("Membership Manager");
		loginViewer.setBounds(100, 100, 261, 172);
		loginViewer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel loginMain = new JPanel();
		loginViewer.getContentPane().add(loginMain, BorderLayout.CENTER);
		loginMain.setLayout(null);
		
		JButton loginBtn = new JButton("Login");
		loginBtn.setBounds(11, 102, 89, 23);
		loginMain.add(loginBtn);
		
		JButton cancelBtn = new JButton("Cancel");
		cancelBtn.setBounds(146, 102, 89, 23);
		loginMain.add(cancelBtn);
		
		JPanel loginInputs = new JPanel();
		loginInputs.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		loginInputs.setBounds(10, 11, 225, 78);
		loginMain.add(loginInputs);
		loginInputs.setLayout(null);
		
		usrField = new JTextField();
		usrField.setBounds(74, 11, 138, 20);
		loginInputs.add(usrField);
		usrField.setColumns(10);
		
		JLabel usrLabel = new JLabel("Password:");
		usrLabel.setBounds(10, 45, 61, 14);
		loginInputs.add(usrLabel);
		
		JLabel passLabel = new JLabel("Username:");
		passLabel.setBounds(10, 14, 61, 14);
		loginInputs.add(passLabel);
		
		passField = new JPasswordField();
		passField.setBounds(74, 42, 138, 20);
		loginInputs.add(passField);
	}
}
