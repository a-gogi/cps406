import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManagerLoginFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtUsername;
	private JTextField txtpassword;
	private JLabel lblLoginError;
	private JButton btnLogin;
	private JButton btnCancel;
	private JLabel lblPassword;
	private JPanel panel;
	private JLabel lblUsername;
	private Admins adminLogins;
	
	public ManagerLoginFrame() {
		setTitle("Manager Login");
		setSize(400,300);
		JLabel lblManagerLogin = new JLabel("Manager Login");
		lblManagerLogin.setFont(new Font("Arial", Font.PLAIN, 20));
		getContentPane().add(lblManagerLogin, BorderLayout.NORTH);
		
		createLogin();
		
	}
	private void createLogin()
	{
		panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Arial", Font.PLAIN, 16));
		GridBagConstraints gbc_lblUsername = new GridBagConstraints();
		gbc_lblUsername.anchor = GridBagConstraints.EAST;
		gbc_lblUsername.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsername.gridx = 3;
		gbc_lblUsername.gridy = 2;
		panel.add(lblUsername, gbc_lblUsername);
		
		txtUsername = new JTextField();
		GridBagConstraints gbc_txtUsername = new GridBagConstraints();
		gbc_txtUsername.anchor = GridBagConstraints.WEST;
		gbc_txtUsername.insets = new Insets(0, 0, 5, 0);
		gbc_txtUsername.gridx = 4;
		gbc_txtUsername.gridy = 2;
		panel.add(txtUsername, gbc_txtUsername);
		txtUsername.setColumns(10);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 17));
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.anchor = GridBagConstraints.EAST;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 3;
		gbc_lblPassword.gridy = 4;
		panel.add(lblPassword, gbc_lblPassword);
		
		txtpassword = new JTextField();
		GridBagConstraints gbc_txtpassword = new GridBagConstraints();
		gbc_txtpassword.anchor = GridBagConstraints.WEST;
		gbc_txtpassword.insets = new Insets(0, 0, 5, 0);
		gbc_txtpassword.gridx = 4;
		gbc_txtpassword.gridy = 4;
		panel.add(txtpassword, gbc_txtpassword);
		txtpassword.setColumns(10);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame frame = new ManagerHomeScreenFrame();
				frame.setVisible(true);
				dispose();
			}
		});
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.insets = new Insets(0, 0, 5, 0);
		gbc_btnLogin.anchor = GridBagConstraints.WEST;
		gbc_btnLogin.gridx = 4;
		gbc_btnLogin.gridy = 6;
		panel.add(btnLogin, gbc_btnLogin);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new LoginScreenFrame();
				frame.setVisible(true);
				dispose();
			}
		});
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.anchor = GridBagConstraints.WEST;
		gbc_btnCancel.gridx = 4;
		gbc_btnCancel.gridy = 7;
		panel.add(btnCancel, gbc_btnCancel);
		
		lblLoginError = new JLabel();
		lblLoginError.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblLoginError = new GridBagConstraints();
		gbc_lblLoginError.anchor = GridBagConstraints.WEST;
		gbc_lblLoginError.fill = GridBagConstraints.NONE;
		gbc_lblLoginError.insets = new Insets(0, 0, 0, 0);
		gbc_lblLoginError.gridwidth = 2;
		gbc_lblLoginError.gridx = 3;
		gbc_lblLoginError.gridy = 1;
		panel.add(lblLoginError, gbc_lblLoginError);
	}
}
