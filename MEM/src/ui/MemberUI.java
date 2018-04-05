package ui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MemberUI extends JFrame{

	//private Jthis this;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberUI window = new MemberUI();
					window.this.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/
	/**
	 * Create the application.
	 */
	public MemberUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the this.
	 */
	private void initialize() {
		//this = new Jthis();
		this.setBounds(100, 100, 700, 565);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane memTabs = new JTabbedPane(JTabbedPane.TOP);
		this.getContentPane().add(memTabs, BorderLayout.CENTER);
		
		JPanel memMain = new JPanel();
		memTabs.addTab("Main", null, memMain, null);
		
		JPanel memInbox = new JPanel();
		memTabs.addTab("Inbox", null, memInbox, null);
	}

}
