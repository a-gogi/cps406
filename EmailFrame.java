
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class EmailFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmailFrame() {
		setTitle("Email");
		setSize(450,300);
		JTextArea txtEmail = new JTextArea();
		getContentPane().add(txtEmail, BorderLayout.CENTER);
		
		JPanel panelButtons = new JPanel();
		getContentPane().add(panelButtons, BorderLayout.SOUTH);
		panelButtons.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btnSend = new JButton("Send");
		panelButtons.add(btnSend);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new ManagerHomeScreenFrame();
				frame.setVisible(true);
				dispose();
			}
		});
		panelButtons.add(btnExit);
	}

}
