package ui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTable;


public class AccountantUI2 extends JFrame {

	//private JFrame frame;
	private JTextField expenseAmount;
	private JTextField dueDate;
	private JTable table;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountantUI2 window = new AccountantUI2();
					window.frame.setVisible(true);
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
	public AccountantUI2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//frame = new JFrame();
		this.setBounds(100, 100, 739, 527);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JToolBar toolBar = new JToolBar();
		this.getContentPane().add(toolBar, BorderLayout.NORTH);
		
		JButton btnLogout = new JButton("Logout");
		toolBar.add(btnLogout);
		ActionListener logoutListen = new logoutListener();
		btnLogout.addActionListener(logoutListen);
		
		JButton btnShutdown = new JButton("Shutdown");
		toolBar.add(btnShutdown);
		
		JTabbedPane accountTabs = new JTabbedPane(JTabbedPane.TOP);
		this.getContentPane().add(accountTabs, BorderLayout.CENTER);
		
		JPanel financeTab = new JPanel();
		accountTabs.addTab("Finances", null, financeTab, null);
		financeTab.setLayout(null);
		
		JPanel profitPanel = new JPanel();
		profitPanel.setBorder(new TitledBorder(null, "Yearly Profit", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		profitPanel.setBounds(10, 11, 382, 176);
		financeTab.add(profitPanel);
		profitPanel.setLayout(null);
		
		JComboBox profitMonth = new JComboBox();
		profitMonth.setBounds(256, 11, 116, 22);
		profitPanel.add(profitMonth);
		
		JLabel lblProfitMonth = new JLabel("Month:");
		lblProfitMonth.setBounds(206, 15, 40, 14);
		profitPanel.add(lblProfitMonth);
		
		JScrollPane proftViewer = new JScrollPane();
		proftViewer.setBounds(10, 44, 362, 121);
		profitPanel.add(proftViewer);
		
		JTextArea profitText = new JTextArea();
		proftViewer.setViewportView(profitText);
		
		JPanel debtLogPanel = new JPanel();
		debtLogPanel.setBorder(new TitledBorder(null, "Debt Log", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		debtLogPanel.setBounds(402, 11, 304, 420);
		financeTab.add(debtLogPanel);
		debtLogPanel.setLayout(null);
		
		JComboBox debtMonth = new JComboBox();
		debtMonth.setBounds(178, 11, 116, 22);
		debtLogPanel.add(debtMonth);
		
		JScrollPane debtMonthViewer = new JScrollPane();
		debtMonthViewer.setBounds(10, 44, 284, 218);
		debtLogPanel.add(debtMonthViewer);
		
		JTextArea debtMonthText = new JTextArea();
		debtMonthViewer.setViewportView(debtMonthText);
		
		JLabel lblExpenseType = new JLabel("Expense Type:");
		lblExpenseType.setBounds(20, 277, 88, 14);
		debtLogPanel.add(lblExpenseType);
		
		JComboBox expenseType = new JComboBox();
		expenseType.setBounds(118, 273, 176, 22);
		debtLogPanel.add(expenseType);
		
		expenseAmount = new JTextField();
		expenseAmount.setBounds(118, 309, 176, 20);
		debtLogPanel.add(expenseAmount);
		expenseAmount.setColumns(10);
		
		JButton cancelDebt = new JButton("Cancel");
		cancelDebt.setBounds(217, 379, 77, 23);
		debtLogPanel.add(cancelDebt);
		
		JButton submitDebt = new JButton("Submit");
		submitDebt.setBounds(118, 379, 77, 23);
		debtLogPanel.add(submitDebt);
		
		JLabel lblDueDate = new JLabel("Due Date:");
		lblDueDate.setBounds(20, 344, 78, 14);
		debtLogPanel.add(lblDueDate);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setBounds(20, 312, 78, 14);
		debtLogPanel.add(lblAmount);
		
		dueDate = new JTextField();
		dueDate.setBounds(118, 340, 176, 20);
		debtLogPanel.add(dueDate);
		dueDate.setColumns(10);
		
		JPanel incomePanel = new JPanel();
		incomePanel.setBorder(new TitledBorder(null, "Income", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		incomePanel.setBounds(10, 198, 382, 233);
		financeTab.add(incomePanel);
		incomePanel.setLayout(null);
		
		JComboBox incomeMonth = new JComboBox();
		incomeMonth.setBounds(256, 11, 116, 22);
		incomePanel.add(incomeMonth);
		
		JLabel lblIncomeMonth = new JLabel("Month:");
		lblIncomeMonth.setBounds(204, 15, 42, 14);
		incomePanel.add(lblIncomeMonth);
		
		JScrollPane incomeRevenueViewer = new JScrollPane();
		incomeRevenueViewer.setBounds(10, 67, 168, 155);
		incomePanel.add(incomeRevenueViewer);
		
		JTextArea incomeRevenueText = new JTextArea();
		incomeRevenueViewer.setViewportView(incomeRevenueText);
		
		JScrollPane incomeExpenseViewer = new JScrollPane();
		incomeExpenseViewer.setBounds(204, 67, 168, 155);
		incomePanel.add(incomeExpenseViewer);
		
		JTextArea incomeExpeneseText = new JTextArea();
		incomeExpenseViewer.setViewportView(incomeExpeneseText);
		
		JLabel lblRevenue = new JLabel("Revenue");
		lblRevenue.setBounds(10, 42, 46, 14);
		incomePanel.add(lblRevenue);
		
		JLabel lblExpenses = new JLabel("Expenses");
		lblExpenses.setBounds(204, 40, 46, 14);
		incomePanel.add(lblExpenses);
		
		JPanel coachManageTab = new JPanel();
		accountTabs.addTab("Manage Coach", null, coachManageTab, null);
		coachManageTab.setLayout(null);
		
		JScrollPane coachSchedView = new JScrollPane();
		coachSchedView.setBounds(121, 11, 587, 415);
		coachManageTab.add(coachSchedView);
		
		table = new JTable();
		coachSchedView.setViewportView(table);
		
		JPanel coachSchedControls = new JPanel();
		coachSchedControls.setBorder(new TitledBorder(null, "Controls", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		coachSchedControls.setBounds(10, 11, 101, 415);
		coachManageTab.add(coachSchedControls);
		coachSchedControls.setLayout(null);
		
		JButton schedSubmit = new JButton("Submit");
		schedSubmit.setBounds(10, 37, 81, 23);
		coachSchedControls.add(schedSubmit);
		
		JButton schedCancel = new JButton("Cancel");
		schedCancel.setBounds(10, 71, 81, 23);
		coachSchedControls.add(schedCancel);
		
		JPanel accountInbox = new JPanel();
		accountTabs.addTab("Inbox", null, accountInbox, null);
		accountInbox.setLayout(new BorderLayout(0, 0));
		
		JScrollPane accountInboxView = new JScrollPane();
		accountInbox.add(accountInboxView, BorderLayout.CENTER);
		
		JTextArea accountInboxText = new JTextArea();
		accountInboxView.setViewportView(accountInboxText);
	}
	class logoutListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JFrame loWindow = new LoginUI();
			loWindow.setVisible(true);
			setVisible(false);
		}
	}
}
