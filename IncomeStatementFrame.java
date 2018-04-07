
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IncomeStatementFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IncomeStatement income;
	private JTextArea txtIncomeStatement;
	public IncomeStatementFrame() throws FileNotFoundException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Income Statement");
		setSize(731,350);
		income = new IncomeStatement();
		txtIncomeStatement = new JTextArea();
		getContentPane().add(txtIncomeStatement, BorderLayout.CENTER);
		txtIncomeStatement.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		createPanelTime();
		createPanelMonths();
		loadExpensesAndRevenue();
	}
	
	private void createPanelTime()
	{
		JPanel panelIncomeType = new JPanel();
		getContentPane().add(panelIncomeType, BorderLayout.WEST);
		panelIncomeType.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnCurrentMonthsIncome = new JButton("Current Month");
		btnCurrentMonthsIncome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Calendar c = Calendar.getInstance();
				String month = c.getDisplayName(Calendar.MONTH, Calendar.LONG_FORMAT, Locale.CANADA);
				txtIncomeStatement.setText("");
				txtIncomeStatement.setText(income.print(month));
			}
		});
		panelIncomeType.add(btnCurrentMonthsIncome);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtIncomeStatement.setText("");
				txtIncomeStatement.setText(income.print());
			}
		});
		panelIncomeType.add(btnTotal);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					BufferedWriter out = new BufferedWriter(new FileWriter("Data/Revenue"));
					ArrayList<Payables> revenueFinal = income.getRevenueList();
					ArrayList<Payables> expenseFinal = income.getExpenseList();
					for (int i = 0; i < revenueFinal.size(); i++)
					{
						Payables x = revenueFinal.get(i);
						String y = x.getName() + " " + x.getAmount() + " " + x.getMonthAndYear();
						out.write(y);
						if (i < revenueFinal.size()-1)
							out.newLine();
					}
					out.close();
					out = new BufferedWriter(new FileWriter("Data/Expenses"));
					for (int i = 0; i < expenseFinal.size(); i++)
					{
						Payables x = expenseFinal.get(i);
						String y = x.getName() + " " + x.getAmount() + " " + x.getMonthAndYear();
						out.write(y);
						if (i < expenseFinal.size()-1)
							out.newLine();
					}
					out.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JFrame frame = new ManagerHomeScreenFrame();
				frame.setVisible(true);
				dispose();
			}
		});
		panelIncomeType.add(btnExit);
		
		JLabel lblIncomeStatement = new JLabel("Income Statement");
		lblIncomeStatement.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblIncomeStatement, BorderLayout.NORTH);
		
	}
	private void createPanelMonths()
	{
		JPanel panelByMonths = new JPanel();
		getContentPane().add(panelByMonths, BorderLayout.SOUTH);
		panelByMonths.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnJan = new JButton("Jan");
		btnJan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtIncomeStatement.setText("");
				txtIncomeStatement.setText(income.print("January"));
			}
		});
		panelByMonths.add(btnJan);
		
		JButton btnFeb = new JButton("Feb");
		btnFeb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtIncomeStatement.setText("");
				txtIncomeStatement.setText(income.print("February"));
			}
		});
		panelByMonths.add(btnFeb);
		
		JButton btnMar = new JButton("Mar");
		btnMar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtIncomeStatement.setText("");
				txtIncomeStatement.setText(income.print("March"));
			}
		});
		panelByMonths.add(btnMar);
		
		JButton btnApr = new JButton("Apr");
		btnApr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtIncomeStatement.setText("");
				txtIncomeStatement.setText(income.print("April"));
			}
		});
		panelByMonths.add(btnApr);
		
		JButton btnMay = new JButton("May");
		btnMay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtIncomeStatement.setText("");
				txtIncomeStatement.setText(income.print("May"));
			}
		});
		panelByMonths.add(btnMay);
		
		JButton btnJun = new JButton("Jun");
		btnJun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtIncomeStatement.setText("");
				txtIncomeStatement.setText(income.print("June"));
			}
		});
		panelByMonths.add(btnJun);
		
		JButton btnJul = new JButton("Jul");
		btnJul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtIncomeStatement.setText("");
				txtIncomeStatement.setText(income.print("July"));
			}
		});
		panelByMonths.add(btnJul);
		
		JButton btnAug = new JButton("Aug");
		btnAug.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtIncomeStatement.setText("");
				txtIncomeStatement.setText(income.print("August"));
			}
		});
		panelByMonths.add(btnAug);
		
		JButton btnSep = new JButton("Sep");
		btnSep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtIncomeStatement.setText("");
				txtIncomeStatement.setText(income.print("September"));
			}
		});
		panelByMonths.add(btnSep);
		
		JButton btnOct = new JButton("Oct");
		btnOct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtIncomeStatement.setText("");
				txtIncomeStatement.setText(income.print("October"));
			}
		});
		panelByMonths.add(btnOct);
		
		JButton btnNov = new JButton("Nov");
		btnNov.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtIncomeStatement.setText("");
				txtIncomeStatement.setText(income.print("November"));
			}
		});
		panelByMonths.add(btnNov);
		
		JButton btnDec = new JButton("Dec");
		btnDec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtIncomeStatement.setText("");
				txtIncomeStatement.setText(income.print("December"));
			}
		});
		panelByMonths.add(btnDec);
	}
	private void loadExpensesAndRevenue() throws FileNotFoundException
	{
		income = new IncomeStatement();
		
	}
}
