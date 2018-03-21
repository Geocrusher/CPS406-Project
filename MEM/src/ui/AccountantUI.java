package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class AccountantUI {

	private JFrame accountantFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountantUI window = new AccountantUI();
					window.accountantFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AccountantUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		accountantFrame = new JFrame();
		accountantFrame.setTitle("Accountant Manager");
		accountantFrame.setBounds(100, 100, 450, 308);
		accountantFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		accountantFrame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		accountantFrame.getContentPane().add(tabbedPane, "name_12110013203647");
		
		JPanel manageFinance = new JPanel();
		tabbedPane.addTab("Manage Finances", null, manageFinance, null);
		manageFinance.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(10, 11, 409, 221);
		manageFinance.add(tabbedPane_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		tabbedPane_1.addTab("Statements", null, panel_2, null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 38, 384, 144);
		panel_2.add(scrollPane_2);
		
		JTextArea textArea = new JTextArea();
		scrollPane_2.setViewportView(textArea);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(264, 11, 130, 20);
		panel_2.add(comboBox_1);
		
		JLabel label_1 = new JLabel("Statements:");
		label_1.setBounds(195, 14, 59, 14);
		panel_2.add(label_1);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		tabbedPane_1.addTab("Unpaid Debt", null, panel, null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 38, 389, 144);
		panel.add(scrollPane_1);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(206, 11, 193, 20);
		panel.add(comboBox);
		
		JLabel lblLogMonth = new JLabel("View Logs:");
		lblLogMonth.setBounds(145, 14, 51, 14);
		panel.add(lblLogMonth);
		
		JPanel manageCoach = new JPanel();
		tabbedPane.addTab("Manage Coach", null, manageCoach, null);
		manageCoach.setLayout(null);
	}
}
