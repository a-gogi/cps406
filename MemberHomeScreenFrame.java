import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberHomeScreenFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MemberHomeScreenFrame() {
		setTitle("Home Screen");
		setSize(450,300);
		getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		createHomeScreen();	
	}
	private void createHomeScreen()
	{
		JButton btnMembershipStatus = new JButton("Membership status");
		getContentPane().add(btnMembershipStatus);
		
		JButton btnPractices = new JButton("Practices");
		getContentPane().add(btnPractices);
		
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
