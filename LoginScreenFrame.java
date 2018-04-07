import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginScreenFrame extends JFrame {
	public LoginScreenFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setSize(450, 300);
		setTitle("Login");
		createMemberLogin();
		createManagerLogin();
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Arial", Font.PLAIN, 20));
		lblLogin.setBounds(168, 11, 98, 30);
		getContentPane().add(lblLogin);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private void createMemberLogin()
	{
		JButton btnMemberLogin = new JButton("Member Login");
		btnMemberLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent buttonClicked) {
				JFrame frame = new MemberLoginFrame();
				frame.setVisible(true);
				dispose();
			}
		});
		btnMemberLogin.setBounds(138, 79, 148, 48);
		getContentPane().add(btnMemberLogin);
	}
	private void createManagerLogin()
	{
		JButton btnManagerLogin = new JButton("Manager Login");
		btnManagerLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new ManagerLoginFrame();
				frame.setVisible(true);
				dispose();
			}
		});
		btnManagerLogin.setBounds(139, 138, 147, 48);
		getContentPane().add(btnManagerLogin);
	}
}
