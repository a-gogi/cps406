import javax.swing.JFrame;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class ManagerHomeScreenFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ManagerHomeScreenFrame() {
		setTitle("Home");
		setSize(450,300);
		getContentPane().setLayout(new GridLayout(4, 5, 0, 0));
		
		JButton btnIncomeStatement = new JButton("Income Statement");
		btnIncomeStatement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					JFrame frame = new IncomeStatementFrame();
					frame.setVisible(true);
					dispose();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		getContentPane().add(btnIncomeStatement);
		
		JButton btnMemberList = new JButton("Member List");
		btnMemberList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = null;
				try {
					frame = new MemberListFrame();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				frame.setVisible(true);
				dispose();
			}
		});
		getContentPane().add(btnMemberList);
		
		JButton btnEmailMembers = new JButton("Email Members");
		btnEmailMembers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new EmailFrame();
				frame.setVisible(true);
				dispose();
			}
		});
		getContentPane().add(btnEmailMembers);
		
		JButton btnLogOut = new JButton("Log out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new LoginScreenFrame();
				frame.setVisible(true);
				dispose();
			}
		});
		getContentPane().add(btnLogOut);
	}

}
