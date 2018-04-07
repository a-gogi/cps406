import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class MemberListFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea txtMemberList;
	private Members memberlist;

	public MemberListFrame() throws IOException {
		setTitle("Member List");
		setSize(500,300);
		txtMemberList = new JTextArea();
		txtMemberList.setEditable(false);
		JScrollPane scroll = new JScrollPane(txtMemberList, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
		getContentPane().add(scroll, BorderLayout.CENTER);
		addMemberList();
		createSortPanel();

	}

	private void addMemberList() throws IOException {
		memberlist = new Members();

		for ( int i = 0; i < memberlist.getMembers().size(); i++ ) {
			Member m = memberlist.getMembers().get(i);
			txtMemberList.append(m.print());
			txtMemberList.append("\n");
		}
	}

	private void updateMemberList(Members memberlist) {
		for ( int i = 0; i < memberlist.getMembers().size(); i++ ) {
			Member m = memberlist.getMembers().get(i);
			txtMemberList.append(m.print());
			txtMemberList.append("\n");
		}
	}

	private void createSortPanel()
	{
		JPanel panelSort = new JPanel();
		getContentPane().add(panelSort, BorderLayout.SOUTH);
		panelSort.setLayout(new GridLayout(1, 0, 0, 0));

		JButton btnSortByFirst = new JButton("Sort by First Name");
		btnSortByFirst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMemberList.setText("");
				SortMember sm = new SortMember();
				memberlist.setMembers(sm.sortByFirstName(memberlist.getMembers()));
				updateMemberList(memberlist);
			}
		});
		panelSort.add(btnSortByFirst);

		JButton btnSortByLast = new JButton("Sort by Last Name");
		btnSortByLast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMemberList.setText("");
				SortMember sm = new SortMember();
				memberlist.setMembers(sm.sortByLastName(memberlist.getMembers()));
				updateMemberList(memberlist);
			}
		});
		panelSort.add(btnSortByLast);

		JButton btnSortByAttendance = new JButton("Sort by Attendance");
		panelSort.add(btnSortByAttendance);

		JButton btnSortByPayment = new JButton("Sort by Payment");
		panelSort.add(btnSortByPayment);

		JPanel panelEditList = new JPanel();
		getContentPane().add(panelEditList, BorderLayout.WEST);
		panelEditList.setLayout(new GridLayout(0, 1, 0, 0));

		JButton btnAddMember = new JButton("Add Member");
		panelEditList.add(btnAddMember);

		JButton btnRemoveMember = new JButton("Remove Member");
		panelEditList.add(btnRemoveMember);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new ManagerHomeScreenFrame();
				frame.setVisible(true);
				dispose();
			}
		});
		panelEditList.add(btnExit);

	}

}
