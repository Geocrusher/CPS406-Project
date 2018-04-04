package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class MemberUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberUI window = new MemberUI();
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
	public MemberUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 565);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane memTabs = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(memTabs, BorderLayout.CENTER);
		
		JPanel memMain = new JPanel();
		memTabs.addTab("Main", null, memMain, null);
		
		JPanel memInbox = new JPanel();
		memTabs.addTab("Inbox", null, memInbox, null);
	}

}
